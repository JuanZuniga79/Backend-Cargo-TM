package com.example.backendcargotm.application.mapper

import com.example.backendcargotm.infrastructure.dto.user.CreateUserDTO
import com.example.backendcargotm.infrastructure.entities.RoleEntity
import com.example.backendcargotm.infrastructure.entities.UserEntity

interface UserMapper {
    suspend fun CreateUserDTO.toUser(user: CreateUserDTO, userName: String, encryptedPassword: String, role: RoleEntity): UserEntity;
}