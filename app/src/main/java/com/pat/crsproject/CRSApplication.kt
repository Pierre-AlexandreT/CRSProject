package com.pat.crsproject

import android.app.Application
import com.pat.crsproject.data.database.DatabaseManager

/**
 * New entry point of the application (Referenced in the manifests)
 */
class CRSApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        initDatabase()
    }

    // Init the database access
    private fun initDatabase() {
        DatabaseManager.getInstance(this)
    }
}