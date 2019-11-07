fun main(args: Array<String>) {
    runSimulation()
}
inline fun runSimulation(){
    val greetingFunction = configureGreetingFunction()
    println(greetingFunction("Guyal"))
}
fun printConstructionCost (numBuildings: Int){
    val cost = 500
    println("construction costs: ${cost * numBuildings}")
}
fun configureGreetingFunction(): (String) -> String{
    val structureType = "hospital"
    var numBuildings = 5
    return {playerName: String ->
        val currentYear = 2019
        numBuildings +=1
        println("Adding $numBuildings $structureType")
        "Welcome to SimVillage, $playerName! Copyright($currentYear)"
    }
}