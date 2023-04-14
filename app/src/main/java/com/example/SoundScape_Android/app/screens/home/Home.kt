package com.example.SoundScape_Android.app.screens.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.SoundScape_Android.*
import com.example.SoundScape_Android.app.screens.composable.Menu

class Home {
    @Composable
    fun SearchFieldWithIcons() {
        var text by remember { mutableStateOf(TextFieldValue("")) }
        return TextField(
            modifier = Modifier.padding(vertical = 70.dp, horizontal = 20.dp).fillMaxWidth(),
            value = text,
            leadingIcon = { Icon(imageVector = Icons.Default.Search, contentDescription = "searchIcon") },
            onValueChange = {
                text = it
            },
            placeholder = { Text(text = "Choose Destination") },
        )
    }

    @Preview
    @Composable
    fun Home_Preview(
        modifier: Modifier = Modifier,
        names: List<String> = listOf("Places Nearby", "Markers & Routes", "Current Location")
    ) {
        Column(modifier = Modifier) {
            SearchFieldWithIcons()
            for (name in names) {
                Menu(name = name)
            }
        }
    }
}