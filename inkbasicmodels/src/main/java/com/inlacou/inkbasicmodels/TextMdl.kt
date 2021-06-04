package com.inlacou.inkbasicmodels

import com.inlacou.inkspannable.InkSpannableBuilder

data class TextMdl(
	val text: InkSpannableBuilder? = null,
	val textColorResId: Int? = null,
	val textSize: Float? = null,
	val textSizeDimensionType: DimensionType = DimensionType.SP,
	val topImageMdl: ImageMdl? = null,
	val leftStartImageMdl: ImageMdl? = null,
	val bottomImageMdl: ImageMdl? = null,
	val rightEndImageMdl: ImageMdl? = null,
	val drawableMargin: Int? = null,
)