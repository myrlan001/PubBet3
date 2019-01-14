package com.developer.vaclav.pubbet

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //Head = 0 = False
    //Tail = 1 = True

    var op1 = '0'
    var op2 = '0'
    var op3 = '0'

    val possibilities = listOf("000", "001", "010", "011", "100", "101", "110", "111")
    val counters =      listOf("100", "100", "001", "001", "010", "110", "011", "011")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
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

    fun changeMyCoins() {


    }
}
