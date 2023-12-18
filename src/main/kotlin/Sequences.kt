/*
* Sequence merupakan lazy evaluation artinya ia akan digunakan ketika
* benar-benar di perlukan, sedangkan set,map,list adalah eager evaluation
* ia akan mengiterasi semua item yang ada pada collection
* sequences berguna ketika data sudah menjadi banyak dan membebani program/aplikasi
*
* */

fun main() {
    //eager evaluation
    var list = (1..1000000).toList()
//    list.filter { it % 5 == 0 }.map { it * 2 }.forEach{ println(it) }
    //lazy evaluation
//    list.asSequence().filter { it % 5==0 }.map { it * 2 }.forEach { println("lazy evaluation - $it") }

    //cara membuat variabel sequence
    val sequencesNumber = generateSequence(1) { it + 1 }
    sequencesNumber.take(10).forEach { println("$it") }
    /*
    * kode di atas sama saja dengan loop 10 namun menggunakan sequences jadi
    * ia peraitem bakal di koreksi dan fungsi take ialah untuk batas akhir dari sequence agar tidak
    * terjadi infinity loop*/
}