package com.guns.designatomic.ui.lib.atoms

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.guns.designatomic.R






@Composable
fun AtomImage(
    modifier: Modifier = Modifier,
    contentScale: ContentScale = ContentScale.Crop,
    drawable: Int,
    contentDescription: String? = null
) {
    Image(
        painter = painterResource(id = drawable),
        contentScale = contentScale,
        modifier = modifier,
        contentDescription = contentDescription
    )
}