package com.inno.infrastructure.config

import java.util.*

class ApplicationConfig {
    private val properties = Properties()

    init {
        val inputStream = javaClass.classLoader.getResourceAsStream("config.properties")
        properties.load(inputStream)
    }

    fun getInputFileName(): String {
        return properties.getProperty("input.file.name")
    }
}