package com.example.jetpackcomposedemo.util

import android.content.Context
import android.util.DisplayMetrics

/**
 * @param context
 * @return the screen width in dp
 */
fun getWidthDp(context: Context): Float {
    val displayMetrics: DisplayMetrics = context.resources.displayMetrics
    return displayMetrics.widthPixels / displayMetrics.density
}

/**
 * @param context
 * @return the screen height in dp
 */
fun getHeightDp(context: Context): Float {
    val displayMetrics: DisplayMetrics = context.resources.displayMetrics
    return displayMetrics.heightPixels / displayMetrics.density
}