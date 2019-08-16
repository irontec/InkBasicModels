# InkBasicModels

[![](https://jitpack.io/v/irontec/InkBasicModels.svg)](https://jitpack.io/#irontec/InkBasicModels)

## Usage

Edit some `LinearLayout` parameters:

```kt
findViewById<LinearLayout>(R.id.linearlayout)?.applyModel(GeneralViewMdl(
	paddingBottom = 16.dpToPx(),
	paddingLeft = 16.dpToPx(),
	paddingRight = 16.dpToPx(),
	paddingTop = 16.dpToPx()
))
```

Edit some `TextView` parameters:

```kt
findViewById<TextView>(R.id.textview)?.applyModel(TextViewMdl(
	textMdl = TextMdl(
		text = InkSpannableBuilder().addText("Example text with some").addBlank().addTextBold("bold"),
		textColorResId = R.color.colorAccent,
		textSizeSp = 20f
	),
	generalViewMdl = GeneralViewMdl(
		onClick = { Toast.makeText(this, "You clicked me!", Toast.LENGTH_SHORT).show(); true},
		paddingBottom = 16.dpToPx(),
		paddingLeft = 16.dpToPx(),
		paddingRight = 16.dpToPx(),
		paddingTop = 16.dpToPx()
	)
))
```
