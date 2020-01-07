package com.pat.crsproject.data.model

import androidx.room.*
import com.google.gson.annotations.SerializedName

@Entity(tableName = "seance")
data class Seance(
    @PrimaryKey(autoGenerate = true)
    @SerializedName("seance_id") val seance_id: Int,
    @SerializedName("titre") val titre: String,
    @SerializedName("lieu") val lieu: String,
    @SerializedName("date") val date: String,
    @SerializedName("description") val description: String
)

@Entity(tableName = "tag")
data class Tag(
    @PrimaryKey(autoGenerate = true)
    @SerializedName("tag_id") val tag_id: Int,
    @SerializedName("libelle") val libelle: String
)

@Entity(primaryKeys = ["seance_id", "tag_id"])
data class SeanceTagCrossRef(
    val seance_id: Long,
    val tag_id: Long
)

data class TagWithSeances(
    @Embedded val tag: Tag,
    @Relation(
        parentColumn = "tag_id",
        entityColumn = "seance_id",
        associateBy = Junction(SeanceTagCrossRef::class)
    )
    val seances: List<Seance>
)