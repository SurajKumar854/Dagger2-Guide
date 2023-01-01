package com.kyubi.daggerguide.di.demo_dependencies

import android.util.Log
import javax.inject.Inject

class RoomDBDemo @Inject constructor(val magic1: Magic1) {

    fun sayHello(string: String) {
        Log.e("Msg-> from Dep ${magic1.string}", string)
    }
}