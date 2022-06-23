package com.guns.designatomic.ui.lib.organism

import androidx.compose.runtime.Composable
import com.guns.designatomic.ui.lib.molecule.LibIcon
import com.guns.designatomic.ui.lib.molecule.StateIcon
import com.guns.designatomic.ui.wrapper.WrapperHeader

/*
COnterá o view Model,
 pode usar:
 Wrapper
 Atom e
 outros organimos
 */
@Composable
fun SectionHeader() {
    WrapperHeader(contents = listOf {
        LibIcon(stateIcon = StateIcon.SEARCH)
        LibIcon(stateIcon = StateIcon.POINT)
        LibIcon(stateIcon = StateIcon.MENU)
    })
}