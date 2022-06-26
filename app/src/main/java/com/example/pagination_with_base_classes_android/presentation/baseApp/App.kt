package com.example.pagination_with_base_classes_android.presentation.baseApp

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

open class App : Application() {

    override fun onCreate() {
        super.onCreate()


        startDependencyInjection()

    }

    private fun startDependencyInjection() {
        // start Koin!
        startKoin {
            // declare used Android context
            androidContext(this@App)
            // declare modules
            modules(
                listOf(
                    utilsModule,
                    serviceModule,
                    repositoryModule,
                    retrofitModule,
                    viewModelModule,
                    localDbModule
                )
            )
        }
    }
}