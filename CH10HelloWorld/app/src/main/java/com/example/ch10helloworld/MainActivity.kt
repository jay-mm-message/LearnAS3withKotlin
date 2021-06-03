package com.example.ch10helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textHello.text = "1"
        //findViewById<TextView>(R.id.textHello).text = "1"
    }

    fun addNumber(view: View) {

        val curVal = textHello.text.toString().toInt()
        val nextVal = curVal + 10
        textHello.text = nextVal.toString()
//        val tvx = findViewById<TextView>(R.id.textHello)
//        val currVal = tvx.text.toString().toInt()
//        val nextVal = currVal + 1
//        tvx.text = nextVal.toString()
    }


}