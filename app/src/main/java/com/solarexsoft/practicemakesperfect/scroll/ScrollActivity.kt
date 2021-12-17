package com.solarexsoft.practicemakesperfect.scroll

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.solarexsoft.practicemakesperfect.databinding.ActivityScrollBinding

/**
 * Created by houruhou on 2021/12/17/8:05 PM
 * Desc:
 */
class ScrollActivity : AppCompatActivity() {


    companion object {
        fun start(context: Context) {
            val intent = Intent(context, ScrollActivity::class.java)
            context.startActivity(intent)
        }
    }

    private lateinit var binding: ActivityScrollBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityScrollBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initView()
    }

    private fun initView() {
        binding.btn.setOnClickListener {
            binding.view2.scrollBy(-10, -10)
        }
    }
}