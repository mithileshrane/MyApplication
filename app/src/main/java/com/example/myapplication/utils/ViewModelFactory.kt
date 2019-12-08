package com.example.myapplication.utils

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import dagger.Lazy
import javax.inject.Inject

//https://github.com/ChiliLabs/viewmodel-dagger-example/blob/master/app/src/main/java/lv/chi/example/vmdagger/ui/list/ListNotesModule.kt
//https://medium.com/chili-labs/android-viewmodel-injection-with-dagger-f0061d3402ff
//https://medium.com/@princessdharmy/dagger-2-with-mvvm-simplified-3215b3cf4c96

class ViewModelFactory<VM : ViewModel> @Inject
constructor(private val viewModel: Lazy<VM>) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return viewModel.get() as T
    }
}