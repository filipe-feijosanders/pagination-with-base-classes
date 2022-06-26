package com.example.pagination_with_base_classes_android.presentation.main

import org.koin.androidx.viewmodel.ext.android.viewModel
import com.example.pagination_with_base_classes_android.R
import com.example.pagination_with_base_classes_android.databinding.ActivityMainBinding
import com.example.pagination_with_base_classes_android.presentation.baseActivity.BaseActivity

class MainActivity : BaseActivity<MainViewModel, ActivityMainBinding>() {

    override val layoutResId: Int = R.id.layout.activity_main

    override val viewModel: MainViewModel by viewModel()

}