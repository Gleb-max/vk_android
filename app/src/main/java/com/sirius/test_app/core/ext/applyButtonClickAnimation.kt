package com.sirius.test_app.core.ext

import android.annotation.SuppressLint
import android.view.MotionEvent
import android.view.View
import android.view.animation.AnimationUtils
import com.sirius.test_app.R

@SuppressLint("ClickableViewAccessibility")
fun View.applyButtonClickAnimation() {
    val scaleUp = AnimationUtils.loadAnimation(context, R.anim.scale_up).apply {
        duration = 100
        isFillEnabled = true
        fillAfter = true
    }
    val scaleDown = AnimationUtils.loadAnimation(context, R.anim.scale_down).apply {
        duration = 100
        isFillEnabled = true
        fillAfter = true
    }
    setOnTouchListener { _, event ->
        if (event.action == MotionEvent.ACTION_UP || event.action == MotionEvent.ACTION_CANCEL) {
            startAnimation(scaleUp)
        } else if (event.action == MotionEvent.ACTION_DOWN) {
            startAnimation(scaleDown)
        }
        false
    }
}