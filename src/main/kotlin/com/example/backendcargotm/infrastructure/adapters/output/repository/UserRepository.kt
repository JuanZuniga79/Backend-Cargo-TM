package com.example.backendcargotm.infrastructure.adapters.output.repository

import com.example.backendcargotm.infrastructure.entities.UserEntity
import org.springframework.data.repository.CrudRepository
import org.springframework.security.core.userdetails.User
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface UserRepository : CrudRepository<UserEntity, UUID> {
    fun findByUserName(username: String): UserEntity?
    fun findByEmail(email: String): UserEntity?
}