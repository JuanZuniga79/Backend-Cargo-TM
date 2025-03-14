package com.example.backendcargotm.infrastructure.dto.product

data class ResponseProductDTO(
    val id: String,
    val name: String,
    val fragile: Boolean,
    val price: Double,
    val quantity: Int,
    val productType: String,
)
