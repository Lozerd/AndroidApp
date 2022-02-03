package com.example.androidapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import android.widget.Toolbar

class SecondActivity : AppCompatActivity() {
    companion object {
        const val TOTAL_COUNT = "total_count"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        setSupportActionBar(findViewById(R.id.toolbar))

        supportActionBar?.apply {
            title = "Toolbar Back Button"

            // show back button on toolbar
            // on back button press, it will navigate to parent activity
            setDisplayHomeAsUpEnabled(true)
            setDisplayShowHomeEnabled(true)
        }
        showTotalCount()
    }


    fun showTotalCount(){
        val count = intent.getIntExtra(TOTAL_COUNT, 0)
        findViewById<TextView>(R.id.textView3).text = getString(R.string.count, count)
    }
}