package com.example.mycity

import com.example.mycity.data.Category
import com.example.mycity.ui.CityViewModel
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
import org.junit.Assert.assertTrue
import org.junit.Test

class CityViewModelTest {

    @Test
    fun everyCategoryHasAtLeastThreePlaces() {
        val state = CityViewModel().uiState.value
        Category.entries.forEach { category ->
            assertTrue(
                "${category.title} harus punya minimal 3 tempat",
                state.placesByCategory[category].orEmpty().size >= 3
            )
        }
    }

    @Test
    fun selectCategory_changesList_andResetsSelection() {
        val viewModel = CityViewModel()
        viewModel.selectPlace(viewModel.uiState.value.currentPlaces[1])

        viewModel.selectCategory(Category.Restaurant)

        val state = viewModel.uiState.value
        assertEquals(Category.Restaurant, state.currentCategory)
        assertNull(state.selectedPlace)
        assertTrue(state.currentPlaces.all { it.category == Category.Restaurant })
        assertEquals(state.currentPlaces.first(), state.detailPlace)
    }

    @Test
    fun selectPlace_updatesDetailPlace() {
        val viewModel = CityViewModel()
        val target = viewModel.uiState.value.currentPlaces[2]

        viewModel.selectPlace(target)

        assertEquals(target, viewModel.uiState.value.detailPlace)
    }
}
