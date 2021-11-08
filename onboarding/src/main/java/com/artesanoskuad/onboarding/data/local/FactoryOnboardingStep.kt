package com.artesanoskuad.onboarding.data.local

import com.artesanoskuad.onboarding.domain.OnboardingStep

object FactoryOnboardingStep {
    fun createOnboardingStep(resValue: Int, title: String, message: String) =
        OnboardingStep(resValue.toString(), "", resValue, title, message)
}