package com.example.SoundScape_Android.app.screens.markersroutes

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.material3.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.SoundScape_Android.Routes
import com.example.SoundScape_Android.app.screens.composable.Top_Bar
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import com.example.SoundScape_Android.R


class MarkersRoutes {
    @Composable
    fun markersRoutes(
        bar: List<String> = listOf("Markers", "Routes"),
        name: String = "Markers & Routes",
        navController : NavController

    ){
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Top_Bar(name = name, route = Routes.HomeScreen, navController = navController)
            Image(
                painter = painterResource(id = R.drawable.location_marker),
                contentDescription = null,
                modifier = Modifier.padding(top= 50.dp, bottom = 20.dp)

            )
            Text("Getting Started with Markers",
                color = Color.White,
                textAlign = TextAlign.Center,
                fontSize = 30.sp
            )
            Text(
                "Create markers for your favorite destinations, waypoints on a route, or any locations you want" +
                        " called out. Simply choose a location, or even your current location, from the home screen and select " +
                        "\"Save as Marker\".\nTry marking your home, the entrance to your work, or your favorite spot in the park",
                color = Color.White,
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.weight(1F))
            BottomMenu(bar = bar)
        }

    }
    @Composable
    fun BottomMenu(bar: List<String>){

            Row(modifier = Modifier.fillMaxWidth().background(color = MaterialTheme.colorScheme.primary), verticalAlignment = Alignment.Bottom){
                for (item in bar) {
                    Column(modifier = Modifier) {
                        Box(modifier = Modifier
                            .size(100.dp)
                            .padding(12.dp), contentAlignment = Alignment.Center) {
                            Text(text = item, textAlign = TextAlign.Center)
                        }
                    }
                }
            }

        }
    }
  