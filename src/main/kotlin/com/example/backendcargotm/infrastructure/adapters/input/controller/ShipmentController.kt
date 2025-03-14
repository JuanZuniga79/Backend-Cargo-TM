package com.example.backendcargotm.infrastructure.adapters.input.controller

import com.example.backendcargotm.application.services.ShipmentServices
import com.example.backendcargotm.infrastructure.dto.shipment.ResponseShipmentDTO
import com.example.backendcargotm.infrastructure.models.Response
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/shipments")
class ShipmentController(private val service: ShipmentServices) {

    @GetMapping("")
    suspend fun getAllShipments() : ResponseEntity<Response<Iterable<ResponseShipmentDTO>>>{
        try {
            val data = service.getAllShipments();
            val response = Response.Builder<Iterable<ResponseShipmentDTO>>()
                .setMessage("Received all shipments").setCode(200).setData(data).build();
            return ResponseEntity.ok().body(response);
        }catch(e: Exception){
            val response = Response.Builder<Iterable<ResponseShipmentDTO>>()
                .setMessage("Failed to retrieve shipments")
                .setCode(500)
                .build();
            return ResponseEntity.badRequest().body(response);
        }
    }

}