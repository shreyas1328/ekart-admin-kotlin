package com.shreyas.kotline_ekart.utiles

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.shreyas.kotline_ekart.models.SaveImage

class Converter {

    @TypeConverter
    fun toSaveImage(jsonObject: String): SaveImage {
        val type = object : TypeToken<SaveImage>() {}.getType()
        return Gson().fromJson(jsonObject, type)
    }

    @TypeConverter
    fun toString(image: SaveImage): String {
        val type = object: TypeToken<SaveImage>() {}.type
        return Gson().toJson(image, type)
    }
}