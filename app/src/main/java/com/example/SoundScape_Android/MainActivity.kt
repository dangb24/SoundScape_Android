package com.example.SoundScape_Android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.SoundScape_Android.ui.theme.ComposableCodeLabTheme
import androidx.compose.foundation.layout.Row
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.outlined.KeyboardArrowRight
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.input.TextFieldValue

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposableCodeLabTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFF191926)
                ) {
                    MyPage()
                }
            }
        }
    }
}
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
fun MyPage(
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

@Composable
private fun Menu(name: String) {
    Surface(
        color = MaterialTheme.colorScheme.primary,
        modifier = Modifier.padding(vertical = 0.dp, horizontal = 20.dp)
    ) {
        Row(modifier = Modifier.border(width = 1.dp, color = Color(0xFF2A3C5F), shape = RectangleShape).padding(10.dp)) {
            Column(modifier = Modifier.weight(1F).padding(vertical = 10.dp)) {
                Text(text = name)
            }
            IconButton(onClick = { /* doSomething() */ }) {
                Icon(Icons.Outlined.KeyboardArrowRight, contentDescription = "Localized description")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposableCodeLabTheme {
        MyPage()
    }
}