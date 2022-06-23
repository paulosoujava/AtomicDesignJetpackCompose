package com.guns.designatomic.ui.lib.organism

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.guns.designatomic.model.list
import com.guns.designatomic.ui.lib.molecule.LibImage
import com.guns.designatomic.ui.lib.molecule.LibText
import com.guns.designatomic.ui.lib.molecule.StateText
import com.guns.designatomic.ui.wrapper.WrapperListRow

@Composable
fun SectionList() {
    Column(
        Modifier.padding(start = 10.dp)
    ) {
        LibText(state = StateText.H3, data = "Horários" , modifier =  Modifier.padding(start = 10.dp))
        WrapperListRow(
            list = list,
            modifier = Modifier.size(70.dp, 90.dp).clip(RoundedCornerShape(30))
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                LibText(state = StateText.PARAGRAPH, data = it.time)
                LibImage(stateImage = it.icon)
                LibText(state = StateText.PARAGRAPH, data = it.temp)
            }
        }
    }
}