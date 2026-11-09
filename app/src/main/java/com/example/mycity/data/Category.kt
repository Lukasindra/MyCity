package com.example.mycity.data

/** Kategori rekomendasi. Lapisan data tidak tahu apa pun soal ikon atau warna (itu urusan UI). */
enum class Category(
    val title: String,
    val shortLabel: String,
    val tagline: String
) {
    Coffee("Kedai Kopi", "Kopi", "Ngopi santai di Kota Pelajar"),
    Restaurant("Restoran", "Kuliner", "Cita rasa khas Jogja"),
    Park("Taman & Wisata", "Wisata", "Jalan-jalan dan cari angin"),
    Mall("Pusat Perbelanjaan", "Belanja", "Dari mal modern sampai pasar tradisional")
}
