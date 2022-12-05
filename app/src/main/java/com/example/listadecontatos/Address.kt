package com.example.listadecontatos

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class Address(
    @SerializedName("cep")
    val cep:String? = null,
    @SerializedName("logradouro")
    val logradouro:String? = null,
    @SerializedName("bairro")
    val bairro:String? = null,
    @SerializedName("localidade")
    val localidade:String? = null,
    @SerializedName("uf")
    val uf:String? = null
): Parcelable