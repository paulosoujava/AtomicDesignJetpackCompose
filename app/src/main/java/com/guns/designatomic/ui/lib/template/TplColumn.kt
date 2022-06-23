package com.guns.designatomic.ui.lib.template

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import com.guns.designatomic.ui.theme.orange
import com.guns.designatomic.ui.theme.orange100


/*
 Aqui usa-se:
  Organismos ,
  Themes
  *sem view model aqui
 */


@Composable
fun TplColumn(
    organism: List< @Composable () -> Unit>,
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.linearGradient(
                    colors = listOf(
                        orange,
                        orange100,
                    )
                )
            )
    ) {
        organism.forEach{
            it()
        }
    }
}