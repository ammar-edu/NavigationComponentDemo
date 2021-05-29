package com.s95ammar.navigationcomponentdemo

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class FragmentD : Fragment(R.layout.fragment_d) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val navigateToButton: Button = requireView().findViewById(R.id.navigate_to_button)
        navigateToButton.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentD_to_fragmentE)
        }
    }

}