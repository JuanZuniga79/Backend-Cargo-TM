package com.example.backendcargotm.infrastructure.entities

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity(name = "IDENTIFICATION_TYPE")
data class IdentificationTypeEntity(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    @Column(unique = true, length = 32)
    val name: String,
    @Column(unique = true, length = 4)
    val code: String,
)
