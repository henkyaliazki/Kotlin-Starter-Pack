/*
* Set adalah turunan dari Collection dimana Set tempat menyimpan
* nilai yang unik/tidak ada duplikasi nilai
* */

val integerSet = setOf(1, 3, 3, 1, 2, 5, 7)

//didalam set urutan tidak terlalu penting tapi nilai lah yg menjadi acuan

val intSet = setOf(2, 1, 3, 7, 5)
val setInt = setOf(3, 1, 2, 2, 5, 4, 5)

fun main() {
    println(integerSet) //secara otomatis nilai yang sama akan di hilangkan
    println(integerSet == intSet) //true

    //pengecekan nilai apakah ada atau tidak dalam set
    println(5 in intSet) //true
    println(4 in intSet) //false

    //intersect/cara mengetahui gabungan dan irisan dari 2 buah set
    val union = intSet.union(setInt)
    println("ini adalah union/gabungan : $union")
    val intersect = intSet.intersect(setInt)
    println("ini adalah intersect/irisan : $intersect") //irisan adalah dimana dua set memiliki nilai tersebut


    /*Pada Mutable Set kita bisa menambah dan menghapus item
    * namun tak bisa mengubah nilai seperti pada List.
    * */

    val mutableSet = mutableSetOf(1,2,4,3,2,1)
    println("sebelum di manipulasi: $mutableSet")
    mutableSet.add(6) //menambah dikahir set
    mutableSet.remove(1) //menghapus item yang mempunyai nilai 1
    println("setelah di manipulasi: $mutableSet")
}