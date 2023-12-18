/*Secara konsep hampir mirip dengan extension function
* bedanya di sini reciver digunakan untuk menentukan tipe deklarasi
* */

fun buildString(action: StringBuilder.()->Unit): String{
    val stringBuilder= StringBuilder()
    stringBuilder.action()
    return stringBuilder.toString()

    /*disini kita buat callback function dimana action sebagai method reciver
    * yang akan menjalankan ketika parameter dimasukan*/
}
fun main() {
    val message = buildString {
        append("Hallo")
        append(12)
    }
        println(message)
}