package com.example.moscow_bike

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.moscow_bike.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bFrag2.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.placeholder, BlankFragment2.newInstance())
                .commit()
        }
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.placeholder, BlankFragment.newInstance())
            .commit()
    }

    fun look(view: View) {
        val lookIntent = Intent(this, ThirdActivity::class.java)
        startActivity(lookIntent)
    }
}