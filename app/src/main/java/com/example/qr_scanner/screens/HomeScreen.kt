package com.example.qr_scanner.screens

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.qr_scanner.ViewModelAppClass

@Composable
fun HomeScreen(navController: NavHostController,ViewModelAppClass: ViewModelAppClass) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .border(1.dp, color = Color.Gray, RoundedCornerShape(16.dp)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(
            modifier = Modifier
                .wrapContentSize(),
            onClick = {
            },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Red,
                contentColor = Color.White
            )
        ) {
            Text(text = "Сканировать QR-код")
        }
    }
}
