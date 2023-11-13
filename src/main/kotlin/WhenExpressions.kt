import kotlin.random.Random

fun main() {
    val nilai = 'B'

    val stringOfNilai = when (nilai) {
        'A' -> "Nilai anda 90-98"
        'B' -> "Nilai anda 80- 89"
        'C' -> "Nilai anda 70-79"
        else -> "Nilai anda tidak cukup"
    }
    println(stringOfNilai)

    /*
    memeriksa instance menggunakan is
     */
    val anyType: Any = 100L

    val typeOfAnyType = when (anyType) {
        is Long -> "Value is long type"
        !is String -> "The value is string type"
        else -> "undifined"
    }

    println(typeOfAnyType)

    /*
        memeriksa range dan collection dengan when
    */
    val value = 26
    val ranges = 10..50
    when (value) {
        in ranges -> println(
            "value is in the range"
        )

        !in ranges -> println(
            "value is outside the range"
        )
    }
    /*
    * sejak kotlin 1.3 when expresion dapat menangkap subjectt yang berada
    * di variabel yang berbeda
    */

    val registerNumber = when(val regis = getRegisterNumber()){
        in 1..50 -> println(50 * regis)
        in 50..100 -> println(100 * regis)
        else -> println(regis)
    }

}
fun getRegisterNumber()= Random.nextInt(100)
