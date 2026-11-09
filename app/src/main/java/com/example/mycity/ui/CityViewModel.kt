package com.example.mycity.ui

import androidx.lifecycle.ViewModel
import com.example.mycity.data.Category
import com.example.mycity.data.LocalPlacesDataProvider
import com.example.mycity.data.Place
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

/** Menyimpan state dan menerima event dari UI. State bertahan saat layar diputar. */
class CityViewModel : ViewModel() {

    private val _uiState = MutableStateFlow(
        CityUiState(placesByCategory = LocalPlacesDataProvider.placesByCategory)
    )
    val uiState: StateFlow<CityUiState> = _uiState.asStateFlow()

    fun selectCategory(category: Category) {
        _uiState.update { it.copy(currentCategory = category, selectedPlace = null) }
    }

    fun selectPlace(place: Place) {
        _uiState.update { it.copy(selectedPlace = place) }
    }
}
