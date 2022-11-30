package kr.co.js.issuetracker.common

import android.view.View

fun View.click(action: (v: View) -> Unit) {
    val listener = View.OnClickListener { action(it) }
    setOnClickListener(listener)
}