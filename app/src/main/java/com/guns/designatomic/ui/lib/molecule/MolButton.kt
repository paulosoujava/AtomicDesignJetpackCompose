package com.guns.designatomic.ui.lib.molecule

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.guns.designatomic.ui.lib.atoms.AtomButton
import com.guns.designatomic.ui.theme.Black
import com.guns.designatomic.ui.theme.White

enum class StateButton {
    REGULAR,
    LOADING,
    ENABLED,
}

@Composable
fun LibButton(
    stateButton: StateButton,
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
    dataLabel: String,
    modifierText: Modifier = Modifier
) {
    when (stateButton) {
        StateButton.REGULAR -> {
            AtomButton(
                onClick = onClick,
                modifier = modifier
                    .clip(shape = CircleShape)
                    .size(180.dp, 40.dp)
                    .background(color = Black),
                content = {
                    LibText(
                        state = StateText.PARAGRAPH,
                        data = dataLabel,
                        color = White
                    )
                }
            )
        }

        StateButton.LOADING -> {
            AtomButton(
                onClick = onClick,
                enabled = false,
                modifier = modifier
                    .clip(shape = CircleShape)
                    .size(180.dp, 40.dp),
                content = {
                    CircularProgressIndicator(
                        color = Black,
                        modifier = Modifier.size(20.dp)
                    )
                }
            )
        }
        StateButton.ENABLED -> {
            AtomButton(
                onClick = onClick,
                enabled = false,
                modifier = modifier
                    .size(180.dp, 40.dp)
                    .clip(shape = CircleShape),
                content = {
                    LibText(
                        state = StateText.PARAGRAPH,
                        data = dataLabel,
                        modifier = modifierText
                    )
                }
            )
        }
    }
}


