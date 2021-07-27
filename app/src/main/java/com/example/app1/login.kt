package com.example.app1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.app1.databinding.ActivityLoginBinding

class login : AppCompatActivity() {
    lateinit var login:ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        login = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(login.root)
    }
}