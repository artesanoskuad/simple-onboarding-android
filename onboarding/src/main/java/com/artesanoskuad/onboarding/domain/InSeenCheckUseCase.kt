package com.artesanoskuad.onboarding.domain

class InSeenCheckUseCase(
    private val onboardingRepository: OnboardingRepository
) {
    fun execute() = onboardingRepository.inSeenCheck()
}