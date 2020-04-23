const val MAX_EXPERIENCE: Int = 5000
const val TAVERNS_NAME = "Unicorn's Horn"
fun main(args: Array<String>) {
    val playerName = "Estragon"
    var hasSteed = false
    var experiencePoint = 5
    var menu = listOf<String>("Wine", "Beer", "Honey")
    var playerCoins = 50
    experiencePoint += 5
    println(experiencePoint)
    println(playerName)
    println(playerName.reversed())
    for (item in menu){
        println(item)
    }
}