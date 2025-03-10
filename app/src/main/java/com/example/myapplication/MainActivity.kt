package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                }
            }
        }
    }
}

@Composable
fun app(){
    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row (
            Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ){
            Column (
                Modifier
                    .fillMaxWidth(),
                Arrangement.Center
            ) {
                var nome = "Nome"
                TextField(
                    value = nome,
                    onValueChange = { nome = it },
                    label = { Text("Nome") }
                )
            }
        }

        Row (
            Modifier.fillMaxHeight(0.01f)
        )
        {

        }

        Row (
            Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ){
            Column (
                Modifier
                    .fillMaxWidth(),
                Arrangement.Center
            ) {
                var endereco = "Endereço"
                TextField(
                    value = endereco,
                    onValueChange = { endereco = it },
                    label = { Text("Endereço") }
                )
            }
        }

        Row (
            Modifier.fillMaxHeight(0.01f)
        )
        {

        }

        Row (
            Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ){
            Column (
                Modifier
                    .fillMaxWidth(),
            ) {
                var bairro = "Bairro"
                TextField(
                    value = bairro,
                    onValueChange = { bairro = it },
                    label = { Text("Bairro") }
                )
            }
        }

        Row (
            Modifier.fillMaxHeight(0.01f)
        )
        {

        }

        Row (
            Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ){
            Column (
                Modifier
                    .fillMaxWidth(),
                Arrangement.Center
            ) {
                var cep = "CEP"
                TextField(
                    value = cep,
                    onValueChange = { cep = it },
                    label = { Text("CEP") }
                )
            }
        }
        Row (
            Modifier.fillMaxHeight(0.01f)
        )
        {

        }

        Row (
            Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ){
            Column (
                Modifier
                    .fillMaxWidth(),
                Arrangement.Center
            ) {
                var cidade = "Cidade"
                TextField(
                    value = cidade,
                    onValueChange = { cidade = it },
                    label = { Text("Cidade") }
                )
            }
        }

        Row (
            Modifier.fillMaxHeight(0.01f)
        )
        {

        }

        Row (
            Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ){
            Column (
                Modifier
                    .fillMaxWidth(),
                Arrangement.Center
            ) {
                var estado = "Estado"
                TextField(
                    value = estado,
                    onValueChange = { estado = it },
                    label = { Text("Estado") }
                )
            }
        }

        Row {
            Column (
                Modifier
                    .fillMaxWidth(0.5f),
                Arrangement.Center
            ){
                Button(onClick = { }) {
                    Text("Cadastrar")
                }
            }
            Column (
            ){
                Button(onClick = { }) {
                    Text("Cancelar")
                }
            }
        }
    }
}

@Preview
@Composable
fun previewApp(){
    MyApplicationTheme {
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
            app()
        }
    }
}