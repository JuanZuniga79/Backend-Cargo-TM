package com.example.backendcargotm.infrastructure.entities

import jakarta.persistence.*

@Entity(name = "VEHICLE")
data class VehicleEntity(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    @Column(length = 8)
    val identification: String,
    @ManyToOne(fetch = FetchType.LAZY)
    val vehicleTypeEntity: VehicleTypeEntity
)
