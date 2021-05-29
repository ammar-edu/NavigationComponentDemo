package com.s95ammar.navigationcomponentdemo

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController

class FragmentC : Fragment(R.layout.fragment_c) {

    private val viewModel: ViewModelC by viewModels {
        ViewModelC.Factory("this is some value")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val navigateToButton: Button = requireView().findViewById(R.id.navigate_to_button)
        navigateToButton.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentC_to_fragmentD)
        }

        viewModel.logSomeString()

    }

}