package com.inlacou.inkbasicmodels.extensions

import android.content.Context
import android.content.res.Resources
import android.os.Build
import android.util.TypedValue
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.coordinatorlayout.widget.CoordinatorLayout
import com.inlacou.inkbasicmodels.*
import com.inlacou.inkbasicmodels.DimensionType.*
import com.inlacou.pripple.RippleButton
import com.inlacou.pripple.RippleLinearLayout
import com.inlacou.pripple.RippleRelativeLayout

//RIPPLEBUTTON
fun RippleButton.applyModel(mdl: RippleButtonViewMdl?) {
	applyModel(mdl?.generalViewMdl, mdl?.textMdl, mdl?.rippleViewMdl)
}

fun RippleButton.applyModel(generalViewMdl: GeneralViewMdl?, textMdl: TextMdl?, rippleMdl: RippleMdl?) {
	if(rippleMdl?.normalColorResId!=null) normalColor = context.getColorCompat(rippleMdl.normalColorResId)
	if(rippleMdl?.rippleColorResId!=null) rippleColor = context.getColorCompat(rippleMdl.rippleColorResId)
	if(rippleMdl?.strokeColorResId!=null) strokeColor = context.getColorCompat(rippleMdl.strokeColorResId)
	if(rippleMdl?.strokeWidth!=null) strokeWidth = rippleMdl.strokeWidth
	if(rippleMdl?.cornerRadius!=null) corners = rippleMdl.cornerRadius
	applyModel(TextViewMdl(textMdl, generalViewMdl))
}
///RIPPLEBUTTON

//TEXTVIEW
fun TextView.applyModelOrClear(model: TextViewMdl?) {
	applyModelOrClear(model?.textMdl)
	applyModelOrClear(model?.generalViewMdl)
}

fun TextView.applyModelOrClear(textMdl: TextMdl?) {
	setLinkTextColor(context.getColorCompat(textMdl?.textColorResId ?: R.color.inkbasicmodels_default_text_color))
	setTextColor(context.getColorCompat(textMdl?.textColorResId ?: R.color.inkbasicmodels_default_text_color))
	when(textMdl?.textSizeDimensionType) {
		PX -> setTextSize(TypedValue.COMPLEX_UNIT_PX, textMdl.textSize ?: 16F)
		DP -> setTextSize(TypedValue.COMPLEX_UNIT_DIP, textMdl.textSize ?: 16F)
		SP -> setTextSize(TypedValue.COMPLEX_UNIT_SP, textMdl.textSize ?: 16F)
		null -> setTextSize(TypedValue.COMPLEX_UNIT_SP, 16F)
	}
	text = textMdl?.text?.build() ?: ""
}

fun TextView.applyModel(model: TextViewMdl?){
	applyModel(model?.generalViewMdl)
	applyModel(model?.textMdl)
}

fun TextView.applyModel(textMdl: TextMdl?) {
	if(textMdl?.textColorResId!=null) setLinkTextColor(context.getColorCompat(textMdl.textColorResId))
	if(textMdl?.textColorResId!=null) setTextColor(context.getColorCompat(textMdl.textColorResId))
	if(textMdl?.textSize!=null) when(textMdl?.textSizeDimensionType) {
		PX -> setTextSize(TypedValue.COMPLEX_UNIT_PX, textMdl.textSize ?: 16F)
		DP -> setTextSize(TypedValue.COMPLEX_UNIT_DIP, textMdl.textSize ?: 16F)
		SP -> setTextSize(TypedValue.COMPLEX_UNIT_SP, textMdl.textSize ?: 16F)
		null -> setTextSize(TypedValue.COMPLEX_UNIT_SP, 16F)
	}
	if(textMdl?.text!=null) text = textMdl.text.build()
}

fun TextView.applyModel(generalViewMdl: GeneralViewMdl?, textMdl: TextMdl?) {
	applyModel(generalViewMdl)
	applyModel(textMdl)
}
///TEXTVIEW

//RIPPLELAYOUT
fun RippleLinearLayout.applyModel(mdl: RippleViewMdl?) {
	applyModel(mdl?.rippleMdl)
	applyModel(mdl?.generalViewMdl)
}

fun RippleRelativeLayout.applyModel(mdl: RippleViewMdl?) {
	applyModel(mdl?.rippleMdl)
	applyModel(mdl?.generalViewMdl)
}

fun RippleLinearLayout.applyModelOrClear(mdl: RippleViewMdl?) {
	applyModelOrClear(mdl?.rippleMdl)
	applyModelOrClear(mdl?.generalViewMdl)
}

fun RippleRelativeLayout.applyModelOrClear(mdl: RippleViewMdl?) {
	applyModelOrClear(mdl?.rippleMdl)
	applyModelOrClear(mdl?.generalViewMdl)
}

fun RippleRelativeLayout.applyModel(mdl: RippleMdl?){
	if(mdl?.normalColorResId!=null) normalColor = context.getColorCompat(mdl.normalColorResId)
	if(mdl?.rippleColorResId!=null) rippleColor = context.getColorCompat(mdl.rippleColorResId)
	if(mdl?.strokeWidth!=null) strokeWidth = mdl.strokeWidth
	if(mdl?.strokeColorResId!=null) strokeColor = context.getColorCompat(mdl.strokeColorResId)
	if(mdl?.cornerRadius!=null) corners = mdl.cornerRadius
}

fun RippleRelativeLayout.applyModelOrClear(mdl: RippleMdl?){
	normalColor = context.getColorCompat(mdl?.normalColorResId ?: R.color.inkbasicmodels_default_background_color)
	rippleColor = context.getColorCompat(mdl?.rippleColorResId ?: R.color.inkbasicmodels_default_background_ripple_color)
	strokeWidth = mdl?.strokeWidth ?: 0
	strokeColor = context.getColorCompat(mdl?.strokeColorResId ?: R.color.inkbasicmodels_default_text_color)
	corners = mdl?.cornerRadius ?: 15F
}

