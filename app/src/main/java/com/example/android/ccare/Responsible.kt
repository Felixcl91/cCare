package com.example.android.ccare

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.submit
import kotlinx.android.synthetic.main.activity_main.username
import kotlinx.android.synthetic.main.responsible_registration.*

class Responsible : AppCompatActivity() {

    private val register = RegisterResponsible()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.responsible_registration)

        submit.setOnClickListener {

            val userStr: String? = username.text.toString()
            val tlfInt: String? = tlf.text.toString()
            val emailStr: String? = email.text.toString()
            val relationStr: String? = relation.text.toString()

            val intent: Intent = Intent(this, OlderPersonData::class.java)

            register.doRegister(userStr, tlfInt, emailStr, relationStr) {success ->
                if (success) startActivity(intent)
                else
                    toast(message = "Authentication failed")

            }

        }

    }
}
