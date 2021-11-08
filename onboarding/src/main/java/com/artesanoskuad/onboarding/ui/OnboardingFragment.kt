package com.artesanoskuad.onboarding.ui

import android.os.Bundle
import android.view.View
import androidx.core.net.toUri
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.navOptions
import com.artesanoskuad.onboarding.R
import com.artesanoskuad.onboarding.databinding.FragmentOnboardingBinding
import com.artesanoskuad.onboarding.domain.OnboardingInfo
import com.artesanoskuad.onboarding.extensions.withDefaultAnimations
import com.artesanoskuad.onboarding.presentation.OnboardingViewModel
import com.artesanoskuad.onboarding.presentation.OnboardingViewState
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class OnboardingFragment : Fragment(R.layout.fragment_onboarding), KoinComponent {

    private val onboardingViewModel: OnboardingViewModel by viewModel()
    private val onboardingStepPagerAdapter: OnboardingStepPagerAdapter by inject()
    private val onboardignNavigator: OnboardingNavigator by inject()
    private lateinit var binding: FragmentOnboardingBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentOnboardingBinding.bind(view)
        setupViewPagerAndSkipButton()
        subscribeViewModel()
    }

    private fun setupViewPagerAndSkipButton() {
        with(binding) {
            stepViewPager.adapter = onboardingStepPagerAdapter
            dotsIndicator.setViewPager2(stepViewPager)
            tvSkip.setOnClickListener {
                onboardignNavigator.goToHome()
            }
        }
        onboardignNavigator.init(this)
    }

    private fun goToHomeFragment() {
        val HOME_SCREEN_URI = "tbkapp://home".toUri()
        findNavController().navigate(
            HOME_SCREEN_URI,
            navOptions { withDefaultAnimations() }
        )
    }

    private fun subscribeViewModel() {
        onboardingViewModel.state.observe(viewLifecycleOwner, { renderUI(it) })
        onboardingViewModel.checkOnboardingView()
    }

    private fun renderUI(onboardingViewState: OnboardingViewState?) {
        onboardingViewState?.let { safeOnboardingViewState ->
            when (safeOnboardingViewState) {
                is OnboardingViewState.ShowOnboardingViewState -> showOnboarding(
                    safeOnboardingViewState.onboardingInfo
                )
            }
        }
    }

    private fun showOnboarding(onboardingInfo: OnboardingInfo) {
        with(binding) {
            imageViewIcon.setImageResource(onboardingInfo.icon)
            tvSkip.text = onboardingInfo.skipMessage
            setupSkipButton(
                onboardingInfo.skipMessage,
                onboardingInfo.finalSkipMessage,
                onboardingInfo.steps.size
            )
        }
        onboardingStepPagerAdapter.setValues(onboardingInfo.steps)
    }

    private fun setupSkipButton(skipMessage: String, finalSkipMessage: String, stepsNumber: Int) {
        with(binding) {
            stepViewPager.registerOnPageChangeCallback(
                OnboardingOnPageChangeCallback(tvSkip, skipMessage, finalSkipMessage, stepsNumber)
            )
        }
    }
}
