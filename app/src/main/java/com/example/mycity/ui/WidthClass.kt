package com.example.mycity.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalConfiguration

/**
 * Kelas lebar layar menurut breakpoint Material Design:
 * Compact (< 600dp, ponsel), Medium (600-839dp, tablet kecil / ponsel lipat),
 * Expanded (>= 840dp, tablet besar / layar lebar).
 */
enum class WidthClass { Compact, Medium, Expanded }

@Composable
fun rememberWidthClass(): WidthClass {
    val widthDp = LocalConfiguration.current.screenWidthDp
    return when {
        widthDp < 600 -> WidthClass.Compact
        widthDp < 840 -> WidthClass.Medium
        else -> WidthClass.Expanded
    }
}
