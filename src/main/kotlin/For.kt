/*
* For digunakan untuk mengiterasi/menggulang proses sesuai yang kita kehendaki
* for bisa digunakan untuk Ranges,Collection,Array
*/

fun main() {
    /*
    * for untuk dengan ranges
    */
    val ranges = 1..10
    for (i in ranges) {
        println("values is $i")
    }
    /*
    * kode diatas mencetak values is $i sebanyak ranges
    * dimana i adalah penampung sementara bagi ranges
    */
    println("range expresion and index")

//    for loop dengan range expresion
    val numbers = 1.rangeTo(10).step(3)
    for ((index, value) in numbers.withIndex()) {
        println("values is $value with step and index- $index")
    }
    /*
    * sama dengan yang kode atas namun disini kita menggunakan ekstensi step
    * dimana yang akna tercetak di tambah 3 dan index dari cetak tersebut*/
    println("forEach")

    // forEach
    val num = 1.rangeTo(10).step(4)
    num.forEachIndexed { indexs, values ->
        println("ForEach value $values with index $indexs")
    }
    /*
    * forEachIndexed mempunyai dua argument indexs merupakan index setiap nilai
    * kedua adalah value dimana merupakan nilai tunggal yang di cakup oleh num(ranges)
    * jika kita ingin hanya menggunakan argumaen index maka (_) untuk
    * menganti argumen value */
    println("forEach no values ranges arguments")

    val nums = 2.rangeTo(12).step(2)
    nums.forEachIndexed {
            indeks, _,
        ->
        println("index-$indeks")
    }
}