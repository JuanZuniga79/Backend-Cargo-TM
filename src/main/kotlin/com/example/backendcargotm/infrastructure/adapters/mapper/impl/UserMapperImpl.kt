package com.example.backendcargotm.infrastructure.adapters.mapper.impl

import com.example.backendcargotm.infrastructure.adapters.mapper.UserMapper
import com.example.backendcargotm.infrastructure.dto.user.CreateUserDTO
import com.example.backendcargotm.infrastructure.entities.RoleEntity
import com.example.backendcargotm.infrastructure.entities.UserEntity
import org.springframework.security.core.userdetails.User

object UserMapperImpl : UserMapper{
    override suspend fun CreateUserDTO.toUser(user: CreateUserDTO, userName: String, encryptedPassword: String, role: RoleEntity): UserEntity =
        UserEntity(
            firstName = user.firstName,
            lastName = user.lastName,
            email = user.email,
            password = encryptedPassword,
            userName = userName,
            role = role
        )
}