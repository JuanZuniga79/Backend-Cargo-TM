package com.example.backendcargotm.infrastructure.dto.user

data class CreateUserDTO(
    val firstName: String,
    val lastName: String,
    val email: String,
    val password: String,
)
