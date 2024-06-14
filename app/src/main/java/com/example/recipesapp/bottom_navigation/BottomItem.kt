package com.example.recipesapp.bottom_navigation

import com.example.recipesapp.R

sealed class BottomItem(val title: String, val iconId: Int, val route: String) {
    object Screen1: BottomItem("Menu", R.drawable.menu_icon, "screen_1")
    object Screen2: BottomItem("Favorites", R.drawable.favorites_icon, "screen_2")
}