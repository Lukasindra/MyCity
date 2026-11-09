package com.example.mycity.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

/** Layar-layar dalam aplikasi. */
enum class CityScreen { List, Detail }

@Composable
fun CityApp(
    modifier: Modifier = Modifier,
    viewModel: CityViewModel = viewModel(),
    navController: NavHostController = rememberNavController()
) {
    val uiState by viewModel.uiState.collectAsState()

    NavHost(
        navController = navController,
        startDestination = CityScreen.List.name,
        modifier = modifier
    ) {
        composable(route = CityScreen.List.name) {
            // Dibaca di dalam composable agar selalu mengikuti perubahan (rotasi, multi-window).
            val widthClass = rememberWidthClass()
            HomeScreen(
                uiState = uiState,
                widthClass = widthClass,
                onCategorySelected = viewModel::selectCategory,
                onPlaceClick = { place ->
                    viewModel.selectPlace(place)
                    // Di layar lebar, detail sudah tampil di sebelah daftar.
                    if (widthClass != WidthClass.Expanded) {
                        navController.navigate(CityScreen.Detail.name) { launchSingleTop = true }
                    }
                }
            )
        }
        composable(route = CityScreen.Detail.name) {
            val widthClass = rememberWidthClass()
            if (widthClass == WidthClass.Expanded) {
                // Layar diputar menjadi lebar saat di detail: kembali ke daftar (detail sudah di samping).
                LaunchedEffect(Unit) { navController.popBackStack() }
            } else {
                uiState.detailPlace?.let { place ->
                    DetailScreen(
                        place = place,
                        onBack = { navController.navigateUp() }
                    )
                }
            }
        }
    }
}
