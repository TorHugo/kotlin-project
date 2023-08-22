package com.example.fiap_jetpack_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.fiap_jetpack_compose.ui.theme.MyAgeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Conteúdo que será exibito na tela.
        setContent {
            MyAgeTheme {
                // Melhora a configuração de estilo.
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ComponentMain()
                }
            }
        }
    }
}

@Composable
fun ComponentMain() {
    Column() {
        Text(
            text = "Qual a sua idade?",
            color = Color.Gray,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth()
        )
        Text(
            text = "Adicione a sua idade.",
            fontSize = 12.sp,
            color = Color.Blue,
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth()
        )
        Row (modifier = Modifier.fillMaxWidth()){
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFD617C3), contentColor = Color(0xFF000000))
            ) {
                Text(text = "-", fontSize = 24.sp)
            }
            Button(onClick = {},
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFD617C3), contentColor = Color(0xFF000000))
            ) {
                Text(text = "+", fontSize = 24.sp)
            }
        }
    }
}

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun ComponentePreview() {
    ComponentMain()
}