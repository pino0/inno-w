package com.inno.infrastructure

import java.util.Properties

class FileCleaningInstructionProvider(private val filePath: String) {
    fun readInstructions(): String {
        val properties = Properties()
        javaClass.classLoader.getResourceAsStream(filePath)?.use { properties.load(it) }
        return properties.getProperty("cleaning.instructions", "")
    }
}