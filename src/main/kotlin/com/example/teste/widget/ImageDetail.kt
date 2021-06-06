package com.example.teste.widget

import br.com.zup.beagle.annotation.RegisterWidget
import br.com.zup.beagle.widget.Widget

enum class ImageType {
    RED_HEART, SHOPPING
}
@RegisterWidget
data class ImageDetail(
    val value: String,
    val image: ImageType
) : Widget()