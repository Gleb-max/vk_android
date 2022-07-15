package com.sirius.test_app.presentation

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.sirius.test_app.data.repository.GameRepositoryImpl
import com.sirius.test_app.domain.entity.DataModel
import kotlinx.coroutines.launch

class MainViewModel(application: Application) : AndroidViewModel(application) {

    private val repository = GameRepositoryImpl()

    private val _data = MutableLiveData<DataModel>()
    val data: LiveData<DataModel> = _data

    init {

        _data.value = repository.getData()
    }
}