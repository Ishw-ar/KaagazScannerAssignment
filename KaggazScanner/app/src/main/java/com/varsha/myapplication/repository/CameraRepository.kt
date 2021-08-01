package com.varsha.myapplication.repository

import androidx.lifecycle.LiveData
import com.varsha.myapplication.data.CameraDAO
import com.varsha.myapplication.data.CameraEntity
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class CameraRepository(val cameraDAO: CameraDAO) {

    fun addImage(cameraEntity: CameraEntity){
        CoroutineScope(Dispatchers.IO).launch {
            cameraDAO.insert(cameraEntity)
        }
    }
    fun getImage(): LiveData<List<CameraEntity>> {
        return cameraDAO.getImage()
    }

}