package com.ramesh.jetpackcompose.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun UserInputScreen(navController: NavHostController) {
    Surface(
        modifier = Modifier.fillMaxSize().clickable {
            navController.navigate(Routes.WELCOME)
        }
    ) {

        Text(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp),
            text = Routes.USER_INPUT
        )
    }
}

@Preview
@Composable
fun UserInputScreenPreview() {
    UserInputScreen(rememberNavController())
}