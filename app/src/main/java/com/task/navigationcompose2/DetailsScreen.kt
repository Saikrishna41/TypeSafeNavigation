package com.task.navigationcompose2

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.task.navigationcompose2.navigation.ScreenB

@Composable
fun DetailsScreen(modifier: Modifier = Modifier, args: ScreenB?) {
    Box(modifier = modifier, contentAlignment = Alignment.Center) {
        Column {
            Text(text = "DetailsScreen", color = Color.Blue, fontSize = 32.sp)
            Text(text = args?.name.toString(), color = Color.Blue, fontSize = 32.sp)
            Text(text = args?.age.toString(), color = Color.Blue, fontSize = 32.sp)
        }
    }
}


@Preview
@Composable
private fun DetailsScreenPreview(modifier: Modifier = Modifier) {
    DetailsScreen(
        modifier = modifier,
        args = ScreenB("", 0)
    )
}