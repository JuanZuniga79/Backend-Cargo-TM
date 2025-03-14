package com.example.backendcargotm.infrastructure.dto.shipment

import com.example.backendcargotm.infrastructure.dto.product.ResponseProductDTO
import java.time.LocalDate

data class ResponseShipmentDTO(
    val id: String,
    val guid: String,
    val totalValue: Double,
    val registryDate: LocalDate,
    val deliveryDate: LocalDate ?  = null,
    val vehicleIdentification: String,
    val vehicleType: String,
    val vehicleTypeCode: String,
    val productList: List<ResponseProductDTO>
)
