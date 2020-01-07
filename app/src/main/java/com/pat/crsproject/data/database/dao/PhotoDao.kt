package com.pat.crsproject.data.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.pat.crsproject.data.model.Photo


@Dao
interface PhotoDao {

    @Query("SELECT * FROM photo")
    fun selectAll(): List<Photo>

    @Query("SELECT COUNT(*) from photo")
    fun getCount(): Int

    @Insert
    fun insert(photo: Photo)
}