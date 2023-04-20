package com.example.SoundScape_Android

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.SoundScape_Android.app.screens.locationdetails.LocationDetails
import androidx.navigation.compose.rememberNavController
import com.example.SoundScape_Android.app.screens.home.Home
import com.example.SoundScape_Android.app.screens.markersroutes.MarkersRoutes
import com.example.SoundScape_Android.app.screens.placesnearby.PlacesNearby


object Routes{
        const val HomeScreen = "home"
        const val Location_Details = "location_details"
        const val Markers = "markers"
        const val Routes = "routes"
        const val Places_Nearby = "places_nearby"

}

@Composable
fun Navigation(){
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Routes.HomeScreen
    ){
        composable(Routes.HomeScreen){
            Home().Home_Preview(navController = navController)
        }
        composable(Routes.Location_Details){
            LocationDetails().locationDetails(navController = navController)
        }
        composable(Routes.Markers){
            MarkersRoutes().markers(navController = navController)
        }
        composable(Routes.Routes){
            MarkersRoutes().routes(navController = navController)
        }
        composable(Routes.Places_Nearby){
            PlacesNearby().placesNearby(navController = navController)
        }
    }
}
