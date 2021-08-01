package com.varsha.myapplication.viewmodels


import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.varsha.myapplication.repository.CameraRepository

class CameraViewModelFactory(val cameraRepository: CameraRepository):ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return CameraViewModel(cameraRepository)as T
    }
}