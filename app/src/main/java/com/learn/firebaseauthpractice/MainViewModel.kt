package com.learn.firebaseauthpractice

import androidx.lifecycle.ViewModel
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class MainViewModel: ViewModel() {
    private val _signInStatus = MutableStateFlow("Not Signed-in")
    val signInStatus = _signInStatus.asStateFlow()

    private val _signedInUser = MutableStateFlow<FirebaseUser?>(null)
    val signedInUser = _signedInUser.asStateFlow()

    fun onSignOut() {
        _signInStatus.value = "Not Signed-in"
        _signedInUser.value = null

    }

    fun onSignedIn() {
        _signInStatus.value = "Signed In"
        _signedInUser.value = FirebaseAuth.getInstance().currentUser

        val user = _signedInUser.value

    }

    fun onSignInCancel() {
        onSignOut()
    }

    fun onSignInError(errorCode: Int?) {
        _signInStatus.value = "Failed - Error Code: $errorCode"
        _signedInUser.value = null
    }


}