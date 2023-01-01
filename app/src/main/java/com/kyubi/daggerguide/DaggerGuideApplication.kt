package com.kyubi.daggerguide

import android.app.Application
import android.content.SharedPreferences
import android.util.Log
import com.kyubi.daggerguide.di.DaggerAppComponent
import com.kyubi.daggerguide.di.modules.AppModule
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector

import javax.inject.Inject

class DaggerGuideApplication : Application(),HasAndroidInjector {
@Inject lateinit var androidInjector: DispatchingAndroidInjector<Any>;

    @Inject
    lateinit var sharedPreferences: SharedPreferences
    override fun onCreate() {
        super.onCreate()
        DaggerAppComponent.builder().appModule(AppModule(this)).build().injectAtApplication(this)

        Log.e("DaggerApp","onCreate")
    }

    override fun androidInjector(): AndroidInjector<Any> {
        return androidInjector
    }


}