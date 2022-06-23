package com.guns.designatomic.ui.lib.organism

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.guns.designatomic.ui.lib.molecule.LibImage
import com.guns.designatomic.ui.lib.molecule.LibText
import com.guns.designatomic.ui.lib.molecule.StateImage
import com.guns.designatomic.ui.lib.molecule.StateText
import com.guns.designatomic.ui.wrapper.WrapperRainInfo

@Composable
fun SectionRainInfo() {
    WrapperRainInfo(
        firstContainer = {
            LibImage(stateImage = StateImage.CLOUDY_RAIN_SUN, modifier = androidx.compose.ui.Modifier.width(200.dp))
        },
        secondColumnContainer = listOf{
            LibText(state = StateText.H1, data = "19")
            LibText(state = StateText.H2, data = "Chuva")
        },
        lastContainer = {
            LibText(state = StateText.H3, data = "˙C", modifier = Modifier.padding(top = 20.dp))
        }
    )
}
