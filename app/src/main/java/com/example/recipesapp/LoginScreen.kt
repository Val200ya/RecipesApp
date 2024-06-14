package com.example.recipesapp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LoginScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .paint(painterResource(id = R.drawable.food_background),
                contentScale = ContentScale.FillBounds),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(text = "Recipes Site",
            modifier = Modifier
                .padding(25.dp),
                fontSize = 40.sp,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Bold,
            color = Color.Red)
        TextField(value = "", onValueChange = {},
            label = { Text(text = "Login")},
            modifier = Modifier
                .padding(5.dp)
        )
        TextField(value = "", onValueChange = {},
            label = { Text(text = "Password")},
            modifier = Modifier
                .padding(10.dp)
        )
        Button(onClick = { /*TODO*/ },
            modifier = Modifier
                .padding(25.dp)
                .width(125.dp)
                .height(50.dp)
        ) {
            Text(text = "Enter",
                fontSize = 20.sp)
        }
    }
}