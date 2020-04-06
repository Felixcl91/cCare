package com.example.android.ccare

class LoginRequest {

    fun doLogin(user: String?, pass: String?, callback: (Boolean) -> Unit){
        /*val validUser = user != null && user.isNotEmpty()
        val validPass = pass != null && pass.isNotEmpty()*/
        val validUser = !user.isNullOrEmpty()
        val validPass = !pass.isNullOrEmpty()

        callback.invoke(validUser && validPass)
    }
}