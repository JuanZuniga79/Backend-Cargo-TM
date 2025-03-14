package com.example.backendcargotm.infrastructure.adapters.output.repository

import com.example.backendcargotm.infrastructure.entities.RoleEntity
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface RoleRepository : CrudRepository<RoleEntity, Long>{
    fun findByName(name: String): RoleEntity?
}