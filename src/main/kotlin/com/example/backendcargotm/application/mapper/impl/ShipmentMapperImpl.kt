package com.example.backendcargotm.application.mapper.impl

import com.example.backendcargotm.application.mapper.ShipmentMapper
import com.example.backendcargotm.infrastructure.dto.product.ResponseProductDTO
import com.example.backendcargotm.infrastructure.dto.shipment.ResponseShipmentDTO
import com.example.backendcargotm.infrastructure.entities.ShipmentEntity

object ShipmentMapperImpl : ShipmentMapper{
    override suspend fun ShipmentEntity.toShipmentResponseDTO(item: ShipmentEntity): ResponseShipmentDTO = ResponseShipmentDTO(
        id = item.id.toString(),
        guid = item.guid,
        totalValue = item.totalValue,
        registryDate = item.registryDate,
        deliveryDate = item.deliveryDate,
        vehicleIdentification = item.vehicle.identification,
        vehicleType = item.vehicle.vehicleTypeEntity.name,
        vehicleTypeCode = item.vehicle.vehicleTypeEntity.code,
        productList = item.products
    )

    override suspend fun Iterable<ShipmentEntity>.toShipmentResponseDTO(items: Iterable<ShipmentEntity>): Iterable<ResponseShipmentDTO> {
        return items.map { item ->
            ResponseShipmentDTO(
                id = item.id.toString(),
                guid = item.guid,
                totalValue = item.totalValue,
                registryDate = item.registryDate,
                deliveryDate = item.deliveryDate,
                vehicleIdentification = item.vehicle.identification,
                vehicleType = item.vehicle.vehicleTypeEntity.name,
                vehicleTypeCode = item.vehicle.vehicleTypeEntity.code,
                productList = item.products
            )
        }
    }
}