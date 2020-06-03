package com.ptzkg.mealsapi.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.ptzkg.mealsapi.R
import kotlinx.android.synthetic.main.fragment_main.*

class MainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnSearch.visibility = View.GONE
        btnCategories.visibility = View.GONE
        btnFilterArea.visibility = View.GONE
        btnFilterCategory.visibility = View.GONE
        btnFilterIngredient.visibility = View.GONE

        btnSearch.setOnClickListener {
            view.findNavController().navigate(R.id.action_mainFragment_to_searchFragment)
        }

        btnRandom.setOnClickListener {
            view.findNavController().navigate(R.id.action_mainFragment_to_randomFragment)
        }
    }
}