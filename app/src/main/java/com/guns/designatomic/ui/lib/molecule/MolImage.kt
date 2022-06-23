package com.guns.designatomic.ui.lib.molecule

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.guns.designatomic.R
import com.guns.designatomic.ui.lib.atoms.AtomImage

enum class StateImage(val icon: Int) {
    CLOUDY(R.drawable.ic_cloudy),
    CLOUDY_RAIN(R.drawable.ic_cloudy_rain),
    CLOUDY_SUN(R.drawable.ic_cloudy_sun),
    CLOUDY_RAIN_SUN(R.drawable.ic_cloudy_rain_sun),
    DROP(R.drawable.ic_drop),
    SUN(R.drawable.ic_sun),
    UMBRELLA(R.drawable.ic_umbrella),
    WIND(R.drawable.ic_wind),
}

@Composable
fun LibImage(modifier: Modifier = Modifier, stateImage: StateImage) {
    when (stateImage) {
        StateImage.CLOUDY -> AtomImage(drawable = StateImage.CLOUDY.icon, modifier = modifier)
        StateImage.CLOUDY_RAIN -> AtomImage(drawable = StateImage.CLOUDY_RAIN.icon, modifier = modifier)
        StateImage.CLOUDY_SUN -> AtomImage(drawable = StateImage.CLOUDY_SUN.icon, modifier = modifier)
        StateImage.CLOUDY_RAIN_SUN -> AtomImage(drawable = StateImage.CLOUDY_RAIN_SUN.icon, modifier = modifier)
        StateImage.DROP -> AtomImage(drawable = StateImage.DROP.icon, modifier = modifier)
        StateImage.SUN -> AtomImage(drawable = StateImage.SUN.icon, modifier = modifier)
        StateImage.UMBRELLA -> AtomImage(drawable = StateImage.UMBRELLA.icon, modifier = modifier)
        StateImage.WIND -> AtomImage(drawable = StateImage.WIND.icon, modifier = modifier.padding(top = 5.dp))
    }
}