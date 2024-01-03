package com.ramesh.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ramesh.jetpackcompose.ui.screens.JetPackNavigationGraph
import com.ramesh.jetpackcompose.ui.screens.Routes
import com.ramesh.jetpackcompose.ui.screens.UserInputScreen
import com.ramesh.jetpackcompose.ui.screens.WelcomeScreen
import com.ramesh.jetpackcompose.ui.theme.JetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeTheme {
                JetPackApp()

            }
        }
    }

    @Composable
    fun JetPackApp() {
        //Entry point - we have to create Nav host
        JetPackNavigationGraph()
    }
}


