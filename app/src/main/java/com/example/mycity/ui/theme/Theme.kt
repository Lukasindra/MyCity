package com.example.mycity.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

// Palet hangat bernuansa batik soga (cokelat) dengan aksen emas dan zaitun.
private val LightColors = lightColorScheme(
    primary = Color(0xFF8C4A2F),
    onPrimary = Color(0xFFFFFFFF),
    primaryContainer = Color(0xFFFFDBCC),
    onPrimaryContainer = Color(0xFF351000),
    secondary = Color(0xFF7A5900),
    onSecondary = Color(0xFFFFFFFF),
    secondaryContainer = Color(0xFFFFDDB3),
    onSecondaryContainer = Color(0xFF281900),
    tertiary = Color(0xFF665F30),
    onTertiary = Color(0xFFFFFFFF),
    tertiaryContainer = Color(0xFFEEE3A8),
    onTertiaryContainer = Color(0xFF1F1C00),
    background = Color(0xFFFFF8F5),
    onBackground = Color(0xFF201A17),
    surface = Color(0xFFFFF8F5),
    onSurface = Color(0xFF201A17),
    surfaceVariant = Color(0xFFF5DED4),
    onSurfaceVariant = Color(0xFF53433C),
    outline = Color(0xFF85736B),
    outlineVariant = Color(0xFFD8C2B9),
    surfaceBright = Color(0xFFFFF8F5),
    surfaceDim = Color(0xFFE4D7D1),
    surfaceContainerLowest = Color(0xFFFFFFFF),
    surfaceContainerLow = Color(0xFFFFF1EB),
    surfaceContainer = Color(0xFFFAEBE4),
    surfaceContainerHigh = Color(0xFFF4E5DF),
    surfaceContainerHighest = Color(0xFFEEDFD9)
)

private val DarkColors = darkColorScheme(
    primary = Color(0xFFFFB693),
    onPrimary = Color(0xFF542104),
    primaryContainer = Color(0xFF703613),
    onPrimaryContainer = Color(0xFFFFDBCC),
    secondary = Color(0xFFEBBF6F),
    onSecondary = Color(0xFF442C00),
    secondaryContainer = Color(0xFF624000),
    onSecondaryContainer = Color(0xFFFFDDB3),
    tertiary = Color(0xFFD2C78E),
    onTertiary = Color(0xFF353109),
    tertiaryContainer = Color(0xFF4C471E),
    onTertiaryContainer = Color(0xFFEEE3A8),
    background = Color(0xFF181210),
    onBackground = Color(0xFFEDE0DA),
    surface = Color(0xFF181210),
    onSurface = Color(0xFFEDE0DA),
    surfaceVariant = Color(0xFF53433C),
    onSurfaceVariant = Color(0xFFD8C2B9),
    outline = Color(0xFFA08D85),
    outlineVariant = Color(0xFF53433C),
    surfaceBright = Color(0xFF3F3835),
    surfaceDim = Color(0xFF181210),
    surfaceContainerLowest = Color(0xFF130D0B),
    surfaceContainerLow = Color(0xFF201A17),
    surfaceContainer = Color(0xFF251E1B),
    surfaceContainerHigh = Color(0xFF302825),
    surfaceContainerHighest = Color(0xFF3B3330)
)

@Composable
fun MyCityTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = if (darkTheme) DarkColors else LightColors,
        content = content
    )
}
