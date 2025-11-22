package model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.keninlukinov30.R

/**
 * A data class to represent the information presented in the dog card
 */
data class Tanks(
    @DrawableRes val imageResourceId: Int,
    @StringRes val name: Int,
    @StringRes val opisanie: Int,
    val number: Int
)

val tanks = listOf(
    Tanks(R.drawable._90, R.string.tank1, R.string.description1, 1),
    Tanks(R.drawable.abrams, R.string.tank2, R.string.description2, 2),
    Tanks(R.drawable.leopard_2_a7v, R.string.tank3, R.string.description3, 3),
    Tanks(R.drawable.challenger2, R.string.tank4, R.string.description4, 4),
    Tanks(R.drawable.t14, R.string.tank5, R.string.description5, 5),
    Tanks(R.drawable.t54, R.string.tank6, R.string.description6, 6),
    Tanks(R.drawable.t_28, R.string.tank7, R.string.description7, 7),
    Tanks(R.drawable.t_34, R.string.tank8, R.string.description8, 8),
    Tanks(R.drawable.amx_10rc, R.string.tank9, R.string.description9, 9),
    Tanks(R.drawable.amx_13, R.string.tank10, R.string.description10, 10),
    Tanks(R.drawable.amx_50, R.string.tank11, R.string.description11, 11),
    Tanks(R.drawable.is_1, R.string.tank12, R.string.description12, 12),
    Tanks(R.drawable.is_2, R.string.tank13, R.string.description13, 13),
    Tanks(R.drawable.is_3, R.string.tank14, R.string.description14, 14),
    Tanks(R.drawable.is_4, R.string.tank15, R.string.description15, 15),
    Tanks(R.drawable.ariete, R.string.tank16, R.string.description16, 16),
    Tanks(R.drawable.chiftain, R.string.tank17, R.string.description17, 17),
    Tanks(R.drawable.strv_103, R.string.tank18, R.string.description18, 18),
    Tanks(R.drawable.strv_122, R.string.tank19, R.string.description19, 19),
    Tanks(R.drawable.vt_4, R.string.tank20, R.string.description20, 20),
    Tanks(R.drawable.leclerc, R.string.tank21, R.string.description21, 21),
    Tanks(R.drawable.type_99, R.string.tank22, R.string.description22, 22),
    Tanks(R.drawable.sherman, R.string.tank23, R.string.description23, 23),
    Tanks(R.drawable.e100, R.string.tank24, R.string.description24, 24),
    Tanks(R.drawable.tiger, R.string.tank25, R.string.description25, 25),
    Tanks(R.drawable.pantera_5, R.string.tank26, R.string.description26, 26),
    Tanks(R.drawable.maus, R.string.tank27, R.string.description27, 27),
    Tanks(R.drawable.m3lee, R.string.tank28, R.string.description28, 28),
    Tanks(R.drawable.leopard2, R.string.tank29, R.string.description29, 29),
    Tanks(R.drawable.m48, R.string.tank30, R.string.description30, 30),
)