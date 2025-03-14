package com.example.backendcargotm.infrastructure.adapters.output.repository

import com.example.backendcargotm.infrastructure.entities.ShipmentEntity
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
interface ShipmentRepository : CrudRepository<ShipmentEntity, UUID> {

}