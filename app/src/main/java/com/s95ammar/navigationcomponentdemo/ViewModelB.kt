package com.s95ammar.navigationcomponentdemo

import android.util.Log
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel

class ViewModelB(val handle: SavedStateHandle) : ViewModel() {

    val myNameLiveData = handle.getLiveData<String>("my_name")

    fun logArg() {
        val arg = handle.get<String>("my_name")
        Log.d("ViewModelB", arg.toString())
    }
}