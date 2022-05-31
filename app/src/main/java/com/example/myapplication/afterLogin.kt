package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.View
import android.widget.TextView

class afterLogin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_after_login)

        val message = intent.getStringExtra(EXTRA_MESSAGE)

        /*val textView = findViewById<TextView>(R.id.textViewName).apply {
            text = message
            }*/

    }
    fun mainScreen(view: View){
        val intent = Intent(this,MainActivity::class.java)
        startActivity(intent)
    }
}