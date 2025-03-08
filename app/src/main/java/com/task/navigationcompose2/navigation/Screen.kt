package com.task.navigationcompose2.navigation

sealed class Screen(val route : String) {
    data object HomeScreen : Screen("home_screen")
    data object DetailsScreen : Screen("details_screen")
}