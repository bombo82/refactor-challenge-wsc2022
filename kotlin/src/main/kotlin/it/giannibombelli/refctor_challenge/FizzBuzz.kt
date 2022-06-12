package it.giannibombelli.refctor_challenge

class FizzBuzz(private val divisorAndWords: List<DivisorAndWord>) : FizzBuzzInterface {

    override fun say(number: Int): String {
        var result = ""
        for (divisorAndWord in divisorAndWords) {
            result += divisorAndWord.getWordOrEmpty(number)
        }

        if (result !== "") {
            return result
        }

        return number.toString()
    }
}
