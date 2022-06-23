package com.guns.designatomic.ui.lib

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.guns.designatomic.ui.lib.molecule.LibIcon
import com.guns.designatomic.ui.lib.molecule.LibImage
import com.guns.designatomic.ui.lib.molecule.StateIcon
import com.guns.designatomic.ui.lib.molecule.StateImage


@Preview(showBackground = true)
@Composable
fun ShowLib() {
    Column(Modifier.padding(10.dp)) {


        for (state in StateIcon.values()) {
            LibIcon(stateIcon = state)
        }
        for (state in StateImage.values()) {
            LibImage(stateImage = state)
        }
    }
}