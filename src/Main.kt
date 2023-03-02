fun main() {
    try {
        print("Введите день недели: ")
        val day = readLine()!!.toString()
        val imDay = DayOfWeek.valueOf(day)
        println("${printDayOfWeek(imDay)} (${Abbreviation(imDay)}) - ${Weekend(imDay)}. Номер дня недели: ${printNumDay(imDay)}")
        println()
        print("Введите цвет: ")
        val color = readLine()!!.toString()
        val imColor = Color.valueOf(color)
        println("${printColor(imColor)} (${getColorCode(imColor)}): ${ColorRainbow(imColor)}. Цвет дня недели: ${ColorDay(imColor)}")
    }
    catch (e: Exception){
        println("Недопустимые данные")
    }
}