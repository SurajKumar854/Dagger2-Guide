package com.kyubi.daggerguide.di.modules

import android.content.Context
import android.content.SharedPreferences
import android.preference.PreferenceManager
import com.kyubi.daggerguide.di.demo_dependencies.Magic1
import com.kyubi.daggerguide.di.demo_dependencies.RoomDBDemo
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class AppModule( val context: Context) {


    @Provides
    fun provideMagic1(): Magic1 {
        return Magic1()
    }

    @Provides
    fun provideRoomDB( magic1: Magic1): RoomDBDemo {
        return RoomDBDemo(magic1)
    }


    @Provides
    @Singleton
    fun provideSharedPreference():SharedPreferences{
        return PreferenceManager.getDefaultSharedPreferences(context)
    }
}