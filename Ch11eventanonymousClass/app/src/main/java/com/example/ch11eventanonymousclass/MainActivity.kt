package com.example.ch11eventanonymousclass

import android.content.Intent
import android.hardware.camera2.CameraManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.log


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener(object:View.OnClickListener {
            override fun onClick(v: View?) {
                Toast.makeText(applicationContext, "Button click", Toast.LENGTH_SHORT).show()
                Log.d("Button onClick", "onClick")

                var intent = Intent(this@MainActivity, SecondActivity::class.java)
                startActivity(intent)
            }
        })

        button.setOnLongClickListener(object: View.OnLongClickListener {
            override fun onLongClick(v: View?): Boolean {
                //Toast.makeText(applicationContext, "Button Long click", Toast.LENGTH_SHORT).show()
                Log.d("Button Long click", "Long Click")
                Snackbar.make(root_layout, "Long click", Snackbar.LENGTH_LONG).show()

                return true;
            }
        })

    }
}

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Toast.makeText(applicationContext, "SecondActivity", Toast.LENGTH_SHORT).show()
        Log.d("SecondActivity", "onCreate")
    }
}

