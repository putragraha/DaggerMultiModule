package com.ptn.mylibrary

import android.util.Log
import javax.inject.Inject

class FirstDependency @Inject constructor() {

    @Inject
    lateinit var secondDependency: SecondDependency

    operator fun invoke() {
        secondDependency()
        Log.i(TAG, "invoke: ")
    }

    companion object {
        private const val TAG = "FirstDependency"
    }
}
