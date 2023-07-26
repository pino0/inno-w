package com.inno

import com.inno.application.CleaningFactory
import com.inno.infrastructure.config.applicationModule
import com.inno.infrastructure.InputReader
import com.inno.infrastructure.config.ApplicationConfig
import org.koin.core.context.startKoin

class MainKt {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            startKoin() {
                modules(applicationModule)
            }

            val inputFileName = ApplicationConfig().getInputFileName()

            CleaningFactory().cleanFactory(InputReader().fromFile(inputFileName))
        }
    }
}

