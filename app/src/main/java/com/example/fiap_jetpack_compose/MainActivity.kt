package com.example.fiap_jetpack_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
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
                    Componente()
                }
            }
        }
    }
}

@Composable
fun Componente() {
    Column {
        Text(text = "Sua Idade: ")
        Text(text = "Adicione a sua idade.")
        Row {
            Button(onClick = { /*TODO*/ }) {
                Text(text = "-")
            }
            Button(onClick = { /*TODO*/ }) {
                Text(text = "+")
            }
        }
    }
}

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun ComponentePreview() {
    Componente()
}