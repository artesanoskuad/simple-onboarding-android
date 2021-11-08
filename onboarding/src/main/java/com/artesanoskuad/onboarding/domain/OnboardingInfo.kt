package com.artesanoskuad.onboarding.domain

data class OnboardingInfo(
    val icon: Int,
    val skipMessage: String,
    val finalSkipMessage: String,
    val steps: List<OnboardingStep>
)