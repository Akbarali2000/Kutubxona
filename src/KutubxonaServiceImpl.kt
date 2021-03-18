import java.util.*

class KutubxonaServiceImpl : KutubxonaService {

    var scanner = Scanner(System.`in`)
    var count:Int=0
    var currentIndex:Int=0
    var bookList= arrayListOf<Book>()
    var studentList = arrayListOf<Student>()

    override fun studentregistration() {
        println("Student ismini kiriting:")
        var studentname = scanner.next()
        println("Student familiyasini kiriting:")
        var studentlastname = scanner.next()
        println("Student gruppasini kiriting:")
        var studentgroupnumber = scanner.nextInt()
        var student = Student(++count,studentname,studentlastname,studentgroupnumber)
        studentList.add(student)
        println("Sizning id raqamingiz:$count")
        println("Student muvaffaqiyatli saqlandi!!!")


    }

    override fun bookadd() {
        println("Kitob nomini kiriting:")
        var bookname = scanner.next()
        println("Bo`limni tanlang:")
        val values = BOOKS.values()
        var count: Int = 1

        for (value in values) {
            println("$count->$value")
            count++
        }
        var n = scanner.nextInt()
        for (i in values.indices) {
            if (n == i + 1) {
                var book = Book(bookname, values[i].toString())
                bookList.add(book)
                println("Kitob qo`shildi!!!")

            }
        }


    }

    override fun kitobolish() {

        println("Ismingizni kiriting:")
        var name = scanner.next()
        println("Id ni  kiriting:")
        var id = scanner.nextInt()
        var b: Boolean = false
        for (i in 0 until studentList.size) {
            if (name == studentList[i].studentname && id == studentList[i].id) {
                currentIndex=i
                println("Mavjud kitoblar ro`yxati:")
                if (bookList.size == 0) {
                    println("Hozircha kitoblar qo`shilgani yuq!!!")
                }
                for (i in 0 until bookList.size) {
                    println("${i + 1}->${bookList[i].toString()}")
                }
                println("Ro`yxatda sizga kerak kitob bormi???\n1->Ha\n2->Yo`q")
                var k = scanner.nextInt()
                when (k) {
                    1 -> {
                        println("Kitobni tanlang: 1 yoki 2 ko`rinishida")
                        var number3 = scanner.nextInt()
                        for (i in 0 until bookList.size) {
                            if (number3 == i + 1) {



                                b = true

                            }
                        }

                    }
                    2 -> {
                        println("Ro`yxatda sizga kerak kitob bo`lmasa kitob nomini kiriting topib beramiz:")
                        var bookname1 = scanner.next()


                        b = true
                    }
                }


            }
        }
        if (b) {
            println("Sizga kitob 30 kun muddatga berildi!!!")
        } else {
            println("Siz kutubxonadan ro`yxatdan o`tmagansiz!!!\nAvval ro`yxatdan o`ting keyin kitob olishingiz mumkin!!!")
        }
    }

    override fun kitobniqayatrish() {
        println("Ismingizni kiriting:")
        var name = scanner.next()
        println("Familiyangizni kiriting:")
        var familiya = scanner.next()
        var removedbook: Student? = null
        var d: Boolean = false
        for (i in 0 until studentList.size) {
            if (name == studentList[i].studentname && familiya == studentList[i].studentlastname) {
                println("Siz olgan kitob nomi:")
//                if (studentList1[i].equals(null)){
//                    println("Sizda topshirilmagan kitoblar yuq!!!")
//                }


                println("Yuqorida ko`rsatilgan kitob haqiqatdan siz olgan kitobmi?")
                println("1->Ha\n2->Yo`q")
                var m = scanner.nextInt()
                when (m) {
                    1 -> {

                        d = true
                    }
                    2 -> {
                        println("Kitob nomini kiriting:")
                        var bookname2 = scanner.next()
                        println("Bo`limni tanlang:")
                        val values = BOOKS.values()
                        var count1: Int = 1

                        for (value in values) {
                            println("$count1->$value")
                            count1++
                        }
                        var n = scanner.nextInt()
                        for (i in values.indices) {
                            if (n == i + 1) {
                                var book = Book(bookname2, values[i].toString())
                                bookList.add(book)
                                println("Kitobni qabul qildik!!!")
                            }


                        }


                    }
                }
            }
        }

        if (d) {

            println("Siz kitobni topshirdingiz!!!")

        } else {
            println("Ism yoki Familiya noto`g`ri kiritildi!!!")
        }
    }

    override fun kitobjoylashtirish() {


    }

    override fun olingankitoblarroyxati() {
        for (i in 0 until bookList.size) {

        }

    }

    override fun studentlarroyaxti() {

    }
}