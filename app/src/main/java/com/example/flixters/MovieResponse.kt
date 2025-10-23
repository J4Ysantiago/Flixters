package com.example.flixters

import android.graphics.Movie

data class MovieResponse (
    val page: Int,
    val results: List<Movie>
)