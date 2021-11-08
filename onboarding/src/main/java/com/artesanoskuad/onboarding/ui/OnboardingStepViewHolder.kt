package com.artesanoskuad.onboarding.ui

import androidx.recyclerview.widget.RecyclerView
import com.artesanoskuad.onboarding.databinding.ItemOnboardingBinding
import com.artesanoskuad.onboarding.domain.OnboardingStep

class OnboardingStepViewHolder(
    private val onboardingBinding: ItemOnboardingBinding
) : RecyclerView.ViewHolder(onboardingBinding.root) {

    fun bind(onboardingStep: OnboardingStep){
        with(onboardingBinding){
            ivStepOnboarding.setImageResource(onboardingStep.defaultRes)
            tvStepTitle.text = onboardingStep.title
            tvStepSubtitle.text = onboardingStep.description
        }
    }

}