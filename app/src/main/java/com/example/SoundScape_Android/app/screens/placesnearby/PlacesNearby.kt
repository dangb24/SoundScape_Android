package com.example.SoundScape_Android.app.screens.placesnearby

import android.graphics.Color
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
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
        Top_Bar(name = name, navController = navController, route= Routes.HomeScreen)
        for (item in menu){
            Menu(name = item, screen = Routes.HomeScreen, navController = navController, right_pad = 50, left_pad = 0)
        }
        
    }
}