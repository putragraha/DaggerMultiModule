package com.ptn.daggerlib

import android.util.Log
import com.ptn.mylibrary.Constant.TAG
import com.ptn.mylibrary.SecondDependency

class AppSecondDependency: SecondDependency {

    override fun execute() {
        Log.i(TAG, "invoked from App Second Dependency")
    }
}
