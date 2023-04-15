package com.example.SoundScape_Android.app.screens.composable

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.KeyboardArrowRight
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

    @Composable
    fun Menu(name: String, screen: String, navController: NavController) {
        Surface(
            color = MaterialTheme.colorScheme.primary,
            modifier = Modifier.padding(vertical = 0.dp, horizontal = 20.dp)
        ) {
            Row(modifier = Modifier.border(width = 1.dp, color = Color(0xFF2A3C5F), shape = RectangleShape).padding(horizontal = 10.dp, vertical = 6.dp)) {
                Column(modifier = Modifier.weight(1F).padding(vertical = 12.dp)) {
                    Text(text = name)
                }
                IconButton(onClick = { navController.navigate(screen)}) {
                    Icon(Icons.Outlined.KeyboardArrowRight, contentDescription = "Localized description")
                }
            }
        }
    }



