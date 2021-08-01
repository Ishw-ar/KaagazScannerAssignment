package com.varsha.myapplication.views

import android.app.Application
import com.varsha.myapplication.data.CameraDatabase
import com.varsha.myapplication.repository.CameraRepository

class CameraApplication: Application() {

    val cameraDAO by lazy {
        val roomDatabase=CameraDatabase.getDatabase(this)
        roomDatabase.getCameraDAO()
    }
    val cameraRepository by lazy {
        CameraRepository(cameraDAO)
    }


}