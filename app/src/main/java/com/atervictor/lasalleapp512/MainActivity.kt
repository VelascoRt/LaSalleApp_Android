package com.atervictor.lasalleapp512

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.atervictor.lasalleapp512.ui.screen.HomeScreen
import com.atervictor.lasalleapp512.ui.theme.LaSalleApp512Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LaSalleApp512Theme {
                    Scaffold (
                        modifier = Modifier.fillMaxSize()
                    ) { innerPadding ->
                        HomeScreen(innerPadding = innerPadding)
                    }
                }
            }
        }
    }