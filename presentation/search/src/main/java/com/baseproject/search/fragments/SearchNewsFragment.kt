package com.baseproject.search.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.baseproject.search.R

class SearchNewsFragment : Fragment(R.layout.fragment_search_news) {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            SearchNewsFragment().apply {

            }
    }
}