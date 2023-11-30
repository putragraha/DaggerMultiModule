package com.ptn.mylibrary

import android.util.Log
import com.ptn.mylibrary.Constant.TAG

class FirstDependency {

    operator fun invoke(value: String) {
        Log.i(TAG, "invoked from First Dependency in Lib, source: $value")
    }
}