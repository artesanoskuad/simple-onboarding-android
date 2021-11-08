package com.artesanoskuad.onboarding.ui

import android.widget.TextView
import androidx.viewpager2.widget.ViewPager2

class OnboardingOnPageChangeCallback(
    private val textView: TextView,
    private val skipMessage: String,
    private val skipFinalMessage: String,
    private val stepsNumber: Int
) : ViewPager2.OnPageChangeCallback() {

    override fun onPageSelected(position: Int) {
        super.onPageSelected(position)
        val maxPositionSupport = stepsNumber-1
        if(position == maxPositionSupport){
            textView.text = skipFinalMessage
        } else {
            textView.text = skipMessage
        }
    }
}