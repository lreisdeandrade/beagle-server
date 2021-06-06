package com.example.teste.response

import br.com.zup.beagle.core.CornerRadius
import br.com.zup.beagle.core.PositionType
import br.com.zup.beagle.core.Style
import br.com.zup.beagle.ext.applyFlex
import br.com.zup.beagle.ext.applyStyle
import br.com.zup.beagle.ext.unitPercent
import br.com.zup.beagle.ext.unitReal
import br.com.zup.beagle.widget.Widget
import br.com.zup.beagle.widget.action.Navigate
import br.com.zup.beagle.widget.action.Route
import br.com.zup.beagle.widget.core.*
import br.com.zup.beagle.widget.layout.Container
import br.com.zup.beagle.widget.layout.NavigationBar
import br.com.zup.beagle.widget.layout.Screen
import br.com.zup.beagle.widget.layout.ScreenBuilder
import br.com.zup.beagle.widget.ui.Button
import br.com.zup.beagle.widget.ui.Image
import br.com.zup.beagle.widget.ui.ImagePath
import com.example.teste.widget.*

class MyScreenResponse : ScreenBuilder {
    override fun build() =
            Screen(
                    navigationBar = navBar(),
                    child = screenWidgets().applyStyle(
                            Style(
                                    margin = EdgeValue(left = UnitValue(16.0, UnitType.REAL),
                                            right = UnitValue(16.0, UnitType.REAL),
                                            bottom = UnitValue(16.0, UnitType.REAL))
                            ))
            )

    private fun navBar(): NavigationBar {
        return NavigationBar(title = "Produto camiseta do vitao")
    }

    private fun screenWidgets(): Widget {
        return Container(
                children = listOf(
                        outfitImage(),
                        outfitColors(),
                        outfitSize(),
                        submitButton()
                )
        ).applyFlex(
                Flex(
                        grow = 1.0,
                        justifyContent = JustifyContent.SPACE_BETWEEN,
                )
        )
    }

    private fun submitButton(): Button {
        return Button(
                text = "Add to cart",
                styleId = "customButton",
                onPress = listOf(Navigate.PushView(Route.Remote("/detail")))
        )
    }

    private fun outfitSize(): Widget {
        return SizeSelector(
                listOf(SizeType.XS, SizeType.S, SizeType.M, SizeType.L, SizeType.XL)
        ).applyStyle(
                Style(
                        margin = EdgeValue(bottom = 10.unitReal())
                )
        )
    }

    private fun outfitColors(): Widget {
        return ColorSelector(
                colors = listOf(
                        "#ECECED",
                        "#D7D8DA",
                        "#394657",
                        "#B38B6D"
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
                                )
                )
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
}