package com.example.teste.controller

import br.com.zup.beagle.widget.layout.ScreenBuilder
import com.example.teste.service.MyScreenService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MyScreenController(private val service: MyScreenService) {

    @GetMapping("/screen")
    fun getScreen() : ScreenBuilder = service.getMyScreen()
}