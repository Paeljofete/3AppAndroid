package com.example.my3app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragment1 = fragment1()
        val fm: FragmentManager = supportFragmentManager
        fm.beginTransaction().add(R.id.fragmentContainerView, fragment1).commit()
    }
}
