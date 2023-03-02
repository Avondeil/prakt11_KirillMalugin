enum class Color() {
    Красный, Ораньжевый, Желтый, Зеленый, Синий, Фиолетовый,Розовый ;
}
fun printColor(color: Color): String {
    return when (color) {
        Color.Красный -> "Красный"
        Color.Ораньжевый -> "Ораньжевый"
        Color.Желтый -> "Желтый"
        Color.Зеленый -> "Зеленый"
        Color.Синий -> "Синий"
        Color.Фиолетовый -> "Фиолетовый"
        Color.Розовый -> "Розовый"
    }
}

fun getColorCode(color: Color): String {
    return when (color) {
        Color.Красный -> "ff0000"
        Color.Ораньжевый -> "ffa500"
        Color.Желтый-> "ffff00"
        Color.Зеленый-> "008000"
        Color.Синий -> "0000ff"
        Color.Фиолетовый -> "8b00ff"
        Color.Розовый -> "ffc0cb"
    }
}
fun ColorRainbow(color: Color): String {
    return if (color == Color.Красный || color == Color.Ораньжевый || color == Color.Желтый
        || color == Color.Зеленый || color == Color.Синий || color == Color.Фиолетовый)
        "является цветом радуги"
    else
        "не является цветом радуги"
}

fun ColorDay(color:Color):String
{
    return when (color) {
        Color.Красный -> "Понедельник"
        Color.Ораньжевый -> "Вторник"
        Color.Желтый-> "Среда"
        Color.Зеленый-> "Четверг"
        Color.Синий -> "Пятница"
        Color.Фиолетовый -> "Суббота"
        Color.Розовый -> "Воскресенье"
    }
}