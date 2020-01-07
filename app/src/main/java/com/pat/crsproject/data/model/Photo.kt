package com.pat.crsproject.data.model

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.ForeignKey.CASCADE
import androidx.room.ForeignKey.RESTRICT
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "photo")
data class Photo(
    @PrimaryKey(autoGenerate = true)
    @SerializedName("photo_id") val id: Int,
    @SerializedName("numero") val numero: Int,
    @SerializedName("mode") val mode: String,
    @SerializedName("focal") val focal: String,
    @SerializedName("temps_pause") val temps_pause: String,
    @SerializedName("latitude") val latitude: String,
    @SerializedName("longitude") val longitude: String,
    @SerializedName("seance_id") val seance_id: Int,
    @SerializedName("appareil_id") val appareil_id: Int,
    @SerializedName("objectif_id") val objectif_id: Int,
    @SerializedName("pellicule_id") val pellicule_id: Int
)