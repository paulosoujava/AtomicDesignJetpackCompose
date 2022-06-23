package com.guns.designatomic.ui.wrapper

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.guns.designatomic.ui.theme.orange

@Composable
fun WrapperCard(
    width: Dp = 280.dp,
    height: Dp = 280.dp,
    alpha: Float = .8f,
    padding: Dp = 10.dp,
    contents: List<@Composable () -> Unit>
) {
    val roundedCornerShape = RoundedCornerShape(10.dp)
    Box(
        modifier = Modifier.fillMaxWidth(),
        contentAlignment = Alignment.Center
    ) {
        Row(
            modifier = Modifier
                .width(width)
                .height(height)
                .clip(roundedCornerShape)
                .background(orange.copy(alpha))
                .padding(padding),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            contents.forEach{
                it()
            }
        }
    }
}
