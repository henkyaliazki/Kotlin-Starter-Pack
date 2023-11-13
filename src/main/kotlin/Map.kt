/*
* !! PENTING
* Menggunakan mutable pada Collection sangat tidak disarankan,jadi
* gunakanlah ketika tidak ada cara lain
* */

/*
* Map adlah tipe data yang memiliki key-value mirip dengan object jika di bahasa lain
* */
val capital = mapOf(
    "Sby" to "Jatim",
    "Smg" to "Jateng",
    "Bdg" to "Jabar"
)
/*
* Sebelum to adalah key ,setelah to adalah value
* untuk mengakses value kita membutuhkan key
* */
fun accessKeyMap(){
    println(capital["Sby"])
}

fun main() {
    accessKeyMap()
    //cara lain dengan getValue
    println(capital.getValue("Sby"))

    //untuk mendapatkan keys dari map dengan cara
    val mapKeys = capital.keys
    println("ini cara mengakses keys:  $mapKeys")
    val mapValues = capital.values
    println("ini cara mengakses values:  $mapValues")

    /*Untuk menambah keys-value kita harus buat map menjadi mutable dengan
    * cara  seperti berikut
    * */
    val  mutableCapital = capital.toMutableMap()
    mutableCapital["Pdg"] = "Sumbar"
    println(mutableCapital)
}
