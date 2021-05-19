package com.example.tdprog.presentation.list

import android.content.Context
import com.example.tdprog.presentation.list.PokeApplication.Companion.context
import com.example.tdprog.presentation.list.api.PokeApi
import okhttp3.Cache
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.io.File

class Singletons{
    companion object{
        var cache: Cache = Cache(File(context?.cacheDir, "response"), 10 * 1024 * 1024) //10 MiB

        val okhttpClient: OkHttpClient = OkHttpClient().newBuilder()
                .cache(cache)
                .build()

        val pokeApi: PokeApi = Retrofit.Builder()
                .baseUrl("https://pokeapi.co/api/v2/")
                .addConverterFactory(GsonConverterFactory.create())
                .client(okhttpClient)
                .build()
                .create(PokeApi::class.java)

        



    }
}