package com.pat.crsproject.data.model

import com.google.gson.annotations.SerializedName

data class Objectif(
    @SerializedName("id") val id: Int,
    @SerializedName("nom") val nom: String,
    @SerializedName("marque") val marque: String,
    @SerializedName("focal_min") val focal_min: String,
    @SerializedName("focal_max") val focal_max: String
)