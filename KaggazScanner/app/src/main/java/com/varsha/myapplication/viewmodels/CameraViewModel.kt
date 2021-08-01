package com.varsha.myapplication.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.varsha.myapplication.data.CameraEntity
import com.varsha.myapplication.repository.CameraRepository

class CameraViewModel( val cameraRepository: CameraRepository): ViewModel() {
    fun addImage(cameraEntity: CameraEntity){
        cameraRepository.addImage(cameraEntity)
    }
    fun getImage(): LiveData<List<CameraEntity>> {
        return cameraRepository.getImage()
    }

}