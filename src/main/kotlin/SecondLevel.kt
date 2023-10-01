class SecondLevel {
    fun isNaturalNumber(number: Int): Boolean {
        if (number < 0)
            return false

        if (number == 0)
            return true

        return isNaturalNumber(number - 1)
    }
}