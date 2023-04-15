package com.example.SoundScape_Android.app.screens.placesnearby
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.material3.*
import androidx.compose.ui.graphics.Color

class PlacesNearby {
    @Composable
    fun placesNearby(){
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = Color(0xFF191926)
        ){
            Text(text = "places nearby")
        }
    }
}
