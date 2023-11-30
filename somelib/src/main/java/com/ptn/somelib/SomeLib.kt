package com.ptn.somelib

import android.util.Log

class SomeLib(firstDependency: FirstDependency) {

    operator fun invoke() {
        Log.i(TAG, "invoke: ")
    }

    companion object {

        private const val TAG = "SomeLib"
    }
}