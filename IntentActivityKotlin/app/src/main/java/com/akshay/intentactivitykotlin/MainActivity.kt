package com.akshay.intentactivitykotlin

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSendData.setOnClickListener {

            when {
                !etName.text.isNullOrBlank() -> {
                    val intent = Intent(this, AnotherActivity::class.java)
                    intent.putExtra(getString(R.string.passDataTag), etName.text.toString())
                    startActivity(intent)
                }
                else -> Toast.makeText(this, getString(R.string.noInputMsg), Toast.LENGTH_LONG).show()
            }

        }
    }
}