fun RippleLinearLayout.applyModel(mdl: RippleMdl?){
	if(mdl?.normalColorResId!=null) normalColor = context.getColorCompat(mdl.normalColorResId)
	if(mdl?.rippleColorResId!=null) rippleColor = context.getColorCompat(mdl.rippleColorResId)
	if(mdl?.strokeWidth!=null) strokeWidth = mdl.strokeWidth
	if(mdl?.strokeColorResId!=null) strokeColor = context.getColorCompat(mdl.strokeColorResId)
	if(mdl?.cornerRadius!=null) corners = mdl.cornerRadius
}

fun RippleLinearLayout.applyModelOrClear(mdl: RippleMdl?){
	normalColor = context.getColorCompat(mdl?.normalColorResId ?: R.color.inkbasicmodels_default_background_color)
	rippleColor = context.getColorCompat(mdl?.rippleColorResId ?: R.color.inkbasicmodels_default_background_ripple_color)
	strokeWidth = mdl?.strokeWidth ?: 0
	strokeColor = context.getColorCompat(mdl?.strokeColorResId ?: R.color.inkbasicmodels_default_text_color)
	corners = mdl?.cornerRadius ?: 15F
}
///RIPPLELAYOUT

//VIEW
fun View.applyModel(mdl: GeneralViewMdl?) {
	if(mdl?.onClick!=null) setOnClickListener { mdl.onClick.invoke(this) }
	setPaddings(left = mdl?.paddingLeft, right = mdl?.paddingRight, top = mdl?.paddingTop, bottom = mdl?.paddingBottom)
	setMargins(left = mdl?.marginLeft, right = mdl?.marginRight, top = mdl?.marginTop, bottom = mdl?.marginBottom)
	layoutParams = layoutParams?.apply {
		mdl?.width?.let { width = it }
		mdl?.height?.let { height = it }
		mdl?.gravity?.let {
			if(this is LinearLayout.LayoutParams) gravity = it
			if(this is FrameLayout.LayoutParams) gravity = it
			if(this is CoordinatorLayout.LayoutParams) gravity = it
			try{ if(this is CoordinatorLayout.LayoutParams) gravity = it }catch (ncdfe: NoClassDefFoundError){}
		}
		mdl?.rules?.let { if(this is RelativeLayout.LayoutParams) it.forEach { addRule(it) } }
	}
}

fun View.applyModelOrClear(mdl: GeneralViewMdl?) {
	if(mdl?.onClick!=null) setOnClickListener { mdl.onClick.invoke(this) }
	else setOnClickListener(null)
	setPaddings(left = mdl?.paddingLeft ?: 0, right = mdl?.paddingRight ?: 0, top = mdl?.paddingTop ?: 0, bottom = mdl?.paddingBottom ?: 0)
	setMargins(left = mdl?.marginLeft ?: 0, right = mdl?.marginRight ?: 0, top = mdl?.marginTop ?: 0, bottom = mdl?.marginBottom ?: 0)
	layoutParams = layoutParams?.apply {
		width = mdl?.width ?: ViewGroup.LayoutParams.WRAP_CONTENT
		height = mdl?.height ?: ViewGroup.LayoutParams.WRAP_CONTENT
		if(this is LinearLayout.LayoutParams) gravity = mdl?.gravity ?: Gravity.NO_GRAVITY
		if(this is FrameLayout.LayoutParams) gravity = mdl?.gravity ?: Gravity.NO_GRAVITY
		if(this is RelativeLayout.LayoutParams) mdl?.rules?.forEach { addRule(it) } ?: addRule(if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.JELLY_BEAN_MR1) RelativeLayout.ALIGN_START else RelativeLayout.ALIGN_LEFT)
		try{ if(this is CoordinatorLayout.LayoutParams) gravity = mdl?.gravity ?: Gravity.NO_GRAVITY }catch (ncdfe: NoClassDefFoundError){}
	}
}

private fun View.setPaddings(left: Int? = null, top: Int? = null, right: Int? = null, bottom: Int? = null) {
	setPadding(left ?: this.paddingLeft, top ?: this.paddingTop, right ?: this.paddingRight, bottom ?: this.paddingBottom)
	requestLayout()
}

private fun View.setMargins(left: Int? = null, top: Int? = null, right: Int? = null, bottom: Int? = null) {
	layoutParams?.apply {
		if(this is LinearLayout.LayoutParams) setMargins(left ?: this.leftMargin, top ?: this.topMargin, right ?: this.rightMargin, bottom ?: this.bottomMargin)
		if(this is FrameLayout.LayoutParams) setMargins(left ?: this.leftMargin, top ?: this.topMargin, right ?: this.rightMargin, bottom ?: this.bottomMargin)
		if(this is RelativeLayout.LayoutParams) setMargins(left ?: this.leftMargin, top ?: this.topMargin, right ?: this.rightMargin, bottom ?: this.bottomMargin)
		try{ if(this is CoordinatorLayout.LayoutParams) setMargins(left ?: this.leftMargin, top ?: this.topMargin, right ?: this.rightMargin, bottom ?: this.bottomMargin) }catch (ncdfe: NoClassDefFoundError){}
	}
	requestLayout()
}
///VIEW

//UTILITIES
private fun Context.getColorCompat(resId: Int): Int {
	return resources.getColorCompat(resId)
}

private fun Resources.getColorCompat(resId: Int): Int {
	return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
		getColor(resId, null)
	}else{
		getColor(resId)
	}
}
///UTILITIES
