package com.artesanoskuad.onboarding.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.artesanoskuad.onboarding.databinding.ItemOnboardingBinding
import com.artesanoskuad.onboarding.domain.OnboardingStep

class OnboardingStepPagerAdapter : RecyclerView.Adapter<OnboardingStepViewHolder>() {

    private var onboardingSteps: List<OnboardingStep> = emptyList()

    fun setValues(list: List<OnboardingStep>) {
        this.onboardingSteps = list
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OnboardingStepViewHolder {
        val binding = ItemOnboardingBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return OnboardingStepViewHolder(binding)
    }

    override fun onBindViewHolder(holder: OnboardingStepViewHolder, position: Int) {
        holder.bind(onboardingSteps[position])
    }

    override fun getItemCount() = onboardingSteps.size
}
