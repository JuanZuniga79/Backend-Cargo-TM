package com.example.backendcargotm.infrastructure.entities

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.util.UUID

@Entity(name = "DOCUMENT")
data class DocumentEntity(
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    val id: UUID ? = null,
    @Column(unique = true, length = 12)
    val value: String,
)
