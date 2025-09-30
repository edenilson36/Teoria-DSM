package com.example.miprimeraappcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.miprimeraappcompose.ui.theme.MiPrimeraAppComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MiPrimeraAppComposeTheme {
                // Aquí ya usamos MyApp() como pide la consigna
                MyApp()
            }
        }
    }
}

@Composable
fun MyApp() {
    var count by remember { mutableStateOf(0) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Mi primera App con Compose")
        Spacer(modifier = Modifier.height(16.dp))

        Text("Has presionado $count veces")
        Spacer(modifier = Modifier.height(16.dp))

        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
            Button(onClick = { count++ }) { Text("Sumar") }
            Button(onClick = { count = 0 }) { Text("Reiniciar") }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewMyApp() {
    MiPrimeraAppComposeTheme {
        MyApp()
    }
}
