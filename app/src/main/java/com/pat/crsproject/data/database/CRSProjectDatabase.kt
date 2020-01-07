package com.pat.crsproject.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.pat.crsproject.data.model.*

@Database(
    entities = [
        Appareil::class,
        Objectif::class,
        Pellicule::class,
        Photo::class,
        Seance::class,
        Tag::class
    ],
    version = 1,
    exportSchema = true
)
abstract class CRSProjectDatabase : RoomDatabase() {
    //abstract val episodeDao: EpisodeDao
}