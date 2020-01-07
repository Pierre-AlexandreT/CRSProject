package com.pat.crsproject.data.model

import com.google.gson.annotations.SerializedName

data class Tag(
    @SerializedName("id") val id: Int,
    @SerializedName("libelle") val libelle: String
)