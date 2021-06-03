package com.example.ch12senddatatoanotheractivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    var TAG = "Activity: Second"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var mdata = intent.getStringExtra("main_activity_data")
        textView.setText("get data from mainActivity: \n\n\t" + mdata)
    }
}