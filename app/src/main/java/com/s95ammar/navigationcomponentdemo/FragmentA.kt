package com.s95ammar.navigationcomponentdemo

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class FragmentA : Fragment(R.layout.fragment_a) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val navigateToButton: Button = requireView().findViewById(R.id.navigate_to_button)
        navigateToButton.setOnClickListener {
            val bundle = bundleOf(Constants.KEY_NAME to "Vlad")
//            findNavController().navigate(R.id.action_fragmentA_to_fragmentB)

            val navDir = FragmentADirections.actionFragmentAToFragmentB("Vlad")
            findNavController().navigate(navDir)
        }
    }
}