/*Nullable Receiver digunakan ketika sebuah object bernilai null
* kita bisa menggunakan elvis operator untuk memberikan nilai
* default pada object yang bernilai null*/

val Int?.potong: Int
    get() = this?.div(2)?:1
/*disini kita buat exstenssion potong dan kita dapatkan nilainya
* jika bernilai null maka tampilkan 1*/

fun String?.cutString(stringSize: Int): List<String>{
    return  this?.chunked(stringSize)?: emptyList()

}
fun main() {
    val value : Int? = null
    println(value.potong)

    val exampleString : String? = "kosong"
    val result = exampleString.cutString(2)
    println(result)
}