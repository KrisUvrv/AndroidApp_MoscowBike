package com.example.moscow_bike

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
    }

    fun ducati(view: View) {
        val ducatiIntent = Intent(this, DucatiActivity::class.java)
        startActivity(ducatiIntent)
    }
    fun bmw(view: View) {
        val bmwIntent = Intent(this, BmwActivity::class.java)
        startActivity(bmwIntent)
    }
    fun harley(view: View) {
        val harleyIntent = Intent(this, HarleyActivity::class.java)
        startActivity(harleyIntent)
    }
    fun yamaha(view: View) {
        val yamahaIntent = Intent(this, YamahaActivity::class.java)
        startActivity(yamahaIntent)
    }

}