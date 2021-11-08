package com.artesanoskuad.onboarding.ui

import com.artesanoskuad.onboarding.ui.OnboardingFragment

interface OnboardingNavigator {
    fun init(onboardingFragment: OnboardingFragment)
    fun goToHome()
}