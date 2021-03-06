package com.example.unit_5sprint1.MVVM

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.unit_5sprint1.RoomDatabase.Model
import com.example.unit_5sprint1.retrofit.ResponseModelItem

class ViewModell(val repository: Repository) :ViewModel(){
    fun getAllData():LiveData<List<Model>>{
        return repository.getData()
    }

    fun insertData( num:Int){
        repository.insertData(num)
    }
    fun deleteAllData(){
        repository.deleteAll()
    }
}