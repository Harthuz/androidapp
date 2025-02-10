package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    app()
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun app(){
    Column (
        Modifier.fillMaxSize(),
        Arrangement.Center

    ){
        Row (
            Modifier.fillMaxWidth(),
            Arrangement.Center
        ) {
            Text("App aula")
        }
        Row (
            Modifier.fillMaxWidth(),
            Arrangement.Center
        ) {

        }
        Row (
            Modifier.fillMaxWidth(),
            Arrangement.Center
        ) {

        }
    }
}