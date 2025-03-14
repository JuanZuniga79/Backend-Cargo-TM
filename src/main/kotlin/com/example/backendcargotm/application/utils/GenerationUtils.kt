package com.example.backendcargotm.application.utils

interface GenerationUtils {
    suspend fun generateHexCode(length: Int): String
    suspend fun generateEncryptedPassword(password: String): String
}