package com.artesanoskuad.onboarding.domain

import kotlinx.coroutines.flow.Flow

interface OnboardingRepository {
    suspend fun getOnboardingInfo(): Flow<OnboardingInfo>
    fun inSeenCheck(): Boolean
}
