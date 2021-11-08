package com.artesanoskuad.onboarding.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.artesanoskuad.onboarding.domain.ObtainOnboardingStepsUseCase
import com.artesanoskuad.onboarding.domain.OnboardingInfo
import com.artesanoskuad.onboarding.presentation.OnboardingViewState.ShowOnboardingViewState
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject


class OnboardingViewModel : ViewModel(), KoinComponent {

    private val obtainOnboardingStepsUseCase: ObtainOnboardingStepsUseCase by inject()
    private val onboardingViewState: MutableLiveData<OnboardingViewState> by inject()

    val state: LiveData<OnboardingViewState> get() = onboardingViewState

    fun checkOnboardingView() {
        viewModelScope.launch {
            obtainOnboardingList()
        }
    }

    private suspend fun obtainOnboardingList() {
        obtainOnboardingStepsUseCase.execute().collect {onboardingInfo ->
            onboardingShowOnboardingViewState(onboardingInfo)
        }
    }

    private fun onboardingShowOnboardingViewState(onboardingInfo: OnboardingInfo) {
        onboardingViewState.value = ShowOnboardingViewState(onboardingInfo)
    }

}