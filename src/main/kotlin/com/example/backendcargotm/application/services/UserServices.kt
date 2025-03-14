package com.example.backendcargotm.application.services

import com.example.backendcargotm.application.mapper.impl.UserMapperImpl.toUser
import com.example.backendcargotm.application.utils.GenerationUtils
import com.example.backendcargotm.infrastructure.adapters.output.repository.UserRepository
import com.example.backendcargotm.infrastructure.dto.user.CreateRoleDTO
import com.example.backendcargotm.infrastructure.dto.user.CreateUserDTO
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.springframework.stereotype.Service

@Service
class UserServices (
    private val userRepository: UserRepository, private val generationUtils: GenerationUtils,
    private val roleServices: RoleServices
) {

    suspend fun createUser(user: CreateUserDTO) {
        val userDB = withContext(Dispatchers.IO) {
            userRepository.findByEmail(user.email)
        };
        if (userDB !== null) {
            throw IllegalArgumentException("The email ${user.email} already exists.")
        }
        val username = generationUtils.generateHexCode(8);
        val password = generationUtils.generateEncryptedPassword(user.password);
        var role = roleServices.getRole("client");
        if(role === null){
            val roleToSave = CreateRoleDTO(
                name = "client",
                description = "application clients role"
            )
            roleServices.addRole(roleToSave);
            role = roleServices.getRole("client");
            if(role === null){
                throw Exception("The role ${roleToSave.name} cannot be added.")
            }
        }
        val userTODB = user.toUser(user, username, password, role)
        withContext(Dispatchers.IO) {
            userRepository.save(userTODB)
        };
    }

}