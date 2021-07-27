package com.example.app1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.app1.databinding.ActivityForgetBinding
import com.example.app1.databinding.ActivityLoginBinding

class forget : AppCompatActivity() {
    lateinit var forget:ActivityForgetBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        forget = ActivityForgetBinding.inflate(layoutInflater)
        setContentView(forget.root)
        forget.forgetButton.setOnClickListener{
            var email = forget.forgetEmail.text.toString()
        }

    }
}