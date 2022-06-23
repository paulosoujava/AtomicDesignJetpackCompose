package com.guns.designatomic.ui.wrapper

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.guns.designatomic.model.DumpData
import com.guns.designatomic.ui.lib.atoms.AtomCard
import com.guns.designatomic.ui.theme.orange

@Composable
fun WrapperListRow(
    list: List<DumpData>,
    modifier: Modifier = Modifier,
    alpha: Float = .8f,
    content: @Composable (DumpData) -> Unit
) {

    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(4.dp),
    ) {
        items(list.size) { item ->
            AtomCard(
                modifier = modifier,
                color = orange.copy(alpha),
                content = {
                    content(list[item])
                }
            )
        }
    }
}