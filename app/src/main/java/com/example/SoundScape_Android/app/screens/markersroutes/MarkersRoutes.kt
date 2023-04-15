package com.example.SoundScape_Android.app.screens.markersroutes

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.material3.*
import androidx.compose.ui.graphics.Color

class MarkersRoutes {
    @Composable
    fun markersRoutes(){
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = Color(0xFF191926)
        ){
            Text(text = "markers and routes")
        }
    }
}
  