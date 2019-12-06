package ru.skillbranch.gameofthrones.common.model

import android.content.Context
import android.graphics.Canvas
import android.graphics.Rect
import android.graphics.drawable.Drawable
import android.view.View
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.RecyclerView


class MarginItemDecoration(
    context: Context,
    private val drawableBase: Drawable,
    private val marginDp: Int? = 0
) : DividerItemDecoration(context, VERTICAL) {

    override fun getItemOffsets(
        outRect: Rect,
        view: View,
        parent: RecyclerView,
        state: RecyclerView.State
    ) {
        super.getItemOffsets(outRect, view, parent, state)
        outRect.bottom =  drawableBase.intrinsicHeight
    }

    override fun onDraw(c: Canvas, parent: RecyclerView, state: RecyclerView.State) {
        var margin: Int = 0
        marginDp?.let { margin = marginDp }
        val left = margin
        val right = parent.width

        val childCount = parent.childCount
        for (i in 0 until childCount) {
            val child = parent.getChildAt(i)

            val params = child.layoutParams as RecyclerView.LayoutParams

            val top = child.bottom + params.bottomMargin

            val paintDrawable = drawableBase

            val bottom = top + paintDrawable.intrinsicHeight

            paintDrawable.setBounds(left, top, right, bottom)
            paintDrawable.draw(c)
        }
    }
}