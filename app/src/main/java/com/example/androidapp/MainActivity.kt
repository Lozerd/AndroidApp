package com.example.androidapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun add(view: View){
        val textView: TextView = findViewById(R.id.textView)
        var count: Int = Integer.parseInt(textView.text.toString())
        count++
        textView.text = count.toString()
    }

    fun delete(view: View) {
        val textView: TextView = findViewById(R.id.textView)
        var count: Int = Integer.parseInt(textView.text.toString())
        count--
        textView.text = count.toString()
    }

    fun reset(view: View){
        val textView: TextView = findViewById(R.id.textView)
        textView.text = "0"
    }

}