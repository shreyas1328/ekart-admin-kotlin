package com.shreyas.kotline_ekart.respository

import androidx.lifecycle.LiveData
import com.shreyas.kotline_ekart.db.ContentDao
import com.shreyas.kotline_ekart.models.ContentModel

class ContentRepo(private val contentDao: ContentDao) {

    val getAllItems: LiveData<List<ContentModel>> = contentDao.getAllItems()

    suspend fun insertItem(model: ContentModel) {
        contentDao.insertItem(model)
    }

    suspend fun updateItem(model: ContentModel) {
        contentDao.updateItem(model)
    }

    suspend fun deleteItem(id: Int) {
        contentDao.deleteItem(id)
    }

//    suspend fun getParicularItem(id: Int): LiveData<ContentModel> {
//       return contentDao.getParicularItem(id)
//    }

    fun getParicularItem(id: Int): LiveData<ContentModel> {
        return contentDao.getParicularItem(id)
    }


}