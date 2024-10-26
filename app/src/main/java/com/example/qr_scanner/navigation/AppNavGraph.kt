package com.example.qr_scanner.navigation

import android.os.Build
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.annotation.RequiresApi
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.qr_scanner.ViewModelAppClass
import com.example.qr_scanner.screens.HomeScreen

@RequiresApi(Build.VERSION_CODES.O)

@Composable
fun AppNavGraph() {
    val navController = rememberNavController()
    NavHost(navController, startDestination = "HomeScreen") {
        composable("HomeScreen") {
            val qrViewModel: ViewModelAppClass = hiltViewModel()
            HomeScreen(navController = navController,ViewModelAppClass = qrViewModel)
        }

    }
}