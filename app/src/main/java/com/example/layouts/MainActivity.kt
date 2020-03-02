package com.example.layouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.liner_layout) //liner_layout xml ko pyn call tr

        setContentView(R.layout.relativelayout) //relativelayout xml ko pyn call tr
        setContentView(R.layout.constraint)
    }
}

