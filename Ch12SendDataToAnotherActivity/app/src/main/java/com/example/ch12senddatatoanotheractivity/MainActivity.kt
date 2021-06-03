package com.example.ch12senddatatoanotheractivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var TAG = "Activity: Main"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, "onCreate")

        button.setOnClickListener {
            var it = Intent(applicationContext, SecondActivity::class.java)
            var mdata = editText.text.toString()
            it.putExtra("main_activity_data", mdata)

            Log.d(TAG, "mdata: " + mdata)
            Log.d(TAG, "startActivity")
            startActivity(it)
        }
    }
}