package com.example.backendcargotm.infrastructure.dto.user

data class CreateRoleDTO(
    val name: String,
    val description: String ? = null,
)
