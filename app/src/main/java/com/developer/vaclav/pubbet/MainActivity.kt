package com.developer.vaclav.pubbet

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

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

    //todo note from  ̶J̶e̶n̶d̶a̶ Václav
}
