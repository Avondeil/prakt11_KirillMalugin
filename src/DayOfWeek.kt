enum class DayOfWeek {
    Понедельник, Вторник, Среда, Четверг, Пятница, Суббота, Воскресенье;
}
fun printDayOfWeek(day: DayOfWeek): String {
    return when (day) {
        DayOfWeek.Понедельник -> "Понедельник"
        DayOfWeek.Вторник -> "Вторник"
        DayOfWeek.Среда -> "Среда"
        DayOfWeek.Четверг -> "Четверг"
        DayOfWeek.Пятница -> "Пятница"
        DayOfWeek.Суббота -> "Суббота"
        DayOfWeek.Воскресенье-> "Воскресенье"
    }
}
fun printNumDay(day: DayOfWeek): Int {
    return when (day) {
        DayOfWeek.Понедельник -> 1
        DayOfWeek.Вторник -> 2
        DayOfWeek.Среда -> 3
        DayOfWeek.Четверг -> 4
        DayOfWeek.Пятница-> 5
        DayOfWeek.Суббота -> 6
        DayOfWeek.Воскресенье-> 7
    }
}
fun Weekend(day: DayOfWeek): String {
    return if (day == DayOfWeek.Суббота || day == DayOfWeek.Воскресенье)  "выходной"
    else "будний день"
}
fun Abbreviation(day: DayOfWeek): String {
    return when (day) {
        DayOfWeek.Понедельник -> "Пон."
        DayOfWeek.Вторник -> "Вт."
        DayOfWeek.Среда -> "Ср."
        DayOfWeek.Четверг -> "Чет."
        DayOfWeek.Пятница -> "Пят."
        DayOfWeek.Суббота-> "Суб."
        DayOfWeek.Воскресенье-> "Вос."
    }
}