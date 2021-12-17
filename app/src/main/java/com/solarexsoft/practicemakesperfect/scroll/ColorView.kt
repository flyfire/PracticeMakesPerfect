package com.solarexsoft.practicemakesperfect.scroll

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View
import androidx.core.content.ContextCompat
import com.solarexsoft.practicemakesperfect.R

/**
 * Created by houruhou on 2021/12/17/7:58 PM
 * Desc:
 */
class ColorView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {

    val bgColor: Int
    val paint = Paint()

    init {
        val typedArray = context.obtainStyledAttributes(attrs, R.styleable.ColorView)
        bgColor = typedArray.getColor(R.styleable.ColorView_bgColor, ContextCompat.getColor(context, android.R.color.darker_gray))
        typedArray.recycle()
        paint.color = ContextCompat.getColor(context, android.R.color.holo_red_dark)
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        canvas.drawColor(bgColor)
        canvas.drawCircle(0f, 0f, 100f, paint)
    }
}