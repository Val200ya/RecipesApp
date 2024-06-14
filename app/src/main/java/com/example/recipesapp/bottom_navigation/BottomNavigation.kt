package com.example.recipesapp.bottom_navigation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState

@Composable
fun BottomNavigation(
    navController: NavController
) {
    val listItems = listOf(
        BottomItem.Screen1,
        BottomItem.Screen2
    )
    NavigationBar(
        modifier = Modifier
            .background(Color(245, 108, 10))
    ) {
        val backStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = backStackEntry?.destination?.route
        listItems.forEach{ item ->
            NavigationBarItem(
                selected = currentRoute == item.route,
                onClick = {
                          navController.navigate(item.route)
                          },
                icon = {
                    Icon(painter = painterResource(id = item.iconId), contentDescription = "item",
                        modifier = Modifier
                            .size(30.dp))
                },
                label = {
                    Text(text = item.title, fontSize = 11.sp)
                },
                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = Color(148,65,6),
                    unselectedIconColor = Color(196, 86, 8)
                ))
        }
    }
}