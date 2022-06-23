package com.guns.designatomic.ui.lib.atoms

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.guns.designatomic.ui.theme.White

@Composable
fun AtomCard(
    content: @Composable () -> Unit,
    modifier: Modifier,
    elevation: Int = 0,
    color: Color = White,
    shape: RoundedCornerShape = CircleShape,
    stroke:Int = 1
) {
    Card(
        shape = shape,
        elevation = elevation.dp,
        modifier = modifier,
        border = BorderStroke(stroke.dp, color),
        backgroundColor = color
    ) {
        content()
    }
}