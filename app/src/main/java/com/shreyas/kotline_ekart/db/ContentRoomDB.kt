package com.shreyas.kotline_ekart.db

import android.content.Context
import androidx.room.*
import com.shreyas.kotline_ekart.models.ContentModel
import com.shreyas.kotline_ekart.utiles.Converter

@Database(entities = arrayOf(ContentModel::class), version = 1, exportSchema = false)
@TypeConverters(Converter::class)
abstract class ContentRoomDB : RoomDatabase() {

    abstract fun contentDao(): ContentDao

    companion object {

        private var INSTANCE: ContentRoomDB? = null

        fun getDataBase(context: Context): ContentRoomDB {
            val tempINSTANCE = INSTANCE
            if (tempINSTANCE != null) {
                return tempINSTANCE
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(context.applicationContext,
                    ContentRoomDB::class.java,
                    "kotline_details_table").build()
                INSTANCE = instance
                return instance
            }
        }
    }

}