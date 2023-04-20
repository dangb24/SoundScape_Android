package com.example.SoundScape_Android.app.screens.placesnearby

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.KeyboardArrowRight
import androidx.compose.material.icons.outlined.LocationOn
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.SoundScape_Android.Routes
import com.example.SoundScape_Android.app.screens.composable.Menu
import com.example.SoundScape_Android.app.screens.composable.Top_Bar

class PlacesNearby {
//    @Preview
    @Composable
    fun placesNearby(
        modifier: Modifier = Modifier,
        name: String = "Places Nearby",
        menu: List<String> = listOf("All Places", "Public Transit", "Food & Drink", "Things to Do", "Groceries & Convenience Stores", "Bank & ATMs"),
        navController: NavController


    ){
        Column(modifier = Modifier){
            Top_Bar(name = "Places Nearby", route = "HomeScreen", navController = navController)
            for (item in menu){
                placesMenu(name = item, screen = "filler", navController = navController)
            }
        }

    }

    @Composable
    fun placesMenu(name: String, screen: String, navController: NavController){
        Row(modifier = Modifier
            .background(color = MaterialTheme.colorScheme.primary)
            .border(width = 1.dp, color = Color(0xFF2A3C5F), shape = RectangleShape)
            .padding(horizontal = 10.dp, vertical = 5.dp))
        {
            Column() {
//                IconButton(onClick = { navController.navigate(screen)}) {
//                    Icon(Icons.Default, contentDescription = "Localized description", tint = Color.White)
//                }
            }
            Column(modifier = Modifier
                .weight(1F)
                .padding(vertical = 10.dp)) {
                Text(text = name, fontSize = 18.sp, color = Color.White)
            }
            Column(modifier = Modifier){
                IconButton(onClick = { navController.navigate(screen)}) {
                    Icon(Icons.Outlined.KeyboardArrowRight, contentDescription = "Localized description", tint = Color.White)
                }
            }
        }
    }
}
