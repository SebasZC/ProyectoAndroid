package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.View
import android.widget.EditText
import androidx.fragment.app.Fragment
import com.example.myapplication.databinding.ActivityAfterLoginBinding
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityAfterLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
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
    }

    private fun replaceFragment(fragment : Fragment){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentContainer, fragment)
        fragmentTransaction.commit()
    }

    fun submitButton(view : View){
        val editText = findViewById<EditText>(R.id.editTextTextName)
        val message = editText.text.toString()
        val intent = Intent(this,afterLogin::class.java).apply {
            putExtra(EXTRA_MESSAGE, message)
        }
        startActivity(intent)
    }
}