package com.example.androidapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var myObserver: MyObserver
    lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView = findViewById(R.id.textView)
        myObserver = MyObserver()
        lifecycle.addObserver(myObserver)
    }

    /*private fun getCurrentState(message: String){
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
    }*/

    fun add(view: View){
        var count: Int = Integer.parseInt(textView.text.toString())
        count++
        textView.text = count.toString()
    }

    fun delete(view: View) {
        var count: Int = Integer.parseInt(textView.text.toString())
        count--
        textView.text = count.toString()
    }

    fun reset(view: View){
        textView.text = "0"
    }

    fun redirect(view: View) {
        val secondActivity = Intent(this, SecondActivity::class.java)
        val count: Int = Integer.parseInt(textView.text.toString())
        secondActivity.putExtra(SecondActivity.TOTAL_COUNT, count)
        startActivity(secondActivity)
    }

}