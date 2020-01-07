package com.pat.crsproject.data.model

import com.google.gson.annotations.SerializedName

data class Appareil(
    @SerializedName("id") val id: Int,
    @SerializedName("nom") val nom: String
)