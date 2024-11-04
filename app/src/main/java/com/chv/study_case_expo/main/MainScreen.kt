package com.chv.study_case_expo.main

import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun TouhouScreen() {

    val viewModel: MainViewModel = viewModel()

    // TODO: fetch data from viewmodel and show in the ui

    Scaffold(
        topBar = {
            Text("Tohou List")
        }
    ) { paddingValues ->
        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            contentPadding = paddingValues
        ) {

        }
    }
}