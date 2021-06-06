package com.example.teste.service

import br.com.zup.beagle.widget.layout.ScreenBuilder
import com.example.teste.response.MyScreenDetailResponse
import com.example.teste.response.MyScreenResponse
import org.springframework.stereotype.Service

@Service
class MyScreenService {
    fun getMyScreen(): ScreenBuilder = MyScreenResponse()
    fun getMyScreenDetail(): ScreenBuilder = MyScreenDetailResponse()
}