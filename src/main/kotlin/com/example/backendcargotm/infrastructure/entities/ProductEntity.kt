package com.example.backendcargotm.infrastructure.entities

import jakarta.persistence.*
import java.util.UUID

@Entity(name = "PRODUCT")
data class ProductEntity(
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    val id: UUID ? = null,
    val name: String,
    val fragile: Boolean,
    val price: Double,
    val quantity: Int,
    @ManyToOne(fetch = FetchType.LAZY)
    val productTypeEntity: ProductTypeEntity
)
