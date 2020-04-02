package com.example.equiphy

object EquipmentList {
    private val equipmentName = arrayListOf(
        "GLOBE VALVE",
        "PLATE HEAT EXCHANGER",
        "CENTRIFUGAL PUMP",
        "SIEVER (SCREENING)",
        "FILTRATION",
        "EVAPORATOR",
        "DECANTER",
        "LEACHING EQUIPMENT",
        "SEPARATOR",
        "MIXER TANK"
    )

    private val equipmentType = arrayListOf(
        "Valve",
        "Heat Exchanger",
        "Pump",
        "Solid-Solid Separation",
        "Liquid-Solid Separation",
        "Dissolved Solid Separation",
        "Liquid-Liquid Separation",
        "Dissolved Liquid Separation",
        "Gas-Liquid Separation",
        "Mixing"
    )

    private val equipmentDesc = arrayListOf(
        "Globe valve merupakan suatu valve yang memiliki arah gerak linier. Globe valve konvensional biasa digunakan sebagai throttling services. " +
                "Globe valve juga umum digunakan sebagai control valve. Control valve berfungsi untuk mengatur laju suatu aliran. Pada perancangannya " +
                "penurunan tekanan (pressure drop) harus dipertimbangkan, dimana maksimal pressure drop yang diperbolehkan yatiu 20% dari aliran utama.",
        "Plate heat exchanger (PHE) merupakan salah satu penukar panas yang terdiri dari pelat-pelat (plate). Pelat disusun sedemikian rupa seingga terbentuk " +
                "dua jalur yang disebut aliran panas (hot side) dan aliran dingin (cold side). Pertukaran panas tejadi dari aliran panas ke aliran yang lebih " +
                "dingin melalui pelat-pelat yang memisahkan kedua jalur tersebut. Penggunaan plate heat exchanger di industri salah satunya untuk pasteurisasi " +
                "susu pada industri makanan/minuman.",
        "Pompa sentrifugal merupakan pompa yang umum ditemui dalam pabrik (plant). Pompa digunakan untuk mengalirkan fluida cair. Pompa sentrifugal memanfaatkan " +
                "gaya sentrifugal untuk memindahkan fluida. Gaya sentrifugal merupakansuatu gaya gerak melingkar yang berputar menjauhi pusat lingkaran. Pada pompa " +
                "sentrifugal, komponen yang bernama impeller akan berputar sehingga air akan terdorong di impeller lewat gaya sentrifugal dan air akan keluar di saluran " +
                "discharge.",
        "Screening berfungsi untuk memisahkan partikel berdasarkan ukurannya. Tujuan penggunaannya yaitu untuk mengelompokan suatu partikel berdasarkan " +
                "rentang ukurannya. Peralatan screening dalam skala industri digunakan untuk mengelompokan partikel dalam rentang yang cukup luas, dari ukuran " +
                "powder samapai batu besar. Ukuran screening dibagi dalam dua jenis, yaitu dalam mesh (untuk partikel ukuran kecil) dan dalam ukuran sebenarnya " +
                "(untuk ukuran yang besar).",
        "Pada proses filtrasi, partikel padat dipidahkan dari cairan dengan melewatkan (menyaring) lumpur (slurry) ke suatu media yang memiliki pori-pori. Proses " +
                "filtrasi pemakaiannya luas yang dilakukan oleh industri kimia dan industri lainnya. Beberapa tipe alat dan media filter digunakan yang didesain " +
                "sehingga memenuhi spesifikasi yang diperlukan. Dalam penggunaanya di industri, proses filtrasi menggunakan vakum, bertekanan, atau gaya sentrifugal " +
                "untuk mendorong cairan (liquid) supaya dapat menembus lapisan cake yang terbentuk (cake terbentuk karena ada penumpukam lapisan pada pada permukaan media " +
                "filter.",
        "Proses evaporasi merupakan suatu proses untuk mengurangi kandungan solvent (pelarut) dalam suatu larutan, dimana terdapat kandungan partikel padat terlarut (solut) " +
                "yang tidak mudah menguap. Alat untuk melakukan proses evaporasi disebut evaporator. Proses evaporasi umumnya menghasilkan suatu larutan yang pekat hingga terjadinya proses kristalisasi. Contoh proses evaporasi yaitu " +
                "pembentukan kristal gula. Larutan gula masuk kedalam evaporator, dimana akan terjadi penguapan solvent berupa air sehingga akan terjadi pemekatan dalam larutan " +
                "gula. Semakin lama kandungan air akan berkurang menyebabkan nilai kelarutan gula akan meningkat, sehingga dapat terjadi proses kristalisasi.",
        "Decanter digunakan untuk memisahkan cairan dengan cairan menggunakan perbedaan densitas (massa jenis). Suatu campuran cair-cair yang dimasukkkan kedalam decanter, dan didiamkan " +
                "dengan waktu tinggal tertentu, cairan yang leih rendah massa jenisnya (light liquid) akan bergerak naik keatas permukaan, dan cairan yang memiliki densitas lebih besar " +
                "(heavy liquid) akan bergerak kebawah. Sehingga dalam decanter ini akan ada 3 (tiga) zona yaitu zona clear heavy liquid, zona dispersi, dan zona clear light liquid.",
        "Leaching merupakan suatu proses untuk mengambil (extract) cairan yang terdapat pada padatan dengan mengontakkannya dengan solven (pelarut) yang sesuai. Contoh penerapannya yaitu " +
                "untuk mengekstrak minyak yang berharga dari kacang-kacangan dan biji-bijian seperti minyak sawit. Pada proses leaching, solven dan padatan dimasukkan kedalam contactor. Di dalam " +
                "contactor terjadi perpindahan massa yang berupa solut (cairan yang terkandung dalam padatan) dari padatan ke solven. ",
        "Suatu aliran yang merupakan campuran gas-cair terkadang dapat merusak perlatan yang ada, atau ada suatu proses yang menginginkan proses berlangsung dalam fasa gas saja atau cair saja. " +
                "Maka dari itu aliran cair-gas ini perlu dipisahkan. Untuk pemisahan gas-cair bisanaya menggunakan vertical separator atau horizontal separator. Didalam separator, aliran " +
                "gas-cair dimasukkan, fasa gas akan naik ke atas separator dan fasa cair akan turun ke bawah separator.",
        "Mixing tank atau tangki berpengaduk merupakan suatu alat yang umum dijumpai untuk proses mencampurkan cairan dan menyaiapkan larutan yang akan digunakan oleh proses selanjutnya. Di dalam " +
                "mixing tank, suatu pola akan terbentuk dari proses pengadukan. Pola yang terbentuk ini dapat berbeda-beda tergantung jenis pengaduk yang digunakan. "
    )

    private val equipmentImg = intArrayOf(
        R.drawable.globe_valve,
        R.drawable.phe,
        R.drawable.centrifugal_pump,
        R.drawable.rotary_siever,
        R.drawable.filtration,
        R.drawable.evaporator,
        R.drawable.decanter,
        R.drawable.leaching_equipment,
        R.drawable.vertical_separator,
        R.drawable.mixer_tank
    )

    val listData: ArrayList<Equipment>
        get() {
            val list = arrayListOf<Equipment>()
            for (position in equipmentName.indices) {
                val equipment = Equipment()
                equipment.name = equipmentName[position]
                equipment.type = equipmentType[position]
                equipment.desc = equipmentDesc[position]
                equipment.img = equipmentImg[position]
                list.add(equipment)
            }
            return list
        }
}