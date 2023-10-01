class ThirdLevel {
    fun getAngleInRadiansAsString(number: Int): String {
        return getNumberAsString(number) + " радіан."
    }

    private fun getNumberAsString(number: Int): String {
        val units = arrayOf("", "один", "два", "три", "чотири", "п'ять", "шість", "сім", "вісім", "дев'ять")
        val teens = arrayOf("десять", "одинадцять", "дванадцять", "тринадцять", "чотирнадцять", "п'ятнадцять", "шістнадцять", "сімнадцять", "вісімнадцять", "дев'ятнадцять")
        val tens = arrayOf("", "", "двадцять", "тридцять", "сорок", "п'ятдесят", "шістдесят", "сімдесят", "вісімдесят", "дев'яносто")
        val hundreds = arrayOf("", "сто", "двісті", "триста", "чотириста", "п'ятсот", "шістсот", "сімсот", "вісімсот", "дев'ятсот")

        if (number == 0)
            return "Нуль"

        return when {
            number < 10 -> units[number]
            number < 20 -> teens[number - 10]
            number < 100 ->
                tens[number / 10] +
                        if (number % 10 != 0) " " + units[number % 10]
                        else ""
            number < 1000 ->
                hundreds[number / 100 ] +
                        if (number % 100 != 0) " " + getNumberAsString(number % 100)
                        else ""
            else -> throw Error("Не вдалось конвертувати число в рядок.")
        }
    }
}