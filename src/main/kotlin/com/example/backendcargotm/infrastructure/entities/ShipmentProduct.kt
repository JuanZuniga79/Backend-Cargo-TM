package com.example.backendcargotm.infrastructure.entities

import jakarta.persistence.*
import java.util.*

@Entity(name = "SHIPMENT_PRODUCTS")
data class ShipmentProduct(
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    val id: UUID? = null,
    @ManyToOne(fetch = FetchType.LAZY)
    val shipmentEntity: ShipmentEntity,
    @ManyToOne(fetch = FetchType.LAZY)
    val productEntity: ProductEntity,
    val quantity: Int,
)