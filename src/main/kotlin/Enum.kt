import data.Color

fun main() {
    val colorRed = Color.RED
    val colorGreen = Color.GREEN
    val colorWhite = Color.WHITE

    val getAllColor: List<Color> = Color.entries.toTypedArray().toList()

    val redFromColorRed = Color.valueOf("RED")
    val greenFromColorGreen = Color.valueOf("GREEN")

    println(colorRed)
    println(colorGreen)
    println(colorWhite)
    println(getAllColor)
    println(redFromColorRed)
    println(greenFromColorGreen)
}