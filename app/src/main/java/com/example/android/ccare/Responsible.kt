package com.example.android.ccare

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity
import com.example.android.ccare.model.ResponsibleEnum
import com.example.android.ccare.services.RegisterResponsible
import kotlinx.android.synthetic.main.activity_main.submit
import kotlinx.android.synthetic.main.activity_main.username
import kotlinx.android.synthetic.main.responsible_registration.*


class Responsible : AppCompatActivity() {

    private val register =
        RegisterResponsible()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.responsible_registration)


        /**
         * Creacion del spinner con ArrayAdapter
         */
        val mySpinner: Spinner = findViewById(R.id.user);

        mySpinner.adapter = ArrayAdapter<ResponsibleEnum>(
            this,
            android.R.layout.simple_spinner_item,
            ResponsibleEnum.values()
        )


        /**
         * Validamos con submit los campos vacios y nos vamos a otra activity
         */
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
