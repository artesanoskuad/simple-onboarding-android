package com.artesanoskuad.onboarding.presentation

import com.artesanoskuad.onboarding.domain.OnboardingInfo

sealed class OnboardingViewState {
    data class ShowOnboardingViewState(val onboardingInfo: OnboardingInfo) : OnboardingViewState()
}
