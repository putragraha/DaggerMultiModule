package com.ptn.mylibrary

import android.util.Log
import javax.inject.Inject

class SecondDependency @Inject constructor() {

    operator fun invoke() {
        Log.i(TAG, "invoke: ")
    }

    companion object {

        private const val TAG = "SecondDependency"
    }
}