package com.task.navigationcompose2

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.task.navigationcompose2.navigation.ScreenB

@Composable
fun HomeScreen(modifier: Modifier = Modifier, navController: NavController) {
    Box(modifier = modifier, contentAlignment = Alignment.Center) {
        Text(modifier = Modifier.clickable {
            navController.navigate(ScreenB("Premila Ramalingam", 60))
        }, text = "Home screeen", color = Color.Red, fontSize = 32.sp)
    }
}


@Preview
@Composable
private fun HomeScreenPreview(modifier: Modifier = Modifier) {
    HomeScreen(modifier = modifier, rememberNavController())
}