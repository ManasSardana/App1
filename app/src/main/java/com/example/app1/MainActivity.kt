package com.example.app1

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import com.google.android.material.snackbar.Snackbar
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

lateinit var email:EditText
lateinit var password:EditText
lateinit var remember:CheckBox
lateinit var login:Button
lateinit var forget:TextView
lateinit var create:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        email=findViewById(R.id.email)
        password=findViewById(R.id.password)
        remember=findViewById(R.id.remember)
        login=findViewById(R.id.login)
        forget=findViewById(R.id.forget)
        create=findViewById(R.id.create)

        login.setOnClickListener {
            var entered_email = email.text.toString()
            var entered_password = password.text.toString()

            Snackbar.make(it,"Email and Password are- $entered_email $entered_password",Snackbar.LENGTH_INDEFINITE).show()
        }


        forget.setOnClickListener {
            startActivity(Intent(this,forget::class.java))
        }


        create.setOnClickListener{
            startActivity(Intent(this,create::class.java))
        }
    }

    override fun onBackPressed() {
        var dialog = AlertDialog.Builder(this)
        dialog.setTitle("App 1")
        dialog.setMessage("Do you want to go back")
        dialog.setCancelable(false)
        dialog.setPositiveButton("Yes",{ dialogInterface: DialogInterface, i: Int ->
            finish()
        })
        dialog.setNegativeButton("No",{ dialogInterface: DialogInterface, i: Int ->
            dialogInterface.dismiss()
        })
        dialog.create().show()
    }
}