package com.example.backendcargotm.application.mapper

import com.example.backendcargotm.infrastructure.dto.user.CreateRoleDTO
import com.example.backendcargotm.infrastructure.entities.RoleEntity

interface RoleMapper {

    suspend fun CreateRoleDTO.toRole(roleDTO: CreateRoleDTO) : RoleEntity

}