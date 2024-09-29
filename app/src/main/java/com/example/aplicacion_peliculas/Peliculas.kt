package com.example.aplicacion_peliculas

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.ModifierLocal
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun Peliculas(navController:NavController, usuarios: MutableList<Usuarios> ) {


    Column(
        modifier = Modifier
            .fillMaxSize()
             .background(Color.LightGray),

        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        var Nombre by remember { mutableStateOf("") }
        var Years by remember { mutableStateOf("") }
        var URL by remember { mutableStateOf("") }

        Text(text = "Peliculas",
            fontFamily = FontFamily.Serif,
            fontWeight = FontWeight.Bold,
            fontSize =  20.sp
        )
        Spacer(modifier = Modifier.size(16.dp))

        TextField(
            value = Nombre,
            onValueChange = { Nombre = it },
            label = {
                Text(text = "Digite el nombre")
            }
        )
        Spacer(modifier = Modifier.size(16.dp))

        TextField(
            value = Years,
            onValueChange = { Years = it },
            label = {
                Text(text = "Digite el año")
            }
        )
        Spacer(modifier = Modifier.size(16.dp))

        TextField(
            value = URL,
            onValueChange = { URL = it },
            label = {
                Text(text = "Digite el URL")
            }
        )
        Spacer(modifier = Modifier.size(16.dp))


        Spacer(modifier = Modifier.size(16.dp))

        Button(onClick = {
            var nuevoUsuario = Usuarios(Nombre, Years, URL)
            usuarios.add(nuevoUsuario)
            navController.navigate("Lista_de_peliculas")

        }) {
            Text(text = "Buscar pelicula")
        }


    }
}


