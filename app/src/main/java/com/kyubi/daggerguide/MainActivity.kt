package com.kyubi.daggerguide

import android.content.SharedPreferences
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.kyubi.daggerguide.di.demo_dependencies.RoomDBDemo
import dagger.android.AndroidInjection
import javax.inject.Inject


class MainActivity : AppCompatActivity() {

@Inject lateinit var roomDBDemo: RoomDBDemo

    override fun onAttachedToWindow() {

        super.onAttachedToWindow()

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        roomDBDemo.sayHello("Goku")

        }





    }
