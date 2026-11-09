package com.example.mycity.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.mycity.data.Category
import com.example.mycity.ui.gradient
import com.example.mycity.ui.icon

/** Pengganti foto: latar gradien dengan ikon kategori. Bisa diganti foto asli milik sendiri. */
@Composable
fun PlacePlaceholder(
    category: Category,
    modifier: Modifier = Modifier,
    iconSize: Dp = 40.dp
) {
    Box(
        modifier = modifier.background(Brush.linearGradient(category.gradient)),
        contentAlignment = Alignment.Center
    ) {
        Icon(
            imageVector = category.icon,
            contentDescription = null,
            tint = Color.White.copy(alpha = 0.92f),
            modifier = Modifier.size(iconSize)
        )
    }
}
