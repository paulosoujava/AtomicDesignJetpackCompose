package com.guns.designatomic.ui.lib.molecule

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.guns.designatomic.ui.lib.atoms.AtomText
import com.guns.designatomic.ui.theme.Black

enum class StateText {
    REGULAR,
    H1,
    H2,
    H3,
    TITLE,
    SUBTITLE,
    PARAGRAPH
}

@Composable
fun LibText(modifier: Modifier = Modifier, state: StateText, data: String, color: Color = Black) {

            AtomText(
                data = data,
                modifier = modifier,
                color = color,
                style = when(state){
                    StateText.SUBTITLE ->  MaterialTheme.typography.subtitle2
                    StateText.REGULAR -> MaterialTheme.typography.caption
                    StateText.H1 -> MaterialTheme.typography.h1
                    StateText.H2 -> MaterialTheme.typography.h2
                    StateText.H3 -> MaterialTheme.typography.h3
                    StateText.TITLE -> MaterialTheme.typography.body1
                    StateText.PARAGRAPH -> MaterialTheme.typography.subtitle1
                }
            )

}

