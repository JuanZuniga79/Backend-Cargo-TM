package com.example.backendcargotm.application.services

import com.example.backendcargotm.application.mapper.impl.RoleMapperImpl.toRole
import com.example.backendcargotm.infrastructure.adapters.output.repository.RoleRepository
import com.example.backendcargotm.infrastructure.dto.user.CreateRoleDTO
import com.example.backendcargotm.infrastructure.entities.RoleEntity
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.springframework.stereotype.Service

@Service
class RoleServices (private val roleRepository: RoleRepository) {

    suspend fun getRole(name: String) :RoleEntity?{
        return withContext(Dispatchers.IO) {
            roleRepository.findByName(name)
        }
    }

    suspend fun addRole(role: CreateRoleDTO): RoleEntity {
        val roleDB = withContext(Dispatchers.IO) {
            roleRepository.findByName(role.name)
        };
        if(roleDB !== null){
            throw IllegalStateException("Role already exists");
        }
        val roleToSave = role.toRole(role);
        return withContext(Dispatchers.IO){
            roleRepository.save(roleToSave);
        }
    }

}