package com.solarexsoft.practicemakesperfect.nestedscrolling

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity

/**
 * Created by houruhou on 2021/12/17/3:00 PM
 * Desc:
 */
class NestedScrollingActivity : AppCompatActivity() {
    companion object {
        const val TAG = "NestedScrollingActivity"

        fun start(context: Context) {
            val intent = Intent(context, NestedScrollingActivity::class.java)
            context.startActivity(intent)
        }
    }
}