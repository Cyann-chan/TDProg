package com.example.tdprog.presentation.list.api

import com.example.tdprog.presentation.list.Pokemon

data class PokemonListResponse(
    val count: Int,
    val next: String,
    val results: List<Pokemon>
)