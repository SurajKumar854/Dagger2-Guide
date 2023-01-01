package com.kyubi.daggerguide.di.modules

import com.kyubi.daggerguide.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract  class ViewGroupModule {
    @ContributesAndroidInjector
    abstract fun contributeMainActivity(): MainActivity?
}