package com.varsha.myapplication.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase


@Database(entities = [CameraEntity::class],version = 1)
abstract class CameraDatabase: RoomDatabase(){

    abstract fun getCameraDAO():CameraDAO

    companion object {
        private var INSTANCE: CameraDatabase? = null
        fun getDatabase(context: Context): CameraDatabase {
            if (INSTANCE == null) {
                val builder = Room.databaseBuilder(
                    context.applicationContext,
                    CameraDatabase::class.java,
                    "image_database"
                )
                builder.fallbackToDestructiveMigration()
                INSTANCE = builder.build()
                return INSTANCE!!

            } else {
                return INSTANCE!!
            }
        }
    }
}