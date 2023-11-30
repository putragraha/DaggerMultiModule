package com.ptn.mylibrary

import android.util.Log
import com.ptn.mylibrary.Constant.TAG
import javax.inject.Inject

class InjectedSecondDependency @Inject constructor(): SecondDependency {

    @Inject
    lateinit var firstDependency: FirstDependency

    override fun execute() {
        Log.i(TAG, "invoked from Injected Second Dependency")
        firstDependency("Injected Second Dependency")
    }
}
