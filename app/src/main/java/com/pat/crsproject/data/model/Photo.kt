package com.pat.crsproject.data.model

import com.google.gson.annotations.SerializedName

data class Photo(
    @SerializedName("id") val id: Int,
    @SerializedName("numero") val numero: Int,
    @SerializedName("mode") val mode: String,
    @SerializedName("focal") val focal: String,
    @SerializedName("temps_pause") val temps_pause: String,
    @SerializedName("latitude") val latitude: String,
    @SerializedName("longitude") val longitude: String,
    @SerializedName("seance_id") val seance_id: Int
)