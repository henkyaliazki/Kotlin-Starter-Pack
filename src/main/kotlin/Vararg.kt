/*
* Vararg digunakan untuk menjalankan argument dengan nilai yang
* tidak di tentukan di awal
* */

/*ATURAN PENTING
* 1.Dalam penggunaan vararg tidak diperbolehkan mempunyai dua dalam satu function
* contohnya fun sumNumber(vararg number: Int,vararg string: String)
* 2.jika memiliki dua argument dan memiliki vararg maka vararg ditempatkan diakhir
* contoh fun set(name: String, vararg number: Int)
* 3.jika tetap ingin vararg di posisi pertama maka gunakan named argument untuk
* yang bukan vararg pada saat di panggil*/




fun main() {
    fun sumNumber(vararg number: Int): Int {
        return number.sum()
        /*
        * disini kita buat function sumNumber dimana argument menggunakan vararg
        * dan mmemiliki kembalian dengan type data Int
        * function ini menggunakan library sum() untuk menjumlahkan sebetulnya banyak library
        * lain kalian bisa cari di documentasi resmi */
    }

    val number = sumNumber(10, 2, 3, 10)
    println(number)
    /*
    * memangil function sumNumber dan menempatkannya pada variabel number
    * nah yang di maksud jumlah argument yg tidak ditentukan di sumNumber
    * kita bisa memasukan sebanyak apapun argument tersebut*/

    /*menetapkan generic untuk tipe paramether juga bisa dengan vararg*/
    fun <T> asList(vararg input: T): List<T> {
        val result = ArrayList<T>()
        for (item in input)
            result.add(item)
        return result
        /*disini kita buat sebuah list dengan argument input kita tau list bisa
        *menerima beberapa type data variable result sebagai penampung hasil input
        * dimana didapatkan dari iterasi item as input lalu di parshing ke result
        * */
    }

    val listAs = asList("aku", true, 23)
    println(listAs)
    /*memanggil function yang berisi list lalu memasukan input argument
    * setelah selesai kita print hasil input tersebut*/

    //Vararg VS Array<T>
    /**/
    fun set(number: Array<Int>): List<Int> {
        return number.toList()
    }
    /*disini telihat bedannya dimana ketika function array dii panggil
    * dia membutuhkan sebuah arguments array sedangkan vararg tidak */
    val sets = arrayOf(20, 10, 10)
    println(set(sets))

    /*lalu apakah bisa memasukan nilai yang sudah bentuk array dalam vararg ?
    * bisa dong*/
    fun insertArray(vararg number: Int): List<Int> {
        return number.toList()
    }
//  menggunakan *(nama array) lebih dikenal dengan spread operator
    val array = intArrayOf(20, 10, 30)
    val addArray =insertArray(10, 20, *array, 10)
    println(addArray)

}


