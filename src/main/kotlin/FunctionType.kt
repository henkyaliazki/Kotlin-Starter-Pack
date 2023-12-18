/*seperti namanya bahwa dengan function type kita bisa buat function menjadi tipe data
* contoh (int,int)->{string}
* penjelasan function tersebut mempunyai 2 paramether yt int dan mengembalikan nilai string
* nilai return jika tidak mau ditentukan di awal maka dengan menggunakan Unit
* (int,int)->{} ini contoh penggunaan unit */

typealias aritmatika = (Int,Int)-> Int
/*typealias digunakan untuk membuat fungsi yang tipe datanya sama,
* biasanya digunakan ketika function panjang alurnya*/
fun main() {
    val sum: aritmatika ={valueA,valueB -> valueA + valueB}
    val multyply : aritmatika={valueC,valueD-> valueC * valueD - valueC + valueD}

    val sumResult =sum(10,10)
    println(sumResult)
    val multyplyResult= multyply(10,20)
    println(multyplyResult)

//    lamda expresion
    printMessage("Hallo saya lamda expresion")

    printResult(10){
        value-> value * value
    }

}

/*lamda expresion ini adalah shorthand dari kotlin untuk sebuah function
* lamda dapat digunakan sebagai parameter untuk function dan secara default
* ia langsung mengembalikan nilai tanpa adanya return */

//lamda sytax
val printMessage = { message : String -> println(message) }

/*lamda dan penetapan hight-order function*/
/*PENTING !!
* Penggunanan hight-order function memakan banyak proses di belakang layar
* jadi jika banyak kode akan mempengaruhi kinerja program, jika begitu
* maka gunakanlah inlin function namun ia juga memerlukan banyak ruang di memori
* gunakan lah dengan bijak*/

fun printResult(value: Int, sum2:(Int)->Int){
    val result =sum2(value)
    println(result)
}

