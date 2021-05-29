package com.s95ammar.navigationcomponentdemo

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class ViewModelC(val someString: String) : ViewModel() {

    fun logSomeString() {
        Log.d("ViewModelB", someString)
    }

    class Factory(private val someString: String) : ViewModelProvider.Factory {
        @Suppress("UNCHECKED_CAST")
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            return ViewModelC(someString) as T
        }
    }
}