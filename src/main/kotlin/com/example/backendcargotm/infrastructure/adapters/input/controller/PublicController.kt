package com.example.backendcargotm.infrastructure.adapters.input.controller

import com.example.backendcargotm.infrastructure.dto.user.CreateUserDTO
import com.example.backendcargotm.infrastructure.models.Response
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/public/")
class PublicController {

    @PostMapping("register")
    fun createUser(@RequestBody user: CreateUserDTO): ResponseEntity<Response<Void>>{

    }

}