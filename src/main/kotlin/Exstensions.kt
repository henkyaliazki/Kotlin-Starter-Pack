/*Kotlin bisa membuat function baru tanpa harus mewakili function tersebut
* ini dinamakan Exstension Kotlin memungkinkan 2 tipe yang digunakan yaitu
* 1.Exstensions Function untuk menambahkan function baru
* 2.Exstensions Properties untuk menambahkan properties baru*/

//Exstension function -> diawali dengan menentukan receiver baru kemudian nama function
fun Int.printInt() {
    println("value $this")
    /*disini Int bertindak sebagai receiver type dan $this sebagai objectt rujukan dari type receiver*/
}

//kita juga bisa mengembalikan nilai untuk function exstension tersebut
fun String.printString(): String {
    val addValue = "$this ali"
    return addValue
}

//Exstensions Properties
class Users(val firstName: String, val lastName: String)

val Users.fullName: String
    get() = "$firstName $lastName"
/*disini kita akan menggabungkan properti class user menjadi satu
* dengan fungsi get()*/

fun main() {
    /*cara pemanggilan exstension function harus sesuai dengan type data receiver*/
    10.printInt()
    //cara pemanggilan pengembalian nilai
    val resultExstensionPrint = "aku".printString()
    println(resultExstensionPrint)
    //cara pemanggilan exstensions properties
    val users = Users("agus", "ali")
    println("Full name: ${users.fullName}")
}