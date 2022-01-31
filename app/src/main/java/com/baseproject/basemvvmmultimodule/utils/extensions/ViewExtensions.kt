package com.baseproject.basemvvmmultimodule.utils.extensions

import android.content.Context
import android.util.Log
import android.view.View
import android.widget.Toast

fun View.hide(){
    visibility=View.GONE
}

fun View.show(){
    visibility = View.VISIBLE
}

fun Context.toast(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}

fun Context.log(message: String) {
    Log.i("IMP_INFO", message)
}
