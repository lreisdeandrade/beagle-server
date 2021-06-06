package com.example.teste.response

import br.com.zup.beagle.core.CornerRadius
import br.com.zup.beagle.core.PositionType
import br.com.zup.beagle.core.Style
import br.com.zup.beagle.ext.applyStyle
import br.com.zup.beagle.ext.unitPercent
import br.com.zup.beagle.widget.Widget
import br.com.zup.beagle.widget.core.*
import br.com.zup.beagle.widget.layout.*
import br.com.zup.beagle.widget.ui.Button
import br.com.zup.beagle.widget.ui.Image
import br.com.zup.beagle.widget.ui.ImagePath
import br.com.zup.beagle.widget.ui.Text
import com.example.teste.actions.ActionForBeagleTwo
import com.example.teste.widget.ImageDetail
import com.example.teste.widget.ImageType

class MyScreenDetailResponse : ScreenBuilder {
    override fun build() =
            Screen(
                    navigationBar = navBar(),
                    child = screenContainer()
            )

    private fun navBar(): NavigationBar {
        return NavigationBar(title = "Detalhes")
    }

    private fun screenContainer(): Widget {
        val margin = UnitValue(16.0, UnitType.REAL)
        return Container(
                children = listOf(ScrollView(listOf(
                        outfitImage(),
                        descProduct(),
                        buttonConfirm()
                )))
        ).applyStyle(
                Style(
                        margin = EdgeValue(left = margin,
                                right = margin,
                                bottom = margin)
                )
        )
    }

    private fun outfitImage(): Widget {
        return Container(
                children = listOf(
                        Image(
                                ImagePath.Local.both("", "tshirt"),
                                ImageContentMode.CENTER
                        ),
                        ImageDetail(value = "$23.99", image = ImageType.RED_HEART)
                                .applyStyle(
                                        Style(
                                                cornerRadius = CornerRadius(20.0),
                                                positionType = PositionType.ABSOLUTE
                                        )
                                ))
        ).applyStyle(
                Style(
                        flex = Flex(
                                justifyContent = JustifyContent.FLEX_END
                        ),
                        size = Size(
                                height = 65.unitPercent()
                        )
                )
        )
    }

    private fun buttonConfirm() = Button(
            text = "Comprar",
            styleId = "customButton",
            onPress = listOf(ActionForBeagleTwo())
    )

    private fun descProduct() = Text(
            "Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget" +
                    " dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes" +
                    ", nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium quis," +
                    " sit amet nibh. Donec sodales sagittis magna. Sed consequat, leo eget bibendum sodales, augue velit cursus nunc,"
    ).applyStyle(
            Style(
                    padding = EdgeValue(top = UnitValue(16.0, UnitType.REAL),
                            bottom = UnitValue(16.0, UnitType.REAL))))
}