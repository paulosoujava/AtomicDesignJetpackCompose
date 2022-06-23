package com.guns.designatomic.ui.lib.atoms

import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp



@Composable
fun AtomText(
    modifier: Modifier,
    style: TextStyle,
    color: Color,
    data: String,
) {
    Text(
        text = data,
        style = style,
        color = color,
        modifier = modifier,
    )
}