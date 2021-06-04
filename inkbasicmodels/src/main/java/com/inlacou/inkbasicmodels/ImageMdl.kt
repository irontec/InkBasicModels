package com.inlacou.inkbasicmodels

import android.graphics.drawable.Drawable

data class ImageMdl(
	val srcResId: Int? = null,
	val drawable: Drawable? = null,
	val tintColorResId: Int? = null,
	val tintColor: Int? = null,
)