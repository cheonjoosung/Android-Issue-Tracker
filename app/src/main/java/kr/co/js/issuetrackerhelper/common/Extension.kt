package kr.co.js.issuetrackerhelper.common

import android.view.View

fun View.click(action: (v: View) -> Unit) {
    val listener = View.OnClickListener { action(it) }
    setOnClickListener(listener)
}