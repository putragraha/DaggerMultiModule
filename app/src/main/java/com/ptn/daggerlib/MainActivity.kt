package com.ptn.daggerlib

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ptn.mylibrary.SomeLib

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val someLib = SomeLib(AppSecondDependency())

        someLib.invoke()
    }
}
