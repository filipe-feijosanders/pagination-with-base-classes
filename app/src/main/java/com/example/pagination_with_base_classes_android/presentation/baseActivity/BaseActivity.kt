package com.example.pagination_with_base_classes_android.presentation.baseActivity

import android.os.Bundle
import androidx.annotation.CallSuper
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.example.pagination_with_base_classes_android.presentation.baseViewModel.BaseViewModel

abstract class BaseActivity<T : BaseViewModel, V : ViewDataBinding> : AppCompatActivity() {

    protected abstract val viewModel: T

    protected abstract val layoutResId: Int
    protected lateinit var binding: V

    protected open val autoLoad = false

    @CallSuper
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, layoutResId)

        binding.setVariable(BR.viewModel, viewModel)
        binding.lifecycleOwner = this

        onAfterCreateView(savedInstanceState)

    }
    open fun onAfterCreateView(savedInstanceState: Bundle?) {}
}