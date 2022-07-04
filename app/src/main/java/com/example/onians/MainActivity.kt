package com.example.onians

import android.app.Activity
import android.os.Bundle

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //remove notification bar

        setContentView(R.layout.activity_main)
    }
}