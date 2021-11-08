package com.artesanoskuad.sample.onboarding

import com.artesanoskuad.onboarding.R
import com.artesanoskuad.onboarding.data.local.FactoryOnboardingStep
import com.artesanoskuad.onboarding.data.local.OnboardingInfoStep
import com.artesanoskuad.onboarding.domain.OnboardingInfo
import com.artesanoskuad.onboarding.domain.OnboardingStep

class SampleOnboardingInfoStep : OnboardingInfoStep {

    private val listResources: List<OnboardingStep> =
        listOf(
            FactoryOnboardingStep.createOnboardingStep(
                R.mipmap.ic_launcher,
                "Bienvenido",
                "Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit."
            ),
            FactoryOnboardingStep.createOnboardingStep(
                R.mipmap.ic_launcher,
                "Step 2",
                "Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit."
            ),
            FactoryOnboardingStep.createOnboardingStep(
                R.mipmap.ic_launcher,
                "Step 3",
                "Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit."
            ),
            FactoryOnboardingStep.createOnboardingStep(
                R.mipmap.ic_launcher,
                "Step 4",
                "Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit."
            ),
            FactoryOnboardingStep.createOnboardingStep(
                R.mipmap.ic_launcher,
                "Step 5",
                "Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit."
            ),
            FactoryOnboardingStep.createOnboardingStep(
                R.mipmap.ic_launcher,
                "Step 6",
                "Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit."
            ),
            FactoryOnboardingStep.createOnboardingStep(
                R.mipmap.ic_launcher,
                "Step 7",
                "Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit."
            )
        )

    fun obtainOnboardingInfo() : OnboardingInfo {
        return OnboardingInfo(
            R.mipmap.ic_launcher,
            "Omitir",
            "Listo",
            listResources
        )
    }

    override fun get(): OnboardingInfo {
        return obtainOnboardingInfo()
    }
}