package com.artesanoskuad.onboarding.data.local

import com.artesanoskuad.onboarding.domain.OnboardingInfo

interface OnboardingInfoStep {
    fun get(): OnboardingInfo
}
