package com.sinyee.babybus.marke.appplica

import android.app.Application
import com.onesignal.OneSignal
import com.orhanobut.hawk.Hawk
import com.sinyee.babybus.marke.appplica.Cossssik.signator

class Apppliciciici:Application() {

    private fun gtgjtijhyihjyjyhjhyj() {
        Hawk.init(this).build()
    }


    override fun onCreate() {
        super.onCreate()
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE)
        OneSignal.initWithContext(this)
        gktgtkokgtk()
        gtgjtijhyihjyjyhjhyj()
    }


    private fun gktgtkokgtk() {
        gtgoktokgohjyjhjyijyhj()
    }

    private fun gtgoktokgohjyjhjyijyhj() {
        OneSignal.setAppId(signator)
    }
}