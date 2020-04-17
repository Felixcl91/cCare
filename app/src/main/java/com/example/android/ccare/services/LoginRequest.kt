package com.example.android.ccare.services

class LoginRequest {

    fun doLogin(user: String?, pass: String?, callback: (Boolean) -> Unit){
        /*val validUser = user != null && user.isNotEmpty()
        val validPass = pass != null && pass.isNotEmpty()*/
        val validUser = !user.isNullOrEmpty()
        val validPass = !pass.isNullOrEmpty()
        //val validTlf :Boolean = tlf != null
        //val validRelation :Boolean = !relation.isNullOrEmpty()

        callback.invoke(validUser && validPass)
    }
}


