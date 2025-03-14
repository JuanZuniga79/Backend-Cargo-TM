package com.example.backendcargotm.application.utils.impl

import com.example.backendcargotm.application.utils.GenerationUtils
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.stereotype.Component
import kotlin.random.Random

@Component
class GenerationUtilsImpl : GenerationUtils {

    private var bCrypt: BCryptPasswordEncoder = BCryptPasswordEncoder();

    override suspend fun generateHexCode(length: Int): String {
        val hexChars = "0123456789ABCDEF"
        val random = Random(System.currentTimeMillis())
        return StringBuilder(length)
            .apply {
                repeat(length) { append(hexChars[random.nextInt(hexChars.length)]) }
            }
            .toString()    }

    override suspend fun generateEncryptedPassword(password: String): String {
        return bCrypt.encode(password)
    }
}