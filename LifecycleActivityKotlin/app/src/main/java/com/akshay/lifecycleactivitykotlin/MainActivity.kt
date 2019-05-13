package com.akshay.lifecycleactivitykotlin

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val tag = MainActivity::class.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(tag, getString(R.string.onCreate))
    }

    override fun onStart() {
        super.onStart()
        Log.d(tag, getString(R.string.onStart))
    }

    override fun onResume() {
        super.onResume()
        Log.d(tag, getString(R.string.onResume))
    }

    override fun onPause() {
        super.onPause()
        Log.d(tag, getString(R.string.onPause))
    }

    override fun onStop() {
        super.onStop()
        Log.d(tag, getString(R.string.onStop))
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(tag, getString(R.string.onRestart))
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(tag, getString(R.string.onDestroy))
    }
}
