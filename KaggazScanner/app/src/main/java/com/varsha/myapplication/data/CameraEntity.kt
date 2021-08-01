package com.varsha.myapplication.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "CameraApp")
class CameraEntity (
    @ColumnInfo(name = "image") var image:String
        ){

@PrimaryKey(autoGenerate = true)@ColumnInfo(name = "id") var id: Int? =null
}