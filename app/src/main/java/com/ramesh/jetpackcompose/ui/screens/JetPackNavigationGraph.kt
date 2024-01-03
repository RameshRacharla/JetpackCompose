package com.ramesh.jetpackcompose.ui.screens

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun JetPackNavigationGraph() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Routes.USER_INPUT)
    {
        composable(Routes.USER_INPUT) {
            UserInputScreen(navController)
        }
        composable(Routes.WELCOME) {
            WelcomeScreen()
        }
    }
}