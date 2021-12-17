package com.solarexsoft.practicemakesperfect

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.solarexsoft.practicemakesperfect.databinding.ActivityMainBinding
import com.solarexsoft.practicemakesperfect.nestedscrolling.NestedScrollingActivity
import com.solarexsoft.practicemakesperfect.scroll.ScrollActivity

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initView()
    }

    private fun initView() {
        binding.tv1.setOnClickListener {
            NestedScrollingActivity.start(this)
        }
        binding.tv2.setOnClickListener {
            ScrollActivity.start(this)
        }
    }
}