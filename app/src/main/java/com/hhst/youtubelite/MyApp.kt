package com.hhst.youtubelite

import android.app.Application
import com.startapp.sdk.adsbase.StartAppSDK

class MyApp : Application() {

    override fun onCreate() {
        super.onCreate()
        StartAppSDK.init(this, "200185168", false)
    }
}