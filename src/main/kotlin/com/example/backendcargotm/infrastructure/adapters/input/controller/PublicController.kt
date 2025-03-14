package com.example.backendcargotm.infrastructure.adapters.input.controller

import com.example.backendcargotm.application.services.UserServices
import com.example.backendcargotm.infrastructure.dto.user.CreateUserDTO
import com.example.backendcargotm.infrastructure.models.Response
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/public/")
class PublicController(private val userServices: UserServices) {

    @PostMapping("register")
    suspend fun createUser(@RequestBody user: CreateUserDTO): ResponseEntity<Response<Void>>{
        try{
            userServices.createUser(user);
            val res = Response.Builder<Void>()
                .setCode(201)
                .setMessage("User registered successfully").build();
            return ResponseEntity.ok().body(res)
        }catch (e: Exception){
            val res = Response.Builder<Void>()
                .setCode(400)
                .setMessage("${e.message}").build();
            return ResponseEntity.badRequest().body(res)
        }
    }

}