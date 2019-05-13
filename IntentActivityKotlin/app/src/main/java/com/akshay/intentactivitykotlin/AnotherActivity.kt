package com.akshay.intentactivitykotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_another.*

/**
 * Created by akshaynandwana on
 * 13, May, 2019
 **/
class AnotherActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_another)

        val dataFromActivity = intent.getStringExtra(getString(R.string.passDataTag))
        tvDisplay.text = dataFromActivity
    }
}