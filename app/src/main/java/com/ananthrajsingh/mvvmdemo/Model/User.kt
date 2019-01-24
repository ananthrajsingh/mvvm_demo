package com.ananthrajsingh.mvvmdemo.Model

import android.util.Patterns

/**
 * Created by ananthrajsingh on 21/01/19
 */
abstract class User (val email: String = "example@email.com", val password: String = "<pw>") {

//    val mEmail: String
//    /* In java, this is equivalent to
//     * private String mEmail = "example@email.com"
//     * public String mEmail(){
//     *  return mEmail;
//     *  }
//     */
//    val mPassword: String = "<password>"

    private val mEmail: String = email
    private val mPassword: String = password

    fun isInputDataValid(): Boolean {
        return Patterns.EMAIL_ADDRESS.matcher(mEmail).matches() && mPassword.length > 5
    }
}