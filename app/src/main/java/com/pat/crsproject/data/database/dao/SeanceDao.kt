package com.pat.crsproject.data.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Transaction
import com.pat.crsproject.data.model.Seance
import com.pat.crsproject.data.model.TagWithSeances

@Dao
interface SeanceDao {

    @Query("SELECT * FROM seance")
    fun selectAll(): List<Seance>

    @Query("SELECT COUNT(*) from seance")
    fun getCount(): Int

    @Insert
    fun insert(seance: Seance)

    @Transaction
    @Query("SELECT * FROM tag")
    fun getAllTagWithSeances(): List<TagWithSeances>

    @Transaction
    @Query("SELECT * FROM tag WHERE tag_id=:tag_id")
    fun getTagWithSeances(tag_id: Int): TagWithSeances
}