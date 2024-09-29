package com.example.aplicacion_peliculas

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import org.jetbrains.annotations.Async

@Composable
fun Lista_de_peliculas(navController: NavController, usuarios: List<Usuarios>) {



    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray)
            .padding(30.dp)


    ) {
        item {

            Text(text = "Lista de peliculas",
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
                fontFamily = FontFamily.Serif,
                fontWeight = FontWeight.Bold,
                fontSize =  15.sp
            )
            usuarios.forEach { usuario ->

                Card(
                     modifier = Modifier
                    .fillMaxWidth()
                    .padding(15.dp)


                ) {

                    Text("Nombre:${usuario.nombre}\n " +
                            "Año:${usuario.years} ",
                            fontWeight = FontWeight.Bold,
                            fontFamily = FontFamily.Monospace,
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center,
                            color = Color.Black
                    )

                    AsyncImage(model = usuario.URL,
                        contentDescription ="Imagen",
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(200.dp)



                    )
                }
            }

            Button(onClick = { navController.popBackStack() }) {
                Text(text = "Volver",
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center
                )

            }
        }

    }

}