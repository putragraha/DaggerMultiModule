package com.ptn.somelib

import android.util.Log

class FirstDependency(secondDependency: SecondDependency) {

    operator fun invoke() {
        Log.i(TAG, "invoke: ")
    }

    companion object {
        private const val TAG = "FirstDependency"
    }
}