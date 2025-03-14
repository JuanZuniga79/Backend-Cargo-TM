package com.example.backendcargotm.application.services

import com.example.backendcargotm.application.mapper.impl.ShipmentMapperImpl.toShipmentResponseDTO
import com.example.backendcargotm.infrastructure.adapters.output.repository.ShipmentRepository
import com.example.backendcargotm.infrastructure.dto.shipment.ResponseShipmentDTO
import com.example.backendcargotm.infrastructure.entities.ShipmentEntity
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.springframework.stereotype.Service

@Service
class ShipmentServices(
    private val shipmentRepository: ShipmentRepository,
) {

    suspend fun getAllShipments(): Iterable<ResponseShipmentDTO> {
        val items = withContext(Dispatchers.IO){
             shipmentRepository.getAllShipments();
        }
        return items.toShipmentResponseDTO(items);
    }

}