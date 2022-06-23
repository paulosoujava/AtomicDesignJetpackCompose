package com.guns.designatomic.model

import com.guns.designatomic.ui.lib.molecule.StateImage

data class DumpData(
    val time: String,
    val icon: StateImage,
    val temp: String
)

val list = listOf(
    DumpData  ("12:00", StateImage.CLOUDY, "19˙"),
    DumpData  ("14:00", StateImage.CLOUDY_RAIN, "19˙"),
    DumpData  ("15:00", StateImage.CLOUDY_RAIN_SUN, "19˙"),
    DumpData  ("16:00", StateImage.CLOUDY_RAIN, "19˙"),
    DumpData  ("18:00", StateImage.CLOUDY_SUN, "19˙"),
    DumpData  ("19:00", StateImage.CLOUDY, "19˙"),
    DumpData  ("20:00", StateImage.CLOUDY_RAIN, "19˙"),
    DumpData  ("21:00", StateImage.CLOUDY_RAIN_SUN, "19˙"),
    DumpData  ("22:00", StateImage.CLOUDY, "19˙"),
)