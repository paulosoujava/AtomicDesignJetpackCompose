package com.guns.designatomic.ui.wrapper

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment

@Composable
fun WrapperRainInfo(
    horizontalAlignment: Alignment.Horizontal = Alignment.Start,
    verticalArrangement: Arrangement.HorizontalOrVertical = Arrangement.Center,
    firstContainer: @Composable () -> Unit,
    secondColumnContainer: List<@Composable () -> Unit>,
    lastContainer: @Composable () -> Unit

) {
    Row {
        firstContainer()
        Column(
            verticalArrangement = verticalArrangement,
            horizontalAlignment = horizontalAlignment,
        ) {
            secondColumnContainer.forEach { it() }
        }
        lastContainer()
    }
}