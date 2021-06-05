package com.example.teste.controller

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TesteController {
    @GetMapping("/teste")
    fun getText() : ResponseEntity<Carro> {
        val carro = Carro()
        carro.cor= "preto"
        carro.motor = "3.0"
        return ResponseEntity(carro,HttpStatus.OK)
    }
}

class Carro(){
    var cor : String?= null
    var motor : String?= null
}