package com.inlacou.inkbasicmodelslibraryproject

import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import com.inlacou.inkbasicmodels.*
import com.inlacou.inkbasicmodels.extensions.applyModel
import com.inlacou.inkspannable.InkSpannableBuilder
import com.inlacou.pripple.RippleButton

class MainActivity : AppCompatActivity() {
	
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)
		
		findViewById<LinearLayout>(R.id.linearlayout)?.applyModel(GeneralViewMdl(
				paddingBottom = 16.dpToPx(),
				paddingLeft = 16.dpToPx(),
				paddingRight = 16.dpToPx(),
				paddingTop = 16.dpToPx()
		))
		
		findViewById<TextView>(R.id.textview)?.applyModel(TextViewMdl(
				textMdl = TextMdl(
						text = InkSpannableBuilder().addText("Example text with some").addBlank().addTextBold("bold"),
						textColorResId = R.color.colorAccent,
						textSize = 20f,
						textSizeDimensionType = DimensionType.DP
				),
				generalViewMdl = GeneralViewMdl(
						onClick = { Toast.makeText(this, "You clicked me!", Toast.LENGTH_SHORT).show(); true},
						paddingBottom = 16.dpToPx(),
						paddingLeft = 16.dpToPx(),
						paddingRight = 16.dpToPx(),
						paddingTop = 16.dpToPx()
				)
		))
		
		findViewById<RippleButton>(R.id.ripplebutton)?.applyModel(RippleButtonViewMdl(
				textMdl = TextMdl(
						text = InkSpannableBuilder().addText("Button"),
						textSize = 20f,
						textSizeDimensionType = DimensionType.DP
				),
				generalViewMdl = GeneralViewMdl(
						onClick = { Toast.makeText(this, "You clicked me!", Toast.LENGTH_SHORT).show(); true},
						paddingBottom = 16.dpToPx(),
						paddingLeft = 16.dpToPx(),
						paddingRight = 16.dpToPx(),
						paddingTop = 16.dpToPx(),
						marginTop = 16.dpToPx()
				),
				rippleViewMdl = RippleMdl(
						normalColorResId = R.color.colorPrimary,
						rippleColorResId = R.color.colorPrimaryDark,
						cornerRadius = 16f,
						strokeWidth = 1.dpToPx(),
						strokeColorResId = R.color.colorAccent
				)
		))
	}
	
	private fun Int.dpToPx() = (this * Resources.getSystem().displayMetrics.density).toInt()
}
