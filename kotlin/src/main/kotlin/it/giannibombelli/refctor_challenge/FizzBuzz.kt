package it.giannibombelli.refctor_challenge

class FizzBuzz : FizzBuzzInterface {
    override fun say(number: Int): String {
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz"
        }
        if (number % 3 == 0) {
            return "Fizz"
        }
        if (number % 5 == 0) {
            return "Buzz"
        }

        return number.toString()
    }
}
