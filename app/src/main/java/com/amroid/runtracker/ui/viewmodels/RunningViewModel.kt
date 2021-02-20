package com.amroid.runtracker.ui.viewmodels

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.amroid.runtracker.repositories.MainRepository
import javax.inject.Inject

class RunningViewModel @ViewModelInject constructor(val mainRepository: MainRepository):ViewModel() {
}