package com.example.SoundScape_Android.app.screens.locationdetails


import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.material3.*
import androidx.compose.ui.graphics.Color

class LocationDetails {
    @Composable
    fun locationDetails(){
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = Color(0xFF191926)
        ){
            Text(text = "Location Details")
        }
    }
}

