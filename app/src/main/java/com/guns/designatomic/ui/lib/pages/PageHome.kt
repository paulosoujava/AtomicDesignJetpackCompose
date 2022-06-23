package com.guns.designatomic.ui.lib.pages

import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.guns.designatomic.ui.lib.atoms.AtomSpace
import com.guns.designatomic.ui.lib.organism.SectionCards
import com.guns.designatomic.ui.lib.organism.SectionHeader
import com.guns.designatomic.ui.lib.organism.SectionInf
import com.guns.designatomic.ui.lib.organism.SectionList
import com.guns.designatomic.ui.lib.organism.SectionRainInfo
import com.guns.designatomic.ui.lib.template.TplColumn

import com.guns.designatomic.ui.theme.IndieFlowerTypographyTheme
import com.guns.designatomic.ui.theme.LARGE_SIZE
import com.guns.designatomic.ui.theme.SMALL_SIZE


/*
As páginas também fornecem um local para articular variações de templates
 */

@Preview
@Composable
fun PageHome() {
    IndieFlowerTypographyTheme {
        TplColumn(organism = listOf {
            SectionHeader()
            AtomSpace(modifier = Modifier.height(SMALL_SIZE))
            SectionInf()
            AtomSpace(modifier = Modifier.height(SMALL_SIZE))
            SectionRainInfo()
            AtomSpace(modifier = Modifier.height(SMALL_SIZE))
            SectionCards()
            AtomSpace(modifier = Modifier.height(LARGE_SIZE))
            SectionList()
        })
    }
}