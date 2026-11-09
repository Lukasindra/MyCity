package com.example.mycity.data

/** Satu tempat yang direkomendasikan. */
data class Place(
    val id: Int,
    val name: String,
    val category: Category,
    /** Kawasan umum (bukan alamat lengkap). */
    val area: String,
    val description: String,
    /** Hal yang paling menonjol dari tempat ini (menu andalan, daya tarik, dll.). */
    val highlight: String
)
