package com.example.backendcargotm.infrastructure.entities

import jakarta.persistence.*
import java.time.LocalDate
import java.util.UUID

@Entity(name = "SHIPMENT")
data class ShipmentEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    val id: UUID? = null,
    @Column(length = 10)
    val guid: String,
    val totalValue: Double,
    val registryDate: LocalDate,
    @Column(nullable = true)
    var deliveryDate: LocalDate,
    @ManyToOne(fetch = FetchType.LAZY)
    val vehicle: VehicleEntity,
    @OneToMany(fetch = FetchType.LAZY)
    val products: List<ProductEntity>,
)
