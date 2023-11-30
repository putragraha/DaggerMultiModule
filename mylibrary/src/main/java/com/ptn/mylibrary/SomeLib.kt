package com.ptn.mylibrary

import android.util.Log
import com.ptn.mylibrary.Constant.TAG
import com.ptn.mylibrary.di.DaggerSomeLibComponent
import com.ptn.mylibrary.di.SecondDependencyModule
import javax.inject.Inject

class SomeLib(private val secondDependency: SecondDependency) {

    @Inject
    lateinit var firstDependency: FirstDependency

    @Inject
    lateinit var injectedSecondDependency: InjectedSecondDependency

    @Inject
    lateinit var providedSecondDependency: SecondDependency

    init {
        DaggerSomeLibComponent.builder()
            .firstDependency(FirstDependency())
            .secondDependencyModule(SecondDependencyModule())
            .build()
            .inject(this)
    }

    operator fun invoke() {
        Log.i(TAG, "Start invoking........")
        firstDependency.invoke("From Lib Main Entry")
        secondDependency.execute()
        injectedSecondDependency.execute()
        providedSecondDependency.execute()
    }
}