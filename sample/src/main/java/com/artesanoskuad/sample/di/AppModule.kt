package com.artesanoskuad.sample.di

import com.artesanoskuad.onboarding.data.local.OnboardingInfoStep
import com.artesanoskuad.sample.onboarding.SampleOnboardingInfoStep
import org.koin.dsl.module

val appModule = module {
    single<OnboardingInfoStep> {
        SampleOnboardingInfoStep()
    }
}