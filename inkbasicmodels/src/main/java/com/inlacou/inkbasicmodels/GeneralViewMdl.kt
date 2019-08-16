package com.inlacou.inkbasicmodels

import android.view.View

open class GeneralViewMdl(
	val paddingTop: Int? = null,
	val paddingBottom: Int? = null,
	val paddingLeft: Int? = null,
	val paddingRight: Int? = null,
	/**
	 * @return true if handled
	 */
	val onClick: ((View) -> Boolean)? = null,
	/**
	 * Does not work on RelativeLayout
	 */
	val gravity: Int? = null,
	/**
	 * Only works on RelativeLayout
	 */
	val rules: List<Int>? = null,
	val width: Int? = null,
	val height: Int? = null
)