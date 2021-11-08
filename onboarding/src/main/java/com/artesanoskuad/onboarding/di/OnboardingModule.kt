package com.artesanoskuad.onboarding.di

import androidx.lifecycle.MutableLiveData
import com.artesanoskuad.onboarding.data.local.LocalOnboardingRepository
import com.artesanoskuad.onboarding.domain.InSeenCheckUseCase
import com.artesanoskuad.onboarding.domain.ObtainOnboardingStepsUseCase
import com.artesanoskuad.onboarding.domain.OnboardingRepository
import com.artesanoskuad.onboarding.presentation.OnboardingViewModel
import com.artesanoskuad.onboarding.presentation.OnboardingViewState
import com.artesanoskuad.onboarding.ui.OnboardingNavigator
import com.artesanoskuad.onboarding.ui.OnboardingStepPagerAdapter
import com.artesanoskuad.onboarding.ui.OnboardingUiNavigator
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val onboardingDefaultModule = module {
    viewModel {
        OnboardingViewModel()
    }

    factory { ObtainOnboardingStepsUseCase(onboardingRepository = get()) }
    factory { InSeenCheckUseCase(onboardingRepository = get()) }

    factory<OnboardingRepository> {
        LocalOnboardingRepository(context = get())
    }

    factory { MutableLiveData<OnboardingViewState>() }

    single { OnboardingStepPagerAdapter() }

    factory<OnboardingNavigator> { OnboardingUiNavigator() }
}
