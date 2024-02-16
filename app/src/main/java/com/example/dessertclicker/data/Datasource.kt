/*
 * Copyright (C) 2023 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.dessertclicker.data

import com.example.dessertclicker.R
import com.example.dessertclicker.model.DessertUiState

/**
 * [Datasource] generates a list of [DessertUiState]
 */
object Datasource {
    val dessertList = listOf(
        DessertUiState(R.drawable.cupcake, 5, 0),
        DessertUiState(R.drawable.donut, 10, 5),
        DessertUiState(R.drawable.eclair, 15, 20),
        DessertUiState(R.drawable.froyo, 30, 50),
        DessertUiState(R.drawable.gingerbread, 50, 100),
        DessertUiState(R.drawable.honeycomb, 100, 200),
        DessertUiState(R.drawable.icecreamsandwich, 500, 500),
        DessertUiState(R.drawable.jellybean, 1000, 1000),
        DessertUiState(R.drawable.kitkat, 2000, 2000),
        DessertUiState(R.drawable.lollipop, 3000, 4000),
        DessertUiState(R.drawable.marshmallow, 4000, 8000),
        DessertUiState(R.drawable.nougat, 5000, 16000),
        DessertUiState(R.drawable.oreo, 6000, 20000)
    )
}
