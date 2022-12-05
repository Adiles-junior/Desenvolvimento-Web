package com.example.listadecontatos

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface Api {
    companion object {
        const val BASE_URL = "https://viacep.com.br/"
    }

    @GET("/ws/" + "{cep}" + "/json/")
    fun getAddress(@Path("cep") cep: String): Call<List<Address>>

}