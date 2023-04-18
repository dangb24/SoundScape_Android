package com.example.SoundScape_Android.app.screens.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.KeyboardArrowLeft
import androidx.compose.material.icons.outlined.KeyboardArrowRight
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController


@Composable
    fun Menu(name: String, screen: String, navController: NavController, right_pad: Int, left_pad: Int) {
        Row(modifier = Modifier
            .padding(start = right_pad.dp, end = left_pad.dp)
            .background(color = MaterialTheme.colorScheme.primary)
            .border(width = 1.dp, color = Color(0xFF2A3C5F), shape = RectangleShape)
            .padding(horizontal = 10.dp, vertical = 5.dp)) {
            Column(modifier = Modifier
                .weight(1F)
                .padding(vertical = 10.dp)) {
                Text(text = name, fontSize = 20.sp, color = Color.White)
                }
            IconButton(onClick = { navController.navigate(screen)}) {
                Icon(Icons.Outlined.KeyboardArrowRight, contentDescription = "Localized description", tint = Color.White)
            }
        }
    }
@Composable
    fun Top_Bar(name: String){
        Surface(
            color = Color(0xFF374A77),
            modifier = Modifier
        ){
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 10.dp), verticalAlignment = Alignment.Top){
                Column(modifier = Modifier.padding(top = 20.dp)){
                        IconButton(onClick = { /* doSomething() */ }) {
                            Icon(Icons.Outlined.KeyboardArrowLeft, contentDescription = "Localized description", modifier = Modifier.size(80.dp), tint = Color.White)
                        }
                }
                Column(modifier = Modifier.padding(top = 28.dp), verticalArrangement = Arrangement.Center) {
                    Text("Back",color = Color(0xFFFFFFFF), fontSize = 20.sp)
                }
                Column(modifier = Modifier.padding(top = 28.dp, start = 50.dp), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center){
                    Text(text = name, color = Color(0xFFFFFFFF), fontWeight = FontWeight.Bold, fontSize = 20.sp)
                }
            }

        }
    }



