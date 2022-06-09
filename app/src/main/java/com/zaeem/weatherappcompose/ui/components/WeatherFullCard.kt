package com.zaeem.weatherappcompose.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.zaeem.weatherappcompose.R
import com.zaeem.weatherappcompose.ui.theme.*


@Composable
fun WeatherFullCard(temperature: String, temperatureStatus: String, humidity: String) {

    Box(
        modifier = Modifier
            .background(Color.Transparent)
            .padding(12.dp)
    ) {

        Box(
            contentAlignment = Alignment.TopCenter,
            modifier = Modifier
                .fillMaxWidth()
                .height(335.dp)
                .background(color = Color.White, shape = RoundedCornerShape(30.dp))
        ) {
            Image(
                painter = painterResource(id = R.drawable.weather_clouds),
                contentDescription = "",
                modifier = Modifier.fillMaxSize()
            )

            Column(
                modifier = Modifier.padding(top = 16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = "$temperature°", style = TemperatureStyle)
                Text(text = temperatureStatus, style = TemperatureStatusType)
                Spacer(modifier = Modifier.padding(8.dp))
                Text(text = "Humidity", style = HumidityStyle)
                Spacer(modifier = Modifier.padding(2.dp))
                Text(text = "$humidity°", style = TemperatureStyleMedium)

            }


        }
    }

}

@Preview(showBackground = true)
@Composable
fun WeatherFullCardPreview() {
    WeatherAppComposeTheme {
        WeatherFullCard("25", "Clouds & Sun", "25")
    }
}