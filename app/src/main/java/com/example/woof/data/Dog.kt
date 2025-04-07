/*
 * Copyright (C) 2023 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.woof.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.woof.R

/**
 * A data class to represent the information presented in the dog card
 */
data class Dog(
    @DrawableRes val imageResourceId: Int,
    @StringRes val name: Int,
    val age: Int,
    @StringRes val hobbies: Int
)

val dogs = listOf(
    Dog(R.drawable.alimento, R.string.day_1, 1, R.string.day_description_1),
    Dog(R.drawable.ativ_fisica, R.string.day_2, 2, R.string.day_description_2),
    Dog(R.drawable.sono, R.string.day_3, 3, R.string.day_description_3),
    Dog(R.drawable.redes_sociais, R.string.day_4, 4, R.string.day_description_4),
    Dog(R.drawable.agua, R.string.day_5, 5, R.string.day_description_5),
    Dog(R.drawable.livros, R.string.day_6, 6, R.string.day_description_6),
    Dog(R.drawable.estudar, R.string.day_7, 7, R.string.day_description_7),
    Dog(R.drawable.gentil, R.string.day_8, 8, R.string.day_description_8),
    Dog(R.drawable.meditar, R.string.day_9, 9, R.string.day_description_9),
    Dog(R.drawable.acordar, R.string.day_10, 10, R.string.day_description_10),
    Dog(R.drawable.diario, R.string.day_11, 11, R.string.day_description_11),
    Dog(R.drawable.gratidao, R.string.day_12, 12, R.string.day_description_12),
    Dog(R.drawable.organizacao_social, R.string.day_13, 13, R.string.day_description_13),
    Dog(R.drawable.metas, R.string.day_14, 14, R.string.day_description_14),
    Dog(R.drawable.pausa, R.string.day_15, 15, R.string.day_description_15),
    Dog(R.drawable.postura, R.string.day_16, 16, R.string.day_description_16),
    Dog(R.drawable.musica, R.string.day_17, 17, R.string.day_description_17),
    Dog(R.drawable.iluminacao_natural, R.string.day_18, 18, R.string.day_description_18),
    Dog(R.drawable.planejamento, R.string.day_19, 19, R.string.day_description_19),
    Dog(R.drawable.alongamentos, R.string.day_20, 20, R.string.day_description_20),
    Dog(R.drawable.cafeina, R.string.day_21, 21, R.string.day_description_21),
    Dog(R.drawable.relacionamentos, R.string.day_22, 22, R.string.day_description_22),
    Dog(R.drawable.economizar, R.string.day_23, 23, R.string.day_description_23),
    Dog(R.drawable.reclamacoes, R.string.day_24, 24, R.string.day_description_24),
    Dog(R.drawable.respiracao, R.string.day_25, 25, R.string.day_description_25),
    Dog(R.drawable.celebrar, R.string.day_26, 26, R.string.day_description_26),
    Dog(R.drawable.banhos_frios, R.string.day_27, 27, R.string.day_description_27),
    Dog(R.drawable.anotar_ideias, R.string.day_28, 28, R.string.day_description_28),
    Dog(R.drawable.escutar_mais, R.string.day_29, 29, R.string.day_description_29),
    Dog(R.drawable.evite_julgar, R.string.day_30, 30, R.string.day_description_30),


)
