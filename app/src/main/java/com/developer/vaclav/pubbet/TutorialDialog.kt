package com.developer.vaclav.pubbet

import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.Gravity
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.widget.Button
import android.widget.RelativeLayout
import android.widget.ScrollView
import android.widget.TextView

class TutorialDialog(context: Context): Dialog(context) {
    private val dialogParams = WindowManager.LayoutParams()
    private val buttonParams: RelativeLayout.LayoutParams
    private val relativeLayout = RelativeLayout(context)
    private val scrollView = ScrollView(context)
    private val textView = TextView(context)
    private val button = Button(context)

    private val screenWidth = context.resources.displayMetrics.widthPixels
    private val screenHeight = context.resources.displayMetrics.heightPixels
    private val density = context.resources.displayMetrics.density

    private fun Int.toPx() = this * density.toInt()

    init {
        textView.textSize = 30f
        textView.gravity = Gravity.CENTER_HORIZONTAL
        textView.setTextColor(Color.rgb(33,33,33))
        textView.setPadding(50.toPx(), 100.toPx(), 50.toPx(), 100.toPx())

        scrollView.layoutParams = RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT)
        scrollView.addView(textView)

        button.text = "OK"
        button.setBackgroundColor(Color.WHITE)
        buttonParams = RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT)
        buttonParams.topMargin = screenHeight - 90.toPx()
        buttonParams.leftMargin = screenWidth - 110.toPx()
        button.layoutParams = buttonParams


        relativeLayout.gravity = Gravity.CENTER_HORIZONTAL
        relativeLayout.layoutParams = RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT)
        relativeLayout.addView(scrollView)
        relativeLayout.addView(button)
        this.window!!.setBackgroundDrawable(ColorDrawable(Color.argb(100,33,33,33)))
        dialogParams.width = screenWidth
        dialogParams.height = screenHeight




        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.setCancelable(false)
        this.setContentView(relativeLayout)
        this.show()
        this.window!!.attributes = dialogParams
    }

    fun onClick(listener: View.OnClickListener) {
        button.setOnClickListener(listener)
    }

    fun setText(text: String) {
        textView.text = text
    }

    fun setDarkTheme() {
        textView.setTextColor(Color.WHITE)
        this.window!!.setBackgroundDrawable(ColorDrawable(Color.argb(255,33,33,33)))
    }
}