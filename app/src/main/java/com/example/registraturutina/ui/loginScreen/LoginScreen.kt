package com.example.registraturutina.ui.loginScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.registraturutina.ui.components.TextFieldComponent

@Preview(showSystemUi = true)
@Composable
fun LoginScreen() {
    Column(
        Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .padding(horizontal = 28.dp).padding(bottom = 120.dp, top = 80.dp),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Header()

        Body()

        Footer()
    }
}

@Composable
fun Header() {
    Text(
        text = "Entra a tu cuenta",
        color = MaterialTheme.colorScheme.primary,
        style = MaterialTheme.typography.titleLarge,
        fontSize = 40.sp,
        fontWeight = FontWeight.Bold
    )
}

@Composable
fun Body() {
    Column(Modifier.fillMaxWidth()) {
        TextFieldComponent("Email", "", {  }, false)

        Spacer(Modifier.size(14.dp))

        TextFieldComponent("Contraseña", "", {  }, true)

        Spacer(Modifier.size(14.dp))

        Button(
            onClick = { },
            shape = MaterialTheme.shapes.small,
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Text("Entrar")
        }
    }
}

@Composable
fun Footer() {
    Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            "¿Olvidaste tu contraseña?",
            textDecoration = TextDecoration.Underline,
            color = MaterialTheme.colorScheme.primary,
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.bodyMedium
        )
        Spacer(Modifier.size(4.dp))
        Row {
            Text(
                "¿Eres nuevo por acá?",
                style = MaterialTheme.typography.bodyMedium
            )
            Spacer(Modifier.size(2.dp))
            Text(
                "Regístrate",
                textDecoration = TextDecoration.Underline,
                color = MaterialTheme.colorScheme.primary,
                style = MaterialTheme.typography.bodyMedium
            )
        }
    }
}
