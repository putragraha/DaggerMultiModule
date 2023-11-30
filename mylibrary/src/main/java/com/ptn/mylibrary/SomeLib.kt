package com.ptn.mylibrary

import android.util.Log

class SomeLib(private val firstDependency: FirstDependency) {

    init {
        DaggerSomeLibComponent.create().run {
            inject(this@SomeLib)
            firstDependency(firstDependency)
        }
    }

    operator fun invoke() {
        firstDependency()
        Log.i(TAG, "invoke: ")
    }

    companion object {

        private const val TAG = "SomeLib"
    }
}