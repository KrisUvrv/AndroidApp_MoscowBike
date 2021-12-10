package com.example.moscow_bike

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun enter(view: View) {
        val enterIntent = Intent(this, SecondActivity::class.java)
        startActivity(enterIntent)
    }
}