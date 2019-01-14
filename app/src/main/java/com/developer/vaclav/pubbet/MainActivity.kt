package com.developer.vaclav.pubbet

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //Head = 0 = False
    //Tail = 1 = True

    private var op1 = '0'
    private var op2 = '0'
    private var op3 = '0'

    private val possibilities = listOf("000", "001", "010", "011", "100", "101", "110", "111")
    private val counters =      listOf("100", "100", "001", "001", "010", "110", "011", "011")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        changeMyCoins()

        val dialog = TutorialDialog(this)
        dialog.setText("Welcome you stupid people!")
        dialog.setDarkTheme()
        dialog.onClick(View.OnClickListener {
            dialog.dismiss()
        })

    }

    fun op1Tap(view: View) {
        op1 = op1.changeCoin(op1Img)
        changeMyCoins()
    }
    fun op2Tap(view: View) {
        op2 = op2.changeCoin(op2Img)
        changeMyCoins()
    }
    fun on3Tap(view: View) {
        op3 = op3.changeCoin(op3Img)
        changeMyCoins()
    }

    private fun Char.changeCoin(img: ImageView): Char {
        return if (this == '0') {
            img.setImageResource(R.drawable.coin_1)
            '1'
        } else {
            img.setImageResource(R.drawable.coin_0)
            '0'
        }
    }

    private fun changeMyCoins() {
        val counter = counters[possibilities.indexOf(op1.toString() + op2.toString() + op3.toString())]
        if (counter[0] == '0') my1Img.setImageResource(R.drawable.coin_0) else my1Img.setImageResource(R.drawable.coin_1)
        if (counter[1] == '0') my2Img.setImageResource(R.drawable.coin_0) else my2Img.setImageResource(R.drawable.coin_1)
        if (counter[2] == '0') my3Img.setImageResource(R.drawable.coin_0) else my3Img.setImageResource(R.drawable.coin_1)
    }
}
