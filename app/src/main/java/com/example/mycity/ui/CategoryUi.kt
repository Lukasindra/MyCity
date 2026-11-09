package com.example.mycity.ui

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocalCafe
import androidx.compose.material.icons.filled.Park
import androidx.compose.material.icons.filled.Restaurant
import androidx.compose.material.icons.filled.ShoppingBag
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.mycity.data.Category

/** Ikon dan warna tiap kategori. Dipisah dari lapisan data agar data tetap bebas dari urusan UI. */
val Category.icon: ImageVector
    get() = when (this) {
        Category.Coffee -> Icons.Filled.LocalCafe
        Category.Restaurant -> Icons.Filled.Restaurant
        Category.Park -> Icons.Filled.Park
        Category.Mall -> Icons.Filled.ShoppingBag
    }

val Category.gradient: List<Color>
    get() = when (this) {
        Category.Coffee -> listOf(Color(0xFF8D5B3A), Color(0xFF4E342E))
        Category.Restaurant -> listOf(Color(0xFFE2703A), Color(0xFF9C3A1A))
        Category.Park -> listOf(Color(0xFF5BA05C), Color(0xFF2E6B3A))
        Category.Mall -> listOf(Color(0xFF6F7BD9), Color(0xFF3F4B9E))
    }
