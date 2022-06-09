package com.zaeem.weatherappcompose.ui.screens

import android.widget.Toast
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.zaeem.weatherappcompose.ui.components.HomeTitle
import com.zaeem.weatherappcompose.ui.components.WeatherFullCard
import com.zaeem.weatherappcompose.ui.theme.WeatherAppComposeTheme

@Composable
fun HomeScreen(navController: NavHostController) {

    Column(modifier = Modifier.fillMaxSize()) {
        val context = LocalContext.current
        Spacer(modifier = Modifier.padding(12.dp))
        HomeTitle(title = "Pakistan", onSearchClicked = {
            Toast.makeText(
                context,
                "Search clicked..!",
                Toast.LENGTH_SHORT
            ).show()
        })
        Spacer(modifier = Modifier.padding(12.dp))
        WeatherFullCard("25", "Clouds & Sun", "35")
    }


}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    WeatherAppComposeTheme {
        HomeScreen(navController = rememberNavController())
    }
}
