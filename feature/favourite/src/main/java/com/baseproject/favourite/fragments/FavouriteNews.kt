package com.baseproject.favourite.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.baseproject.favourite.R

class FavouriteNews : Fragment(R.layout.fragment_favourite_news) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }


    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            FavouriteNews().apply {
            }
    }
}