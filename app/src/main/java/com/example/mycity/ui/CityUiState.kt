package com.example.mycity.ui

import com.example.mycity.data.Category
import com.example.mycity.data.Place

/** Seluruh state layar. UI hanya membaca ini (aliran data searah). */
data class CityUiState(
    val placesByCategory: Map<Category, List<Place>> = emptyMap(),
    val currentCategory: Category = Category.Coffee,
    /** Tempat yang dipilih pengguna; null berarti belum ada pilihan eksplisit. */
    val selectedPlace: Place? = null
) {
    val currentPlaces: List<Place>
        get() = placesByCategory[currentCategory].orEmpty()

    /** Tempat yang ditampilkan di layar detail. Jika belum memilih, pakai yang pertama. */
    val detailPlace: Place?
        get() = selectedPlace ?: currentPlaces.firstOrNull()
}
