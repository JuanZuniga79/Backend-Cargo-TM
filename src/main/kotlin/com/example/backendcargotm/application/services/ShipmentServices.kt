package com.example.backendcargotm.application.services

import com.example.backendcargotm.infrastructure.adapters.output.repository.ShipmentRepository
import com.example.backendcargotm.infrastructure.dto.shipment.ResponseShipmentDTO
import org.springframework.stereotype.Service

@Service
class ShipmentServices(
    private val shipmentRepository: ShipmentRepository,
) {

    fun getAllShipments(): MutableIterable<ResponseShipmentDTO> {
        return shipmentRepository.findAll();
    }

}