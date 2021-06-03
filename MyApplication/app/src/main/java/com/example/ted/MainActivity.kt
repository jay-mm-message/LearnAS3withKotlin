package com.example.ted

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.util.Log.INFO
import java.util.logging.Level.INFO

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var tag:String = "TAG_INFO"
        var word:String = "It's calls onCreate."
        Log.d(tag, word)
        setContentView(R.layout.activity_main)
    }
}