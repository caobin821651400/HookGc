package com.example.hookgc

import android.app.Application
import android.os.Build
import android.util.Log

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.Q) {
            Log.d("caobin", " delayGC start")
            HooGc().delayGC()
            Log.d("caobin", " delayGC end")
        }

    }

}