package com.example.androidapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    private fun getCurrentState(message: String){
        Toast.makeText(this, "${lifecycle.currentState}, $message", Toast.LENGTH_SHORT).show()
    }

    override fun onStart() {
        super.onStart()
        getCurrentState("On start")
    }

    override fun onRestart() {
        super.onRestart()
        getCurrentState("On resume")
    }

    override fun onPostResume() {
        super.onPostResume()
        getCurrentState("On post resume")
    }

    override fun onPause(){
        super.onPause()
        getCurrentState("On pause")
    }

    override fun onStop(){
        super.onStop()
        getCurrentState("On stop")
    }

    override fun onDestroy() {
        super.onDestroy()
        getCurrentState("On destroy")
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