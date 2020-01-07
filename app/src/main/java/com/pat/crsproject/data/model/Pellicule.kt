package com.pat.crsproject.data.model

import com.google.gson.annotations.SerializedName

data class Pellicule(
    @SerializedName("id") val id: Int,
    @SerializedName("nom") val nom: String,
    @SerializedName("nombre_pause") val nombre_pause: String,
    @SerializedName("iso") val iso: String
)