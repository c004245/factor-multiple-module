package com.example.factor_multiple_module.ui.theme

import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController

@Composable
fun JetnewsApp(
    widthSizeClass: WindowWidthSizeClass
) {
    FactormultiplemoduleTheme {
        val navController = rememberNavController()
        val navigationActions = remember(navController) {
            JetnewsNavigationActions(navController = navController)
        }

        val coroutineScope = rememberCoroutineScope()

        val navBackStackEntry by navController.currentBackStackEntryAsState()

        val currentRoute =
            navBackStackEntry?.destination?.route ?: JetnewsDestinations.HOME_ROUTE

        val isExpandedScreen = widthSizeClass == WindowWidthSizeClass.Expanded

        val sizeAwareDrawerState = rememberSize

    }
}