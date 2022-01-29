package com.baseproject.basemvvmmultimodule

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.IntentCompat

import android.content.Intent




class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        gotoHomeActivity()
    }

    private fun gotoHomeActivity() {
        val intent = HomeActivity.getIntent()
        intent.let {
            it!!.setClass(SplashActivity@this,HomeActivity::class.java)
            it!!.flags =
                Intent.FLAG_ACTIVITY_NEW_TASK or
                        Intent.FLAG_ACTIVITY_CLEAR_TASK

            startActivity(it)
        }


    }
}