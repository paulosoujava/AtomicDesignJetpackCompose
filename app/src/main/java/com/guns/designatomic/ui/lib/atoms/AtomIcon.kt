package com.guns.designatomic.ui.lib.atoms

import androidx.compose.material.Icon
import androidx.compose.material.LocalContentAlpha
import androidx.compose.material.LocalContentColor
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource

@Composable
fun AtomIcon(
    modifier: Modifier = Modifier,
    description: String? = null,
    icon: Int,
    colorTint: Color = LocalContentColor.current.copy(alpha = LocalContentAlpha.current),
) {
    Icon(
        painter = painterResource(icon),
        modifier = modifier,
        contentDescription = description,
        tint = colorTint,
    )
}