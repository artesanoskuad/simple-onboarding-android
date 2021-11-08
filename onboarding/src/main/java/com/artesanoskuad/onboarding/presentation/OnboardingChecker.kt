package com.artesanoskuad.onboarding.presentation

import com.artesanoskuad.onboarding.domain.InSeenCheckUseCase
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

object OnboardingChecker : KoinComponent {
    val inSeenCheckUseCase: InSeenCheckUseCase by inject()
    fun isSeenOnboardingView() = inSeenCheckUseCase.execute()
}
