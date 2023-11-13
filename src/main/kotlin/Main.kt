fun setUser(name:String,age:Int): String {
    return "my name is $name, my age $age"
}
fun setName(name:String,age: Int)= "Name is $name, age $age"

val intArr = intArrayOf(1,2,3)
fun main(args: Array<String>) {
    val user = setUser("ali",21)
    val name = setName("agus",22)
//    array in kotlin
    val array = intArrayOf(1,2,3,4)
    println(message = intArr.toList())
    println(user)
    println(name)
    println(array.toList())

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

}
