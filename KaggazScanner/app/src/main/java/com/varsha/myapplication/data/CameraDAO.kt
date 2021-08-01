package com.varsha.myapplication.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query


@Dao
interface CameraDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(cameraEntity: CameraEntity)

    @Query("select * from CameraApp")
    fun getImage(): LiveData<List<CameraEntity>>
}