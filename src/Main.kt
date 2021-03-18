import java.util.*

fun main(args: Array<String>) {

    var scanner = Scanner(System.`in`)
    var kutubxonaServiceImpl = KutubxonaServiceImpl()
    while (true) {
        println("1->Kutubxonachi 2->Student")
        var e = scanner.nextInt()
        when (e) {
            1 -> {
                println(
                    "1->Studentni ro`yxatdan o`tkazish" +
                            "2->Kitob qo`shish"
                )
                var m = scanner.nextInt()
                when (m) {
                    1 -> {
                        kutubxonaServiceImpl.studentregistration()
                    }
                    2 -> {
                        kutubxonaServiceImpl.bookadd()
                    }
                }
            }
            2 -> {
                println(
                    "1->Kutubxonadan kitob olish" +
                            "2->Kutubxonga kitobni qaytarish"
                )
                var d = scanner.nextInt()
                when (d) {
                    1 -> {
                        kutubxonaServiceImpl.kitobolish()
                    }
                    2 -> {
                        kutubxonaServiceImpl.kitobniqayatrish()
                    }
                }
            }
        }

    }


}