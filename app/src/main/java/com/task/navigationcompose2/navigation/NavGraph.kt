package com.task.navigationcompose2.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.toRoute
import com.task.navigationcompose2.DetailsScreen
import com.task.navigationcompose2.HomeScreen
import kotlinx.serialization.Serializable


@Composable
fun NavGraph(
    modifier: Modifier = Modifier,
    navController: NavHostController,
) {
    NavHost(navController = navController, startDestination = ScreenA) {
        composable<ScreenA> {
            HomeScreen(modifier = modifier, navController)
        }
        composable<ScreenB> {
            val args = it.toRoute<ScreenB>()
            DetailsScreen(modifier = modifier,args)
        }
    }
}


@Serializable
object ScreenA


@Serializable
data class ScreenB(
    val name : String?,
    val age : Int
)




