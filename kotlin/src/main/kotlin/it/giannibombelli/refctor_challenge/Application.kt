package it.giannibombelli.refctor_challenge

private val divisorAndWords = listOf(
    DivisorAndWord(3, "Fizz"),
    DivisorAndWord(5, "Buzz")
)

fun main(args: Array<String>) {
    val fizzBuzz = FizzBuzz(divisorAndWords)
    for (number in 1..100) {
        val say = fizzBuzz.say(number)
        println(say)
    }
}
