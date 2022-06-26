package com.example.pagination_with_base_classes_android.presentation.injection

import android.app.Application
import com.example.pagination_with_base_classes_android.presentation.main.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {

    viewModel { MainViewModel(get<Application>())  }

}