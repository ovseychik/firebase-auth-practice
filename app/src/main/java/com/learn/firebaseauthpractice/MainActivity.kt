package com.learn.firebaseauthpractice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.learn.firebaseauthpractice.theme.NewEmptyComposeAppTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NewEmptyComposeAppTheme {
                MainScreen()
            }
        }
    }

}