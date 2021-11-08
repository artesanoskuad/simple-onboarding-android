package com.artesanoskuad.onboarding.domain

class ObtainOnboardingStepsUseCase(
    private val onboardingRepository: OnboardingRepository
) {
    suspend fun execute() = onboardingRepository.getOnboardingInfo()
}