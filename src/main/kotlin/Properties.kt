/*properties accessor secara default class dibuat secara mutable dan akan memiliki
* fungsi getter dan setter jika menggunakan (var),namun jika (val) ia hanya menghasilkan getter
* disini properties accessor digunakan untuk membuat getter dan setter secara manual
* */

class  Car2 {
    var name: String = "Toyota"

}

fun main() {
    val car2 = Car2()
    println(car2.name)  //ini adalah fungsi getter yang terjadi di belakang layar
    car2.name = "Daihatsu"
    println("Name berubah : ${car2.name}") // ini fungsi setter
}