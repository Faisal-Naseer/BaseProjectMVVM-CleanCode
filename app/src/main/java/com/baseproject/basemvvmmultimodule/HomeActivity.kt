package com.baseproject.basemvvmmultimodule

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.NavController
import androidx.navigation.dynamicfeatures.fragment.DynamicNavHostFragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeActivity : AppCompatActivity() {
    companion object {
        fun getIntent():Intent? = Intent()
    }
    lateinit var bottomNav : BottomNavigationView
    lateinit var navController : NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        initNavigation()
        initBottomNav()



    }

    private fun initBottomNav() {

        navController.apply {
            bottomNav = findViewById(R.id.bottomNavigationView)
            bottomNav.setupWithNavController(this)
        }

    }

    lateinit var navHostFragment : NavHostFragment
    private fun initNavigation() {
        navHostFragment = supportFragmentManager
            .findFragmentById(R.id.fragmentContainerView) as NavHostFragment
         navController = navHostFragment.navController
    }

}