package com.example.fiap_jetpack_compose

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Snackbar
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fiap_jetpack_compose.ui.theme.MyAgeTheme
import kotlinx.coroutines.launch
import java.util.Objects

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

    var idade = remember { mutableStateOf(0) }
    var showErrorDialog = remember { mutableStateOf(false) }


    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Text(
            text = "Qual a sua idade?",
            color = Color.Gray,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(15.dp))
        Text(
            text = "Adicione a sua idade.",
            fontSize = 12.sp,
            color = Color.Blue,
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(15.dp))
        Text(
            text = "${idade.value}",
            fontSize = 42.sp,
            color = Color(0xFF1DCA8D),
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(75.dp))
        Row (modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly){
            Button(
                onClick = {
                    if (idade.value == 0) {
                        showErrorDialog.value = true
                    } else {
                        idade.value--
                    }

                },
                modifier = Modifier.size(64.dp),
                shape = RectangleShape,
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFD617C3),
                                                        contentColor = Color(0xFF000000))
            ) {
                Text(text = "-", fontSize = 24.sp)
            }
            
            if (showErrorDialog.value) {
                AlertDialog(
                    onDismissRequest = { showErrorDialog.value = false },
                    title = { Text("Erro") },
                    text = { Text("Idade menor ou igual a zero.") },
                    confirmButton = {
                        Button(
                            onClick = { showErrorDialog.value = false }
                        ) {
                            Text("OK")
                        }
                    }
                )
            }

            Button(onClick = {
                if (idade.value in 0..129)
                    idade.value++
                    Log.i("ButtonAdding", "${idade.value}")

            },
                modifier = Modifier.size(64.dp),
                shape = RectangleShape,
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFD617C3),
                                                        contentColor = Color(0xFF000000))
            ) {
                Text(text = "+", fontSize = 24.sp)
            }
        }
        Spacer(modifier = Modifier.height(15.dp))

        val message = validaIdade(idade.value)
        Text(text = message)
    }
}

fun validaIdade(idade: Int) : String {
    if (idade <= 17)
        return "Menor de idade!"
    return "Maior de idade!"
}

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun ComponentePreview() {
    ComponentMain()
}