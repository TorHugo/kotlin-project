package com.example.fiap_jetpack_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.fiap_jetpack_compose.ui.theme.FiapjetpackcomposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FiapjetpackcomposeTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.Gray
                ) {
                    LayoutScreen()
                }
            }
        }
    }
}

@Composable
fun LayoutScreen() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = {}) {
            Text(text = "Button...")
        }
        Button(onClick = {}) {
            Text(text = "Button...")
        }
        Button(onClick = {}) {
            Text(text = "Button...")
        }
        Column {
            Text(text = "FIAP")
            Text(text = "ANDROID")
            Text(text = "ANDROID STUDIO")
            Row (
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .height(300.dp)
                    .background(Color.Yellow)
                    .fillMaxWidth()
            ){
                Button(onClick = {}) {
                    Text(text = "Button...")
                }
                Button(onClick = {}) {
                    Text(text = "Button...")
                }
                Column (){
                    Button(onClick = {}) {
                        Text(text = "Button...")
                    }
                    Button(onClick = {}) {
                        Text(text = "Button...")
                    }
                    Button(onClick = {}) {
                        Text(text = "Button...")
                    }
                }
            }
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .background(Color.Blue)
                    .fillMaxWidth(),
            ){
                Button(onClick = {}) {
                    Text(text = "Button...")
                }
                Button(onClick = {}) {
                    Text(text = "Button...")
                }
                Button(onClick = {}) {
                    Text(text = "Button...")
                }
            }
        }
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun LayoutScreenPreview() {
    LayoutScreen()
}