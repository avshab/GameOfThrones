package ru.skillbranch.gameofthrones.common.extensions

import android.graphics.drawable.Drawable
import androidx.annotation.DimenRes
import androidx.annotation.DrawableRes
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import ru.skillbranch.gameofthrones.common.model.MarginItemDecoration


fun RecyclerView.verticalDividerDecoration(
    @DrawableRes dividerDrawable: Int,
    @DimenRes marginDp: Int
) {
    var margin: Int? = null
    marginDp?.let {
        margin = resources.getDimension(marginDp).toInt()
    }
    val divider = MarginItemDecoration(
        context,
        ContextCompat.getDrawable(context, dividerDrawable) as Drawable,
        margin
    )
    addItemDecoration(divider)
}