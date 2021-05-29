package com.s95ammar.navigationcomponentdemo

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs

class FragmentB : Fragment(R.layout.fragment_b) {

    val args: FragmentBArgs by navArgs()

    val viewModel: ViewModelB by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val navigateToButton: Button = requireView().findViewById(R.id.navigate_to_button)
        val nameTextView: TextView =  requireView().findViewById(R.id.name_text_view)

        navigateToButton.setOnClickListener {
            findNavController().navigate(FragmentBDirections.actionFragmentBToFragmentC())
        }


//        nameTextView.text = arguments?.getString(Constants.KEY_NAME)
        nameTextView.text = args.myName


        viewModel.logArg()

        viewModel.myNameLiveData.observe(viewLifecycleOwner) { name ->
            Log.d("FragmentB", name)
        }
    }

}