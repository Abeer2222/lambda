import java.lang.Exception
import kotlin.random.Random

data class Player(val name: String, val age: Int, val height: Double)

fun main() {
    // Lambda
    val greeting = { println("Hello -> Lambda") }
    greeting()
    // Function
    fun greetingFun() {
        println("Hello")
    }
    greetingFun()

    // Lambda
    val personalGreeting = { name: String -> println("Hello $name ->Lambda") }//parameters
    personalGreeting("Abeer")
    // Function
    fun personalGreetingFun(name: String) {
        println("Hello $name")
    }
    personalGreetingFun("Abeer")

    // Lambda
    val returnSub = { a: Int, b: Int -> a - b }
    println(returnSub(4, 5))

    // Function
    fun returnSubFun(a: Int, b: Int): Int {
        return a + b
    }
    println(returnSubFun(4, 5))


    val players = arrayListOf<Player>()
   // players.add(Player("Abeer", 23, 161.0))
    for (i in 1 until 20) {
        val randomAge = Random.nextInt(18, 60)
        val randomTall = String.format("%1.1f", Random.nextDouble(120.0, 180.0)).toDouble()
        players.add(Player("player$i", randomAge, randomTall))
    }
    // Lambda
    val lambdaPlayers = {sortedPlayers : ArrayList<Player> ->
        sortedPlayers.sortBy { it.height }
        sortedPlayers.filter { it.name == "player1" }
    }
    println("${lambdaPlayers(players)}\n")
    println("Sorting a List of Players :")
    for (i in players)
        println(i)
    println("\n")
    // Function
    fun playerFun(list : ArrayList<Player>): List<Player>{
        list.sortBy { it.name }
        println("${list.filter { it.name == "player5" }}\n")
        return list
    }
    playerFun(players)
    for (i in players)
        println(i)

}
