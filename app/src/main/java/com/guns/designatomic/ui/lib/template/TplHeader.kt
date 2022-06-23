package com.guns.designatomic.ui.wrapper

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.guns.designatomic.ui.theme.MEDIUM_SIZE
import com.guns.designatomic.ui.theme.SMALL_SIZE

@Composable
fun WrapperHeader(
    paddingBoxTop: Dp = 20.dp,
    paddingRowStart: Dp = SMALL_SIZE,
    paddingRowTop: Dp = MEDIUM_SIZE,
    paddingRowEnd: Dp = SMALL_SIZE,
    paddingRowBottom: Dp = MEDIUM_SIZE,
    contents: List<@Composable () -> Unit>
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = paddingBoxTop)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    start = paddingRowStart,
                    end = paddingRowEnd,
                    top = paddingRowTop,
                    bottom = paddingRowBottom
                ),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            contents.forEach { it() }
        }
    }
}