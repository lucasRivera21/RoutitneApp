package com.example.registraturutina.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp

@Composable
fun TextFieldComponent(label: String, value: String, onValueChange: () -> Unit, isPassword: Boolean) {
    OutlinedTextField(
        value = value,
        onValueChange = { onValueChange() },
        label = {
            Text(
                label,
                fontSize = 14.sp
            )
        },
        modifier = Modifier.fillMaxWidth(),
        singleLine = true
    )
}