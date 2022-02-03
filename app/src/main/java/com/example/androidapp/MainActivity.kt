package com.example.androidapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private var textView: TextView = findViewById(R.id.textView)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.textView = findViewById(R.id.textView)
        setContentView(R.layout.activity_main)
    }

    fun add(view: View){
        var count: Int = Integer.parseInt(this.textView.text.toString())
        count++
        textView.text = count.toString()
    }

    fun delete(view: View) {
        var count: Int = Integer.parseInt(this.textView.text.toString())
        count--
        textView.text = count.toString()
    }
}