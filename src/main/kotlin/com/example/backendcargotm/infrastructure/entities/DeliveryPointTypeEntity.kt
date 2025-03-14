package com.example.backendcargotm.infrastructure.entities

import jakarta.persistence.*

@Entity(name = "DELIVERY_POINT_TYPE")
data class DeliveryPointTypeEntity (
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    @Column(nullable = false, length = 32, unique = true)
    val name: String,
    @Column(length = 6)
    val code: String,
    @OneToOne(fetch =  FetchType.LAZY, optional = true)
    val discount: DiscountEntity
)