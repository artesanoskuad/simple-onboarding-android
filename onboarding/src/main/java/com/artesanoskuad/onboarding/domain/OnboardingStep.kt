package com.artesanoskuad.onboarding.domain

data class OnboardingStep(
    val id: String,
    val url: String,
    val defaultRes: Int,
    val title: String,
    val description: String
)
