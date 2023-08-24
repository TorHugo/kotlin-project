package com.example.fiap_jetpack_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.fiap_jetpack_compose.ui.theme.FiapjetpackcomposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FiapjetpackcomposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.size(width = 200.dp, height = 200.dp),
                    color = Color.Green,
                    contentColor = Color.Black,
                    shape = RoundedCornerShape(32.dp),
                    shadowElevation = 8.dp,
                        border = BorderStroke(width = 4.dp, color = Color.Cyan)
                ) {
                    Box(contentAlignment = Center)
                    {
                        Button(
                            onClick = {},
                            modifier = Modifier.offset(x = 0.dp, y = (-10).dp)
                            ) {
                            Text(
                                text = "Click"
                            )
                        }
                        Text(
                            text = "FIAP.",
                            modifier = Modifier.align(Alignment.BottomCenter)
                        )
                    }
                }
            }
        }
    }
}