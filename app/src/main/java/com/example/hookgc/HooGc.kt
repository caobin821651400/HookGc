package com.example.hookgc

 class HooGc {

    external fun delayGC():Unit

    companion object {
        // Used to load the 'hookgc' library on application startup.
        init {
            System.loadLibrary("hookgc")
        }
    }

}