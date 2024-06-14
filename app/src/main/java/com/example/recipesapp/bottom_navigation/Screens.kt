package com.example.recipesapp.bottom_navigation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.recipesapp.R

@Composable
fun Screen1() {
    Text(
        modifier = Modifier
            .fillMaxSize()
            .paint(
                painterResource(id = R.drawable.menu_background),
                contentScale = ContentScale.FillBounds
            )
            .padding(80.dp),
        text = "Menu",
        textAlign = TextAlign.Center,
        fontSize = 25.sp,
        fontWeight = FontWeight.Bold
    )
}

@Composable
fun Screen2() {
    Text(
        modifier = Modifier
            .fillMaxSize()
            .paint(painterResource(id = R.drawable.favorites_background),
                contentScale = ContentScale.FillBounds)
            .padding(80.dp),
        text = "Favorites",
        textAlign = TextAlign.Center,
        fontSize = 25.sp,
        fontWeight = FontWeight.Bold)
}