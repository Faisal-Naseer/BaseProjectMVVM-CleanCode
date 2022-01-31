package com.baseproject.basemvvmmultimodule

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.IntentCompat

import android.content.Intent
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.delay


class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val splashScreen = installSplashScreen()
        super.onCreate(savedInstanceState)
        splashScreen.setKeepOnScreenCondition { true }
        lifecycleScope.launchWhenCreated {
            delay(2000)
            gotoHomeActivity()
        }

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