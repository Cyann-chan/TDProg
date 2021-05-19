package com.example.tdprog.presentation.presentation.api

import com.example.tdprog.presentation.presentation.list.Pokemon

data class PokemonListResponse(
    val count: Int,
    val next: String,
    val results: List<Pokemon>
)