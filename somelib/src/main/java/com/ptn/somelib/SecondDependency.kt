package com.ptn.somelib

import android.util.Log

class SecondDependency {

    operator fun invoke() {
        Log.i(TAG, "invoke: ")
    }

    companion object {

        private const val TAG = "SecondDependency"
    }
}