package com.zaeem.weatherappcompose.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.zaeem.weatherappcompose.ui.theme.WeatherAppComposeTheme


@Composable
fun WeatherFullCard() {

    Column(modifier = Modifier
        .background(Color.Transparent)
        .padding(12.dp)) {

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(335.dp),
            shape = RoundedCornerShape(30.dp)
        ) {


        }
    }

}

@Preview(showBackground = true)
@Composable
fun WeatherFullCardPreview() {
    WeatherAppComposeTheme {
        WeatherFullCard()
    }
}