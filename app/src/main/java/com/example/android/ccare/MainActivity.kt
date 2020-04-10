package com.example.android.ccare

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val loginRequest = LoginRequest()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        submit.setOnClickListener {

            val userStr = username.text?.toString()
            val passStr = pass.text?.toString()
            val intent: Intent = Intent(this, Responsible::class.java)

            loginRequest.doLogin(userStr, passStr) {success ->
                val message = if (success) "Success" else "Failure"
                //Toast.makeText(this@MainActivity, message, Toast.LENGTH_LONG).show()
               startActivity(intent)
            }



        }


    }
}
