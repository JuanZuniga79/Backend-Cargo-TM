package com.example.backendcargotm.application.mapper.impl

import com.example.backendcargotm.application.mapper.RoleMapper
import com.example.backendcargotm.infrastructure.dto.user.CreateRoleDTO
import com.example.backendcargotm.infrastructure.entities.RoleEntity

object RoleMapperImpl : RoleMapper{
    override suspend fun CreateRoleDTO.toRole(roleDTO: CreateRoleDTO): RoleEntity = RoleEntity(
        name = roleDTO.name,
        description = roleDTO.description,
    )
}