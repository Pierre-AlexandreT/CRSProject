package com.pat.crsproject.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "objectif")
data class Objectif(
    @PrimaryKey(autoGenerate = true)
    @SerializedName("objectif_id") val id: Int,
    @SerializedName("nom") val nom: String,
    @SerializedName("marque") val marque: String,
    @SerializedName("focal_min") val focal_min: String,
    @SerializedName("focal_max") val focal_max: String
)