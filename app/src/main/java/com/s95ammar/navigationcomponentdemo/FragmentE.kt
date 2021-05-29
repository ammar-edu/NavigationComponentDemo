package com.s95ammar.navigationcomponentdemo

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController

class FragmentE : Fragment(R.layout.fragment_e) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val navigateToButton: Button = requireView().findViewById(R.id.navigate_to_button)
        val navigateBackButton: Button = requireView().findViewById(R.id.navigate_back_button)

        navigateToButton.setOnClickListener {
            val navOptions = NavOptions.Builder()
                .setPopUpTo(R.id.fragmentA, true)
                .build()

            findNavController()
                .navigate(R.id.fragmentA, null, navOptions)

//            findNavController().navigate(R.id.action_fragmentE_to_fragmentA)
        }


        navigateBackButton.setOnClickListener {
            findNavController().navigateUp()
        }
    }

}