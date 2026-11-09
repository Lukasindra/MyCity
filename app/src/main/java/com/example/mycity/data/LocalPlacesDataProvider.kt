package com.example.mycity.data

/** Sumber data lokal: daftar rekomendasi tempat di Yogyakarta. */
object LocalPlacesDataProvider {

    val allPlaces: List<Place> = listOf(
        // ---------- Kedai Kopi ----------
        Place(
            id = 1,
            name = "Angkringan Lik Man",
            category = Category.Coffee,
            area = "Dekat Stasiun Tugu, Yogyakarta",
            description = "Angkringan legendaris yang sudah ada sejak tahun 1950-an dan terkenal dengan " +
                "kopi joss, yaitu kopi yang dicelupi arang membara. Suasananya santai dan cocok " +
                "untuk mengobrol sampai larut malam sambil menyantap nasi kucing.",
            highlight = "Kopi joss dan nasi kucing"
        ),
        Place(
            id = 2,
            name = "Warung Kopi Klotok",
            category = Category.Coffee,
            area = "Kaliurang, Sleman",
            description = "Warung kopi dengan suasana pedesaan dan pemandangan sawah. Kopinya diseduh " +
                "ala klotok di atas tungku arang, lalu disajikan bersama masakan rumahan.",
            highlight = "Kopi klotok dengan pemandangan sawah"
        ),
        Place(
            id = 3,
            name = "Warung Kopi Blandongan",
            category = Category.Coffee,
            area = "Banguntapan, Bantul",
            description = "Kedai kopi di sebuah rumah tua yang hangat dan akrab, buka sejak tahun 2000. " +
                "Menyajikan masakan rumahan dengan harga yang bersahabat.",
            highlight = "Suasana rumah tua dan harga terjangkau"
        ),
        Place(
            id = 4,
            name = "Filosofi Kopi Yogyakarta",
            category = Category.Coffee,
            area = "Ngaglik, Sleman",
            description = "Kedai kopi yang terinspirasi dari buku dan film karya Dee Lestari. " +
                "Tempatnya berupa rumah joglo tradisional yang nyaman untuk bersantai.",
            highlight = "Rumah joglo bertema Filosofi Kopi"
        ),
        Place(
            id = 5,
            name = "Klinik Kopi",
            category = Category.Coffee,
            area = "Pakem, Sleman",
            description = "Kedai kopi di kawasan lereng Merapi yang serius soal biji kopi dan seduhan " +
                "manual. Cocok untuk penikmat kopi yang ingin tahu asal-usul biji yang diminumnya.",
            highlight = "Seduhan manual dari biji pilihan"
        ),

        // ---------- Restoran ----------
        Place(
            id = 6,
            name = "Gudeg Yu Djum (Wijilan)",
            category = Category.Restaurant,
            area = "Wijilan, Kraton, Yogyakarta",
            description = "Gudeg legendaris yang dimasak lama dari nangka muda dengan santan dan gula " +
                "jawa. Disajikan dengan ayam, telur, dan sambal krecek.",
            highlight = "Gudeg kering"
        ),
        Place(
            id = 7,
            name = "Gudeg Pawon",
            category = Category.Restaurant,
            area = "Umbulharjo, Yogyakarta",
            description = "Gudeg yang dikenal dengan versi basahnya yang gurih dan lauk ceker areh. " +
                "Pilihan yang pas untuk mencoba sisi lain dari gudeg Yogyakarta.",
            highlight = "Gudeg basah dan ceker areh"
        ),
        Place(
            id = 8,
            name = "Sate Klathak Pak Pong",
            category = Category.Restaurant,
            area = "Pleret, Bantul",
            description = "Sate kambing khas Yogyakarta yang ditusuk dengan jeruji besi dan dibumbui " +
                "garam saja, lalu dibakar di atas arang sampai harum.",
            highlight = "Sate klathak"
        ),
        Place(
            id = 9,
            name = "Mangut Lele Mbah Marto",
            category = Category.Restaurant,
            area = "Sewon, Bantul",
            description = "Warung yang terkenal dengan mangut lele asap berkuah santan yang pedas dan " +
                "gurih. Cocok untuk yang suka masakan Jawa dengan rasa kuat.",
            highlight = "Mangut lele asap"
        ),
        Place(
            id = 10,
            name = "Bakmi Jawa Mbah Gito",
            category = Category.Restaurant,
            area = "Kotagede, Yogyakarta",
            description = "Bakmi Jawa yang dimasak di atas tungku arang sehingga aromanya khas. " +
                "Bisa dipilih godog (berkuah) atau goreng.",
            highlight = "Bakmi masak arang"
        ),

        // ---------- Taman & Wisata ----------
        Place(
            id = 11,
            name = "Taman Sari",
            category = Category.Park,
            area = "Kraton, Yogyakarta",
            description = "Bekas taman istana Keraton Yogyakarta yang dibangun pada abad ke-18. " +
                "Ada kolam pemandian, lorong, dan bangunan bergaya perpaduan Jawa dan Eropa.",
            highlight = "Kolam pemandian dan Sumur Gumuling"
        ),
        Place(
            id = 12,
            name = "Taman Pintar",
            category = Category.Park,
            area = "Dekat Malioboro, Yogyakarta",
            description = "Taman wisata edukasi sains untuk anak dan keluarga. Pengunjung bisa mencoba " +
                "berbagai alat peraga secara langsung.",
            highlight = "Wahana sains interaktif"
        ),
        Place(
            id = 13,
            name = "Alun-Alun Kidul",
            category = Category.Park,
            area = "Kraton, Yogyakarta",
            description = "Lapangan di sebelah selatan Keraton dengan dua pohon beringin kembar di " +
                "tengahnya. Ramai pada malam hari dan terkenal dengan tradisi masangin, yaitu berjalan " +
                "dengan mata tertutup di antara kedua beringin.",
            highlight = "Masangin dan jajanan malam"
        ),
        Place(
            id = 14,
            name = "Hutan Pinus Mangunan",
            category = Category.Park,
            area = "Dlingo, Bantul",
            description = "Hutan pinus yang sejuk di perbukitan Bantul. Enak untuk berjalan santai, " +
                "bersantai di bawah pohon, atau berfoto.",
            highlight = "Udara sejuk dan spot foto"
        ),
        Place(
            id = 15,
            name = "Tebing Breksi",
            category = Category.Park,
            area = "Prambanan, Sleman",
            description = "Bekas tambang batu breksi yang dipahat menjadi tebing berukir dan taman " +
                "wisata. Letaknya tidak jauh dari Candi Prambanan dan ramai saat senja.",
            highlight = "Pahatan batu dan pemandangan senja"
        ),

        // ---------- Pusat Perbelanjaan ----------
        Place(
            id = 16,
            name = "Malioboro Mall",
            category = Category.Mall,
            area = "Kawasan Malioboro, Yogyakarta",
            description = "Pusat perbelanjaan modern di tengah kawasan Malioboro. Praktis disambung " +
                "dengan jalan-jalan di sepanjang Malioboro.",
            highlight = "Belanja modern di kawasan Malioboro"
        ),
        Place(
            id = 17,
            name = "Jogja City Mall",
            category = Category.Mall,
            area = "Jalan Magelang, Sleman",
            description = "Mal dengan banyak gerai fashion, tempat makan, dan hiburan. " +
                "Cocok untuk belanja sekaligus bersantai bersama keluarga.",
            highlight = "Fashion, kuliner, dan hiburan"
        ),
        Place(
            id = 18,
            name = "Plaza Ambarrukmo",
            category = Category.Mall,
            area = "Jalan Laksda Adisucipto, Sleman",
            description = "Mal besar yang berdampingan dengan Pendopo Royal Ambarrukmo yang bersejarah. " +
                "Banyak dikunjungi mahasiswa dan wisatawan.",
            highlight = "Dekat Pendopo Royal Ambarrukmo"
        ),
        Place(
            id = 19,
            name = "Hartono Mall Yogyakarta",
            category = Category.Mall,
            area = "Condongcatur, Sleman",
            description = "Mal berukuran besar di kawasan Ring Road Utara dengan beragam gerai " +
                "fashion, elektronik, dan tempat makan.",
            highlight = "Gerai lengkap di satu tempat"
        ),
        Place(
            id = 20,
            name = "Pasar Beringharjo",
            category = Category.Mall,
            area = "Kawasan Malioboro, Yogyakarta",
            description = "Pasar tradisional bersejarah yang terkenal dengan batik, jajanan, dan " +
                "kerajinan khas Yogyakarta. Tawar-menawar adalah bagian dari serunya.",
            highlight = "Batik dan tawar-menawar"
        )
    )

    /** Tempat-tempat dikelompokkan per kategori, urutan kategori mengikuti enum. */
    val placesByCategory: Map<Category, List<Place>> =
        Category.entries.associateWith { category -> allPlaces.filter { it.category == category } }
}
