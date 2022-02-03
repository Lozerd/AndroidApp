package com.example.androidapp

import android.content.Intent
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

    fun redirect(view: View) {
        val secondActivity = Intent(this, SecondActivity::class.java)
        val count: Int = Integer.parseInt(findViewById<TextView>(R.id.textView).text.toString())
        secondActivity.putExtra(SecondActivity.TOTAL_COUNT, count)
        startActivity(secondActivity)
    }

}