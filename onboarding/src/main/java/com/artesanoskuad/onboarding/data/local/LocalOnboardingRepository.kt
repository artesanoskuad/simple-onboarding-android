package com.artesanoskuad.onboarding.data.local

import android.content.Context
import android.content.SharedPreferences
import androidx.annotation.VisibleForTesting
import com.artesanoskuad.onboarding.domain.OnboardingInfo
import com.artesanoskuad.onboarding.domain.OnboardingRepository
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class LocalOnboardingRepository : OnboardingRepository, KoinComponent {

    companion object {
        const val VISTO_CHECK = "visto_check"
    }

    private val preferences: SharedPreferences
    private var dispacher: CoroutineDispatcher = Dispatchers.IO
    private val onboardingInfoStep: OnboardingInfoStep by inject()

    constructor(context: Context) {
        preferences = context.getSharedPreferences(
            "feature.onboarding",
            Context.MODE_PRIVATE
        )
    }

    @VisibleForTesting
    internal constructor(pref: SharedPreferences, dispacher: CoroutineDispatcher) {
        this.preferences = pref
        this.dispacher = dispacher
    }

    override fun inSeenCheck(): Boolean {
        return preferences.getBoolean(VISTO_CHECK, true).apply {
            if (this) {
                preferences.edit().putBoolean(VISTO_CHECK, false).apply()
            }
        }
    }

    override suspend fun getOnboardingInfo(): Flow<OnboardingInfo> {
        return flow {
            emit(
                onboardingInfoStep.get()
            )
        }.flowOn(dispacher)
    }
}
