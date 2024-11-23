package com.example.registraturutina.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun PrimaryButton(title: String, onClickButton: () -> Unit) {
    Button(
        onClick = { onClickButton() }, shape = MaterialTheme.shapes.small,
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Text(text = title)
    }
}