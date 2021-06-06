package com.example.teste.widget

import br.com.zup.beagle.annotation.RegisterWidget
import br.com.zup.beagle.widget.Widget

@RegisterWidget
data class ColorSelector(
        val colors: List<String>
) : Widget()

