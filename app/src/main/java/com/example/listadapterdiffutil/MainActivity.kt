package com.example.listadapterdiffutil

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.os.bundleOf
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.listadapterdiffutil.adapter.Constants
import com.example.listadapterdiffutil.adapter.SportAdapter
import com.example.listadapterdiffutil.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    private val sportsAdapter by lazy { SportAdapter() }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.recyclerView.apply {
            layoutManager = GridLayoutManager(this@MainActivity, 2)
            adapter = sportsAdapter
        }

        sportsAdapter.sports = Constants.sports()
        sportsAdapter.onClick = {
            val bundle = bundleOf("sport" to it)
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }
    }
}