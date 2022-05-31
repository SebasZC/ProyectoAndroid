package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.myapplication.databinding.ActivityAfterLoginBinding

class afterLogin : AppCompatActivity() {

    lateinit var binding: ActivityAfterLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_after_login)



        setContentView(R.layout.activity_main)
        binding = ActivityAfterLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button2.setOnClickListener{
            replaceFragment(FragmentButtonOne())
        }

        binding.button3.setOnClickListener {
            replaceFragment(FragmentButtonTwo())
        }

        binding.button4.setOnClickListener {
            replaceFragment(FragmentButtonThree())
        }

        binding.button5.setOnClickListener {
            replaceFragment(FragmentButtonFour())
        }
        val buttonppl = findViewById<Button>(R.id.button6)
        buttonppl.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val message = intent.getStringExtra(EXTRA_MESSAGE)
        val textView = findViewById<TextView>(R.id.textViewName).apply {
            text = message
        }

}
    private fun replaceFragment(fragment : Fragment){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentContainer, fragment)
        fragmentTransaction.commit()
    }
}