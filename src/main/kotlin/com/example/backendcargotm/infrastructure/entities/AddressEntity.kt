package com.example.backendcargotm.infrastructure.entities

import jakarta.persistence.*
import java.util.*

@Entity(name = "ADDRESSES")
data class AddressEntity(
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    val id: UUID ? = null,
    var location: String,
    @ManyToOne(fetch = FetchType.LAZY)
    val city: CityEntity,
)
