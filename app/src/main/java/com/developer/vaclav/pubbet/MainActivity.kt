package com.developer.vaclav.pubbet

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
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
        op1 = if (op1 == '0') {
            op1Img.setImageResource(R.drawable.coin01)
            '1'
        } else {
            op1Img.setImageResource(R.drawable.coin01)
            '0'
        }

    }

    fun changeMyCoins() {


    }
}
