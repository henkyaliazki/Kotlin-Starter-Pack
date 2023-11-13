class User(val name: String, val age: Int) {
// untuk mendapatkan nilai dari clas User diperlukan toString()

    override fun toString(): String {
        return "User(name=$name,age$age)"
    }
}
/*
*data class sendiri secara otomatis memiliki method toString()
*/

data class DataUser(val names: String, val age: Int)

fun main() {
    val user = User("bud", 21)
    val dataUser = DataUser("ages", 22)
    val dataUser2 = DataUser("aris", 23)
    /*
    * cara menyalin data class pada dataUser cukup mudah dengan
    * menggunakan method copy() untuk data yang mau kita salin*/

    val dataUser3 = dataUser.copy()
// kita menyalin dataUser ke dalam variabel dataUser3

    /*jika kita ingin mengubah isi nilai property juga bisa dengan copy()
    * diikuti nilai apa yang akan kita ubah
    *
    * */
    val dataUser4 = dataUser.copy(age= 19)

    println(user)
    println(dataUser)
    println(dataUser2)
    println(dataUser3)
    println(dataUser4)
}
