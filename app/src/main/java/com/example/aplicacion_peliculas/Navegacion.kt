package com.example.aplicacion_peliculas

import android.annotation.SuppressLint
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.aplicacion_peliculas.ui.theme.Aplicacion_PeliculasTheme

@Preview(showBackground = true)
@Composable
fun NavigationExample1(){

    val navController = rememberNavController()
    val usuarios = remember { mutableStateListOf<Usuarios>()}

    NavHost(navController = navController, startDestination = "Peliculas" )
    {
        composable( "Peliculas"){
            Peliculas(navController, usuarios)
        }

        composable( "Lista_de_peliculas"){

            Lista_de_peliculas(navController, usuarios)
        }

    }
}