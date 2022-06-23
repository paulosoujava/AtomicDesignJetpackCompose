package com.guns.designatomic.ui.lib.atoms

import androidx.compose.material.Button
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

/*
átomos de nossas interfaces servem como os blocos de construção
fundamentais que compreendem todas as nossas interfaces de usuário
 */
@Composable
fun AtomButton(
    content: @Composable () -> Unit,
    onClick: () -> Unit,
    modifier: Modifier ,
    enabled: Boolean = true

) {
    Button(
        onClick = onClick,
        enabled = enabled,
        modifier = modifier,
    )
    {
        content()
    }
}