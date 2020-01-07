package com.pat.crsproject.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "pellicule")
data class Pellicule(
    @PrimaryKey(autoGenerate = true)
    @SerializedName("pellicule_id") val id: Int,
    @SerializedName("nom") val nom: String,
    @SerializedName("nombre_pause") val nombre_pause: String,
    @SerializedName("iso") val iso: String
)