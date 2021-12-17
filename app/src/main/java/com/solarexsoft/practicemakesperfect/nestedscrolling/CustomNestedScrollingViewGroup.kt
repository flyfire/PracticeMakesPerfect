package com.solarexsoft.practicemakesperfect.nestedscrolling

import android.content.Context
import android.util.AttributeSet
import android.view.ViewGroup
import androidx.core.view.NestedScrollingChild3

/**
 * Created by houruhou on 2021/12/17/3:18 PM
 * Desc:
 */
class CustomNestedScrollingViewGroup @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : ViewGroup(context, attrs, defStyleAttr), NestedScrollingChild3 {
    override fun onLayout(p0: Boolean, p1: Int, p2: Int, p3: Int, p4: Int) {

    }

}