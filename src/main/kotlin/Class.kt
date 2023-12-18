/*Class digunakan untuk membuat sebuah parent untuk turunannya
* keyword deklarasinya cukup dengan class*/

class Car(
    val merk: String,
    val type: String,
    val Speed: Int,
) {
    fun drive() {
        println("${merk} woosssh")
    }

    fun stop() {
        println("Ciitttt")
    }
}
/*disini kita mempunyai class car dimana mempunya properties
* (merk,type,speed) dan juga nilai dari type datanya
* car memiliki fungsi drive dan stop ini bisa kita akses ketika instance dari class
* di inisialisasikan*/



fun main() {
    val car = Car("Honda","Brio",1500)
    println("Merk ${car.merk} type ${car.type} speedMax ${car.Speed}")
    car.drive()
    car.stop()
}


