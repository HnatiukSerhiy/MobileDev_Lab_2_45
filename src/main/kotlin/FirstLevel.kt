import kotlin.math.pow

class FirstLevel {
    fun findSumOfCubes(numbers: Array<Double>): Double {
        numbers.sort()
        val firstIndex = numbers.size - 5
        val lastIndex = numbers.size - 1

        val lastFiveNumbers = numbers.slice(firstIndex..lastIndex)

        var sum: Double = 0.0
        for (num in lastFiveNumbers)
            sum += num.pow(3.0)

        return sum
    }
}