/*
* List merupakan bagian dari Collection dimana Collection sendiri memiliki beberapa object
* turunan yaitu List,Set,Map
* List merupakan tempat menyimpan banyak tipe data sekaligus
* atau di bahasa lain namanya adalah array, namun untuk indeks disini
* dimulai dari angka 1 bukan 0
* */

//cara pertama  membuat list dengan tipe data Int
val numberList : List<Int> = listOf(1,2,3,4,7,5,6)

/* karena kompailer secara default mengerti tipe data yang kita tulis
* maka kita tidak perlu menuliskannya secara eksplisit
* agar menjadi seperti ini
* */
val numList = listOf(1,2,3,4,7)

//menyimpan banyak tipe data bahkan dengan data class di dalamnya
val anyList = listOf(1,"aku",true,DataUser("Budi",22))

/*
* Secara default list bersifat imutable atau tidak bisa di manipulasi
* namun di library kotlin terdapat fungsi yang merubah imutable menjadi mutable
* yaitu mutableListOf
* */
val list = mutableListOf(1,"aku",'c',false,DataName("aku","bola"))
fun tampilList(){
    println("ini list sebelum di ubah: $list")
}
fun main() {
    tampilList()
    //cara mengakses list dengan indeks
    println(anyList[3])
    //cara memanipulasi list
    list.add("saya") //menambah di akhir indeks
    list.add(1,'a') // menambah di indeks ke-1
    list[4]= true //mengubah nilai indeks ke-3
    list.removeAt(0) //menghapus indeks ke-0

    println("ini setelash list di ubah: $list")


}