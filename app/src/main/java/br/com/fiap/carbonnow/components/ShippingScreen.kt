package br.com.fiap.carbonnow.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@Composable
fun ShippingScreen(modifier: Modifier = Modifier, navController: NavController) {
    NavBar(navController = navController)
}