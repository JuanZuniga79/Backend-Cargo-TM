package com.example.backendcargotm.application.services

import com.example.backendcargotm.infrastructure.adapters.output.repository.UserRepository
import com.example.backendcargotm.infrastructure.dto.user.CreateUserDTO
import com.example.backendcargotm.infrastructure.models.Response
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service

@Service
class UserService (private val userRepository: UserRepository) {

    fun createUser(user: CreateUserDTO): ResponseEntity<Response<Void>> {

    }

}