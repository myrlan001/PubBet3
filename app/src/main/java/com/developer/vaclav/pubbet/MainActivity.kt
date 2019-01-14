package com.developer.vaclav.pubbet

import android.graphics.drawable.BitmapDrawable
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var op1 = '0'
        var op2 = '0'
        var op3 = '0'

        val possibilities = listOf("000", "001", "010", "011", "100", "101", "110", "111")
        val counters =      listOf("100", "100", "001", "001", "010", "110", "011", "011")
    }

    fun op1Tap(view: View) {
        op1Img.setImageResource(R.drawable.coin01)

        //val bitmapDrawable = BitmapDrawable("android:resources://com.developer.vaclav.pubbet/" + R.drawable.coin01)
        //view.setBackgroundDrawable(bitmapDrawable)
    }
}
