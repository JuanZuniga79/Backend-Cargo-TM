package com.example.backendcargotm.infrastructure.entities

import jakarta.persistence.*
import java.util.*

@Entity(name = "USERS")
data class UserEntity(
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    val id: UUID? = null,
    @Column(nullable = false)
    var firstName: String,
    @Column(nullable = false)
    var lastName: String,
    @Column(nullable = false, unique = true)
    var email: String,
    @Column(nullable = false)
    var password: String,
    @Column(nullable = true, unique = true)
    var userName: String ? = null,
    @OneToOne(fetch = FetchType.LAZY, optional = true)
    val document: DocumentEntity? = null,
    @ManyToOne(fetch = FetchType.LAZY)
    val role: RoleEntity,
    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    val address: AddressEntity? = null,
)
