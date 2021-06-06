package com.example.teste.response

import br.com.zup.beagle.widget.layout.NavigationBar
import br.com.zup.beagle.widget.layout.Screen
import br.com.zup.beagle.widget.layout.ScreenBuilder
import br.com.zup.beagle.widget.ui.Text

class MyScreenDetailResponse : ScreenBuilder {
    override fun build() =
            Screen(
                    navigationBar = navBar(),
                    child = Text(
                            "So teste"
                    )
            )

    private fun navBar(): NavigationBar {
        return NavigationBar(title = "Detalhes")
    }
}