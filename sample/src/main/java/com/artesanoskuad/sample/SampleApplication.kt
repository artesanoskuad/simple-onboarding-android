package com.artesanoskuad.sample

import android.app.Application
import com.artesanoskuad.onboarding.di.onboardingDefaultModule
import com.artesanoskuad.sample.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext.startKoin

class SampleApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        initKoin()
    }

    private fun initKoin() {
        startKoin {
            androidLogger()
            androidContext(this@SampleApplication)
            modules(
                listOf(
                    appModule,
                    onboardingDefaultModule
                )
            )
        }
    }
}