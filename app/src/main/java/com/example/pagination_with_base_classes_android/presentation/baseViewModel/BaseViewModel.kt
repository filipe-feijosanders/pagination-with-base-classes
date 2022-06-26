package com.example.pagination_with_base_classes_android.presentation.baseViewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel

open class BaseViewModel(open val app: Application) : AndroidViewModel(app) {

}