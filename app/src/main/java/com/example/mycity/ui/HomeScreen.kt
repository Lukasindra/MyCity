package com.example.mycity.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.NavigationDrawerItemDefaults
import androidx.compose.material3.NavigationRail
import androidx.compose.material3.NavigationRailItem
import androidx.compose.material3.PermanentDrawerSheet
import androidx.compose.material3.PermanentNavigationDrawer
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.mycity.R
import com.example.mycity.data.Category
import com.example.mycity.data.Place
import com.example.mycity.ui.components.PlaceList

/**
 * Layar utama yang menyesuaikan ukuran layar (panduan navigasi adaptif Material Design):
 *  - Compact  : navigation bar di bawah + daftar satu kolom.
 *  - Medium   : navigation rail di kiri + daftar beberapa kolom.
 *  - Expanded : permanent navigation drawer + daftar dan detail berdampingan.
 */
@Composable
fun HomeScreen(
    uiState: CityUiState,
    widthClass: WidthClass,
    onCategorySelected: (Category) -> Unit,
    onPlaceClick: (Place) -> Unit,
    modifier: Modifier = Modifier
) {
    when (widthClass) {
        WidthClass.Compact -> CompactHome(uiState, onCategorySelected, onPlaceClick, modifier)
        WidthClass.Medium -> MediumHome(uiState, onCategorySelected, onPlaceClick, modifier)
        WidthClass.Expanded -> ExpandedHome(uiState, onCategorySelected, onPlaceClick, modifier)
    }
}

@Composable
private fun CompactHome(
    uiState: CityUiState,
    onCategorySelected: (Category) -> Unit,
    onPlaceClick: (Place) -> Unit,
    modifier: Modifier = Modifier
) {
    Scaffold(
        modifier = modifier,
        topBar = { CityTopBar() },
        bottomBar = {
            NavigationBar {
                Category.entries.forEach { category ->
                    NavigationBarItem(
                        selected = category == uiState.currentCategory,
                        onClick = { onCategorySelected(category) },
                        icon = { Icon(category.icon, contentDescription = null) },
                        label = { Text(category.shortLabel) }
                    )
                }
            }
        }
    ) { innerPadding ->
        PlaceList(
            category = uiState.currentCategory,
            places = uiState.currentPlaces,
            selectedPlace = null,
            onPlaceClick = onPlaceClick,
            modifier = Modifier.padding(innerPadding)
        )
    }
}

@Composable
private fun MediumHome(
    uiState: CityUiState,
    onCategorySelected: (Category) -> Unit,
    onPlaceClick: (Place) -> Unit,
    modifier: Modifier = Modifier
) {
    Row(modifier = modifier.fillMaxSize()) {
        NavigationRail {
            Spacer(modifier = Modifier.height(8.dp))
            Category.entries.forEach { category ->
                NavigationRailItem(
                    selected = category == uiState.currentCategory,
                    onClick = { onCategorySelected(category) },
                    icon = { Icon(category.icon, contentDescription = null) },
                    label = { Text(category.shortLabel) }
                )
            }
        }
        Scaffold(
            modifier = Modifier.weight(1f),
            topBar = { CityTopBar() }
        ) { innerPadding ->
            PlaceList(
                category = uiState.currentCategory,
                places = uiState.currentPlaces,
                selectedPlace = null,
                onPlaceClick = onPlaceClick,
                modifier = Modifier.padding(innerPadding)
            )
        }
    }
}

@Composable
private fun ExpandedHome(
    uiState: CityUiState,
    onCategorySelected: (Category) -> Unit,
    onPlaceClick: (Place) -> Unit,
    modifier: Modifier = Modifier
) {
    PermanentNavigationDrawer(
        modifier = modifier,
        drawerContent = {
            PermanentDrawerSheet(modifier = Modifier.width(260.dp)) {
                Text(
                    text = stringResource(R.string.app_name),
                    style = MaterialTheme.typography.titleLarge,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.primary,
                    modifier = Modifier.padding(horizontal = 28.dp, vertical = 24.dp)
                )
                Category.entries.forEach { category ->
                    NavigationDrawerItem(
                        selected = category == uiState.currentCategory,
                        onClick = { onCategorySelected(category) },
                        icon = { Icon(category.icon, contentDescription = null) },
                        label = { Text(category.title) },
                        modifier = Modifier.padding(NavigationDrawerItemDefaults.ItemPadding)
                    )
                }
            }
        }
    ) {
        Scaffold(topBar = { CityTopBar() }) { innerPadding ->
            Row(modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
            ) {
                PlaceList(
                    category = uiState.currentCategory,
                    places = uiState.currentPlaces,
                    selectedPlace = uiState.detailPlace,
                    onPlaceClick = onPlaceClick,
                    modifier = Modifier.weight(0.45f)
                )
                uiState.detailPlace?.let { place ->
                    PlaceDetailContent(
                        place = place,
                        modifier = Modifier.weight(0.55f)
                    )
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun CityTopBar(modifier: Modifier = Modifier) {
    TopAppBar(
        modifier = modifier,
        title = {
            Column {
                Text(
                    text = stringResource(R.string.app_name),
                    style = MaterialTheme.typography.titleLarge,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = stringResource(R.string.app_subtitle),
                    style = MaterialTheme.typography.bodySmall
                )
            }
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer,
            titleContentColor = MaterialTheme.colorScheme.onPrimaryContainer
        )
    )
}
