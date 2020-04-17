package com.example.android.ccare.services

class RegisterResponsible {

    fun doRegister(user: String?, tlf: String?, email: String?, relation: String?, callback: (Boolean) -> Unit) {

        val validUser = !user.isNullOrEmpty()
        val validTlf = tlf != null
        val validEmail = !email.isNullOrEmpty()
        val validRelation = !relation.isNullOrEmpty()

        callback.invoke(validUser && validTlf && validEmail && validRelation)

    }

}