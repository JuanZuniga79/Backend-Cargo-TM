package com.example.backendcargotm.application.mapper

import com.example.backendcargotm.infrastructure.dto.product.ResponseProductDTO
import com.example.backendcargotm.infrastructure.dto.shipment.ResponseShipmentDTO
import com.example.backendcargotm.infrastructure.entities.ShipmentEntity

interface ShipmentMapper {
    suspend fun ShipmentEntity.toShipmentResponseDTO(item: ShipmentEntity): ResponseShipmentDTO
    suspend fun Iterable<ShipmentEntity>.toShipmentResponseDTO(items: Iterable<ShipmentEntity>): Iterable<ResponseShipmentDTO>
}