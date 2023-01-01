package com.kyubi.daggerguide.di

import com.kyubi.daggerguide.DaggerGuideApplication
import com.kyubi.daggerguide.di.modules.AppModule
import com.kyubi.daggerguide.di.modules.ViewGroupModule
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [AndroidInjectionModule::class, ViewGroupModule::class, AppModule::class])
interface AppComponent {

    fun injectAtApplication(daggerGuideApplication: DaggerGuideApplication)

}