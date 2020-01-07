package com.pat.crsproject.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.pat.crsproject.data.model.Photo
import com.pat.crsproject.data.repository.PhotoRepository
import kotlinx.coroutines.launch

class PhotoViewModel(
    private val repository: PhotoRepository
) : ViewModel() {

    fun insertPhoto(photo: Photo) {
        viewModelScope.launch {
            repository.insertPhoto(photo)
        }
    }

    fun getPhotos(onSuccess: OnSuccess<List<Photo>>) {
        viewModelScope.launch {
            repository.getAllPhotos()?.run(onSuccess)
        }
    }

    companion object Factory : ViewModelProvider.Factory {
        @Suppress("UNCHECKED_CAST")
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            return PhotoViewModel(PhotoRepository.instance) as T
        }
    }
}