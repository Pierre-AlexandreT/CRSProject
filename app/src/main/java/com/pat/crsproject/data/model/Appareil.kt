package com.pat.crsproject.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "appareil")
data class Appareil(
    @PrimaryKey(autoGenerate = true)
    @SerializedName("appareil_id") val id: Int,
    @SerializedName("nom") val nom: String
)