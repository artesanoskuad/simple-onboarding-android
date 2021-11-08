package com.artesanoskuad.onboarding.ui

import androidx.core.net.toUri
import androidx.navigation.fragment.NavHostFragment.findNavController
import androidx.navigation.navOptions
import com.artesanoskuad.onboarding.extensions.withDefaultAnimations

class OnboardingUiNavigator : OnboardingNavigator {

    //
    lateinit var onboardingFragment: OnboardingFragment

    override fun init(onboardingFragment: OnboardingFragment){
        this.onboardingFragment = onboardingFragment
    }

    override fun goToHome() {
        val HOME_SCREEN_URI = "blueprint://home".toUri()
        findNavController(onboardingFragment).navigate(HOME_SCREEN_URI,
            navOptions { withDefaultAnimations() }
        )
    }
}