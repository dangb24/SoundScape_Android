package com.example.SoundScape_Android.app.screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.SoundScape_Android.*
import com.example.SoundScape_Android.app.screens.composable.Menu
import androidx.navigation.NavController

class Home {
    @Composable
    fun SearchFieldWithIcons() {
        var text by remember { mutableStateOf(TextFieldValue("")) }
        return TextField(
            modifier = Modifier
                .padding(vertical = 60.dp, horizontal = 20.dp)
                .fillMaxWidth(),
            value = text,
            leadingIcon = { Icon(imageVector = Icons.Default.Search, contentDescription = "searchIcon") },
            onValueChange = {
                text = it
            },
            placeholder = { Text(text = "Choose Destination") },
        )
    }
    @Composable
    fun BottomMenu(bar: List<String>){

        val icons = listOf(Icons.Default.MyLocation, Icons.Default.ZoomOutMap, Icons.Default.Radar, Icons.Default.WhereToVote)

        Row(modifier = Modifier
            .fillMaxWidth()
            .background(color = MaterialTheme.colorScheme.primary)
            .padding(10.dp)
        )
        {
            Text("HEAR MY SURROUNDINGS", color = Color.White)

        }
        Row(modifier = Modifier
            .fillMaxWidth()
            .background(color = MaterialTheme.colorScheme.primary)
            .padding(vertical = 20.dp),
            verticalAlignment = Alignment.Bottom,
            horizontalArrangement = Arrangement.SpaceEvenly
        )
        {
            for (i in 0..3) {
                Column(modifier = Modifier.size(82.dp)) {
                    Box(modifier = Modifier.padding(horizontal = 30.dp).size(40.dp), contentAlignment = Alignment.Center){
                        Icon(icons[i], contentDescription = "none", tint = Color.White)
                    }
                    Text(text = bar[i], textAlign = TextAlign.Center, color = Color.White)
                }
            }
        }
    }


    @Composable
    fun Home_Preview(
        modifier: Modifier = Modifier,
        names: List<String> = listOf("Places Nearby", "Markers & Routes", "Current Location"),
        bar: List<String> = listOf("My Location", "Around Me", "Ahead of Me", "Nearby Markers"),
        route: List<String> = listOf(Routes.Places_Nearby,Routes.Markers, Routes.Location_Details),
        navController: NavController
    ) {
        Column(modifier = Modifier, verticalArrangement = Arrangement.SpaceBetween) {
            SearchFieldWithIcons()
            for (i in 0..2) {
                Menu(name = names[i], screen=route[i], navController = navController, right_pad = 20, left_pad = 20)
            }
            Spacer(modifier = Modifier.weight(1F))
            BottomMenu(bar = bar)
        }
    }
}