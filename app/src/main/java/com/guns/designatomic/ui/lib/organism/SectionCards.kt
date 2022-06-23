package com.guns.designatomic.ui.lib.organism

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.guns.designatomic.ui.lib.atoms.AtomSpace
import com.guns.designatomic.ui.lib.molecule.LibImage
import com.guns.designatomic.ui.lib.molecule.LibText
import com.guns.designatomic.ui.lib.molecule.StateImage
import com.guns.designatomic.ui.lib.molecule.StateText
import com.guns.designatomic.ui.theme.SMALL_SIZE
import com.guns.designatomic.ui.wrapper.WrapperCard

@Composable
fun SectionCards() {
    Column() {
        CardAux(StateImage.UMBRELLA, "Chuva", "3cm")
        CardAux(StateImage.WIND, "Vento", "3cm")
        CardAux(StateImage.DROP, "Pancadas", "3cm")

    }
}

@Composable
private fun CardAux(stateImage: StateImage, title: String, subtitle: String) {
    WrapperCard(
        height = 60.dp,
        contents =  listOf{
        androidx.compose.material.Card(
            modifier = Modifier
                .padding(1.dp)
                .size(30.dp),
            shape = RoundedCornerShape(10.dp)
        ) {
            LibImage(stateImage = stateImage)
        }
        LibText(state = StateText.H3, data = title)
        LibText(state = StateText.REGULAR, data = subtitle)
    } )
    AtomSpace(modifier = Modifier.height(SMALL_SIZE))
}