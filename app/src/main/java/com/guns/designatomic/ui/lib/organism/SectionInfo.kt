package com.guns.designatomic.ui.lib.organism

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.guns.designatomic.ui.lib.molecule.LibText
import com.guns.designatomic.ui.lib.molecule.StateText
import com.guns.designatomic.ui.wrapper.WrapperTextInfo

@Composable
fun SectionInf(
) {
    WrapperTextInfo(contents = listOf {
        LibText(state = StateText.H2, data = "Florianópolis, SC" )
        LibText(state = StateText.H3, data = "parcial" , modifier = Modifier.padding(start = 20.dp))
    })

}
