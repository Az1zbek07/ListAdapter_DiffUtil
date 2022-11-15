package com.example.listadapterdiffutil

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.listadapterdiffutil.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private val binding by lazy { ActivitySecondBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val sport = intent.getSerializableExtra("sport") as SportsData
        binding.apply {
            secondImage.setImageResource(sport.image)
            secondTime.text = sport.time
            secondName.text = sport.name
            secondInfo.text = sport.info
        }
    }
}