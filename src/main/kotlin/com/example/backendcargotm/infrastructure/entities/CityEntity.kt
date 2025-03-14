package com.example.backendcargotm.infrastructure.entities

import jakarta.persistence.*

@Entity(name = "CITIES")
data class CityEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    val name: String,
    @ManyToOne(fetch = FetchType.LAZY)
    val country: CountryEntity
)