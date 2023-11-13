/*
* Destructuring Declarasion adalah dimana sebuah statment yang berada pada data class
* kita buat menjadi sebuah variabel sendiiri
* */
data class Destructuring(val name: String, val age: Int)
// atau kita bisa menambahkan behaviour untuk data class itu sendiri
data class  DataName (val nama:String,val hobby: String){
    fun introduce(){
    println("my name is $nama,and hobby i is $hobby")
    }

}

fun main() {
    val dataUser = Destructuring("ali",23)
    val (name,age) = dataUser
    println(name)
    val dataName = DataName("agus","bola-sepak")
    val(nama,hobby) = dataName
    dataName.introduce()
}