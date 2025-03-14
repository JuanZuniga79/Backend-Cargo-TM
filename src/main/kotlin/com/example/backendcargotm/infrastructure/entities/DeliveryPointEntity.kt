package com.example.backendcargotm.infrastructure.entities

import jakarta.persistence.*

@Entity(name = "DELIVERY_POINTS")
data class DeliveryPointEntity(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    @Column(length = 10)
    var phoneNumber: String,
    var cost: Float,
)
