package com.artesanoskuad.onboarding.extensions

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import androidx.navigation.NavOptionsBuilder
import com.artesanoskuad.onboarding.R


fun ViewGroup.inflate(layoutResId: Int, attachRoot: Boolean): View {

    val inflater = LayoutInflater.from(context)
    return inflater.inflate(layoutResId, this, attachRoot)
}

fun View.hideKeyboard(onFocused: (() -> Unit)? = null) {
    val imm = this.context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager

    if(this is Button){
        setOnClickListener{view ->
            imm.hideSoftInputFromWindow(view.windowToken, 0)
            onFocused?.invoke()
        }
    }else{
        setOnFocusChangeListener { view, focused ->
            if (focused) {
                imm.hideSoftInputFromWindow(view.windowToken, 0)
                onFocused?.invoke()
            }
        }
    }
}

fun NavOptionsBuilder.withDefaultAnimations() = anim {
    enter = R.anim.nav_default_enter_anim
    exit = R.anim.nav_default_exit_anim
    popEnter = R.anim.nav_default_pop_enter_anim
    popExit = R.anim.nav_default_pop_exit_anim
}
