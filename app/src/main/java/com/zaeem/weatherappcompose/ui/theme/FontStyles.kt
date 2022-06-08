package com.zaeem.weatherappcompose.ui.theme

import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.zaeem.weatherappcompose.R


val OpenSansFamily = FontFamily(
    Font(R.font.opensans_regular, FontWeight.Normal),
    Font(R.font.opensans_medium, FontWeight.Medium),
    Font(R.font.opensans_bold, FontWeight.Bold)
)

val TitleStyle = TextStyle(
    fontFamily = OpenSansFamily,
    fontWeight = FontWeight.Bold,
    fontSize = 16.sp,
    color = Purple700
)