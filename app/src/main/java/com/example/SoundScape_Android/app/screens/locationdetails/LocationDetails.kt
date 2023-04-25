package com.example.SoundScape_Android.app.screens.locationdetails


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Map
import androidx.compose.material.icons.filled.Navigation
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.outlined.AddLocation
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.material3.*
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.SoundScape_Android.Routes
import com.example.SoundScape_Android.app.screens.composable.Top_Bar
import com.google.maps.android.compose.GoogleMap

class LocationDetails() {
    @Composable
    fun locationDetails(
        name: String = "Location Details",
        names: List<String> = listOf("Start Audio Beacon", "Save as Marker", "Soundscape Street Preview", "Share"),
        navController : NavController

    ){

        Column {
            Top_Bar(name = name, route = Routes.HomeScreen, navController = navController)
            Text("Near Sage Ave",
                color = Color.White,
                fontSize = 40.sp,
                modifier = Modifier.padding(start= 20.dp, top=30.dp, bottom=20.dp)
            )
            Row() {
                Icon(
                    Icons.Filled.Map,
                    contentDescription = "Localized description",
                    tint = Color.Yellow,
                    modifier = Modifier.padding(start=20.dp)
                )

                Text("0m",
                    color = Color.Yellow,
                    fontSize = 20.sp,
                    modifier = Modifier.padding(start=10.dp)
                )
            }
            Row() {
                Icon(
                    Icons.Filled.LocationOn,
                    contentDescription = "Localized description",
                    tint = Color(0XFFa0cbe1),
                    modifier = Modifier.padding(start=20.dp, top=20.dp)
                )
                Text("Near Sage Ave, Troy NY 12180",
                    color = Color(0XFFa0cbe1),
                    fontSize = 20.sp,
                    modifier = Modifier.padding(top=20.dp, start = 10.dp)
                )
            }
            for(i in names) {
                Surface(
                    color = Color(0xFF191926)
                ) {
                    Row(
                        modifier = Modifier
                            .drawBehind {

                                val borderSize = 1.dp.toPx()

                                drawLine(
                                    color = Color.LightGray,
                                    start = Offset(60.dp.toPx(), size.height),
                                    end = Offset(size.width, size.height),
                                    strokeWidth = borderSize
                                )
                            }
                            .padding(horizontal = 10.dp, vertical = 5.dp)
                    ) {
                        IconButton(onClick = { }) {
                            if(i==names[0]) {
                                Icon(
                                    Icons.Filled.LocationOn,
                                    contentDescription = "Localized description",
                                    tint = Color.White
                                )
                            }
                            else if(i==names[1]) {
                                Icon(
                                    Icons.Outlined.AddLocation,
                                    contentDescription = "Localized description",
                                    tint = Color.White
                                )
                            }
                            else if(i==names[2]) {
                                Icon(
                                    Icons.Filled.Navigation,
                                    contentDescription = "Localized description",
                                    tint = Color.White
                                )
                            }
                            else {
                                Icon(
                                    Icons.Filled.Share,
                                    contentDescription = "Localized description",
                                    tint = Color.White
                                )
                            }
                        }
                        Column(
                            modifier = Modifier
                                .weight(1F)
                                .padding(vertical = 10.dp)
                        ) {
                            Text(text = i, fontSize = 20.sp, color=Color.White)
                        }


                    }
                }
            }
            GoogleMap(
                modifier= Modifier.padding(top=5.dp)
            )

        }
    }
}

