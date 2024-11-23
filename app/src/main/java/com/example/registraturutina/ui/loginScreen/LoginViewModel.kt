package com.example.registraturutina.ui.loginScreen

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LoginViewModel: ViewModel() {
    private val _email = MutableLiveData<String>()
    val email: LiveData<String> = _email

    private val _password = MutableLiveData<String>()
    val password: LiveData<String> = _password

    fun onChangeEmail(emailForm: String){
        _email.value = emailForm
    }

    fun onChangePassword(passwordForm: String){
        _password.value = passwordForm
    }
}