package com.zaeem.weatherappcompose.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.zaeem.weatherappcompose.R
import com.zaeem.weatherappcompose.ui.theme.TitleStyle
import com.zaeem.weatherappcompose.ui.theme.WeatherAppComposeTheme


@Composable
fun HomeTitle(title: String, onSearchClicked: () -> Unit) {

    Box(modifier = Modifier.fillMaxWidth()) {

        Text(
            text = title,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .align(Alignment.Center)
                .padding(10.dp),
            style = TitleStyle
        )

        Row(
            modifier = Modifier
                .align(Alignment.CenterEnd)
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_search),
                contentDescription = "",
                modifier = Modifier
                    .height(24.dp)
                    .width(24.dp)
                    .clickable { onSearchClicked() }
            )

            Spacer(modifier = Modifier.padding(8.dp))
        }

    }

}

@Preview(showBackground = true)
@Composable
fun HomeTitlePreview() {
    WeatherAppComposeTheme {
        HomeTitle(title = "Pakistan") {
        }
    }
}
