package com.guns.designatomic.ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.guns.designatomic.R

private val light = Font(R.raw.indie_flower_regular, FontWeight.W300)
private val regular = Font(R.raw.indie_flower_regular, FontWeight.W400)
private val medium = Font(R.raw.indie_flower_regular, FontWeight.W500)
private val semibold = Font(R.raw.indie_flower_regular, FontWeight.W600)


private val craneFontFamily = FontFamily(light, regular, medium, semibold)


// Set of Material typography styles to start with
val IndieFlowerTypography = Typography(
    defaultFontFamily = craneFontFamily,
    body1 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
    subtitle1 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 9.sp
    ),
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    h1 = TextStyle(
        fontFamily = FontFamily(regular),
        fontWeight = FontWeight.SemiBold,
        fontSize = 59.sp
    ),
    h2 = TextStyle(
        fontFamily = FontFamily(regular),
        fontWeight = FontWeight.SemiBold,
        fontSize = 29.sp
    ),
    h3 = TextStyle(
        fontFamily = FontFamily(regular),
        fontWeight = FontWeight.SemiBold,
        fontSize = 19.sp
    )

)

@Composable
fun IndieFlowerTypographyTheme(content: @Composable () -> Unit) {
    MaterialTheme(typography = IndieFlowerTypography) {
        content()
    }
}
