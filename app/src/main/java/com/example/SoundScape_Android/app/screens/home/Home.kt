package com.example.SoundScape_Android.app.screens.home

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.SoundScape_Android.*
import com.example.SoundScape_Android.app.screens.composable.Menu

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
        Surface(
            modifier = Modifier.padding(top = 525.dp),
            color = MaterialTheme.colorScheme.primary
        ) {
            Row(modifier = Modifier.padding(12.dp)){
                Text("HEAR MY SURROUNDINGS")
            }
            Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.Bottom){
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

    @Preview
    @Composable
    fun Home_Preview(
        modifier: Modifier = Modifier,
        names: List<String> = listOf("Places Nearby", "Markers & Routes", "Current Location"),
        bar: List<String> = listOf("My Location", "Around Me", "Ahead of Me", "Nearby Markers")
    ) {
        Column(modifier = Modifier) {
            SearchFieldWithIcons()
            for (name in names) {
                Menu(name = name, right_pad = 20, left_pad = 20)
            }
        }
        BottomMenu(bar = bar)
    }
}