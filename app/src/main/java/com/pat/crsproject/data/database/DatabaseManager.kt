package com.pat.crsproject.data.database

import androidx.room.Room
import com.pat.crsproject.CRSApplication


private class DatabaseManagerImpl(
    override val database: CRSProjectDatabase
) : DatabaseManager

interface DatabaseManager {

    val database: CRSProjectDatabase

    companion object {
        private const val DATABASE_NAME = "crs.db"

        @Volatile
        private var databaseManager: DatabaseManager? = null

        var override: DatabaseManager? = null

        fun getInstance(app: CRSApplication? = null): DatabaseManager {
            return override
                ?: databaseManager ?: synchronized(this) {
                DatabaseManagerImpl(
                    Room.databaseBuilder(
                        app ?: throw IllegalStateException("No Application"),
                        CRSProjectDatabase::class.java,
                        DATABASE_NAME
                    ).build()
                ).also {
                    databaseManager = it
                }
            }
        }

    }
}