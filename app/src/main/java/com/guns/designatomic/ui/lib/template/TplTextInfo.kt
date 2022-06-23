package com.guns.designatomic.ui.wrapper

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import com.guns.designatomic.ui.theme.MEDIUM_SIZE
import com.guns.designatomic.ui.theme.SMALL_SIZE

@Composable
fun WrapperTextInfo(
    paddingRowStart: Dp = SMALL_SIZE,
    paddingRowTop: Dp = MEDIUM_SIZE,
    paddingRowEnd: Dp = SMALL_SIZE,
    paddingRowBottom: Dp = MEDIUM_SIZE,
    horizontalAlignment: Alignment.Horizontal = Alignment.Start,
    verticalArrangement: Arrangement.HorizontalOrVertical = Arrangement.Center,
    contents: List<@Composable () -> Unit>
) {
    Box(
        modifier = Modifier
            .fillMaxWidth(),
    ) {
        Column(
            modifier = Modifier
                .padding(
                    start = paddingRowStart,
                    end = paddingRowEnd,
                    top = paddingRowTop,
                    bottom = paddingRowBottom
                ),
            horizontalAlignment = horizontalAlignment,
            verticalArrangement = verticalArrangement
        ) {
          contents.forEach { it() }
        }

    }
}