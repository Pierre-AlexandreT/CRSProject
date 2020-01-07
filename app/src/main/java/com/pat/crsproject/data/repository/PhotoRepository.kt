package com.pat.crsproject.data.repository

import com.pat.crsproject.data.database.DatabaseManager
import com.pat.crsproject.data.database.dao.PhotoDao
import com.pat.crsproject.data.model.Photo
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

private class PhotoRepositoryImpl(
    private val dao: PhotoDao
) : PhotoRepository {

    override suspend fun insertPhoto(photo: Photo) {
        return withContext(Dispatchers.IO) {
            try {
                dao.insert(photo)
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }

    override suspend fun getAllPhotos(): List<Photo> {
        return withContext(Dispatchers.IO) {
            try {
                dao.selectAll()
            } catch (e: Exception) {
                e.printStackTrace()
                emptyList<Photo>()
            }
        }
    }
}

interface PhotoRepository {

    suspend fun insertPhoto(photo: Photo)

    suspend fun getAllPhotos() : List<Photo>

    companion object {

        val instance: PhotoRepository by lazy {
            PhotoRepositoryImpl(
                DatabaseManager.getInstance().database.photoDao
            )
        }
    }


}