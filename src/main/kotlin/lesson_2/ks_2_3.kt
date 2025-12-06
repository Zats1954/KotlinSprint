package lesson_2

const val TIME_DIVIDER = 60
const val DAY_DIVIDER = 24

fun main() {
    val timeDeparture = "9:39"
    val timeTravel = 457

    val timeArrive = timeDeparture.split(":")
        .let{it[0].toInt() * TIME_DIVIDER + it[1].toInt() + timeTravel}

    var hourArrive = timeArrive / TIME_DIVIDER
    if(hourArrive > DAY_DIVIDER) hourArrive %= DAY_DIVIDER

    val minuteArrive = timeArrive % TIME_DIVIDER

    println("Час и минута прибытия поезда %02d:%02d".format(hourArrive,minuteArrive))
}