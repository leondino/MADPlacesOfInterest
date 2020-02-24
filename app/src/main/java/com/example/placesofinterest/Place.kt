package com.example.placesofinterest

import androidx.annotation.DrawableRes

data class Place(
    var name: String,
    @DrawableRes var imageResId: Int
)
