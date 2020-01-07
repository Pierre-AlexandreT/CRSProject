package com.pat.crsproject.data.model

import com.google.gson.annotations.SerializedName


data class Seance(
    @SerializedName("id") val id: Int,
    @SerializedName("titre") val titre: String,
    @SerializedName("lieu") val lieu: String,
    @SerializedName("date") val date: String,
    @SerializedName("description") val description: String
)