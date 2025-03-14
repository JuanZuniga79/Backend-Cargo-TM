package com.example.backendcargotm.infrastructure.adapters.output.repository

import org.springframework.data.repository.CrudRepository
import org.springframework.security.core.userdetails.User
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface UserRepository : CrudRepository<User, UUID> {
    fun getUserByUsername(username: String): User
}