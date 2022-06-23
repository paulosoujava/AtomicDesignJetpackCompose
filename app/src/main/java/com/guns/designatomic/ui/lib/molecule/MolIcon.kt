package com.guns.designatomic.ui.lib.molecule

import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.guns.designatomic.R
import com.guns.designatomic.ui.lib.atoms.AtomIcon
import com.guns.designatomic.ui.theme.Black
import com.guns.designatomic.ui.theme.black200

enum class StateIcon(val icon: Int) {
    MENU(R.drawable.ic_drawer),
    BACK(R.drawable.ic_back),
    POINT(R.drawable.ic_point),
    SEARCH(R.drawable.ic_search),
}

@Composable
fun LibIcon(stateIcon: StateIcon, modifier: Modifier = Modifier) {
    when (stateIcon) {
        StateIcon.MENU -> AtomIcon(
            icon = StateIcon.MENU.icon,
            colorTint = black200,
            modifier = Modifier.size(34.dp)
        )
        StateIcon.BACK -> AtomIcon(icon = StateIcon.BACK.icon, colorTint = Black)
        StateIcon.POINT -> AtomIcon(
            icon = StateIcon.POINT.icon,
            colorTint = Black,
            modifier = Modifier
                .size(83.dp, 24.dp)
        )
        StateIcon.SEARCH -> AtomIcon(
            icon = StateIcon.SEARCH.icon,
            colorTint = black200,
            modifier = Modifier.size(34.dp)
        )
    }
}