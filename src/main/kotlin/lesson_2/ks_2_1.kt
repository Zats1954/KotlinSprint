package lesson_2

import kotlin.random.Random

fun main() {
    val pupilsMark = arrayOfNulls<Int>(4)
    for (index in pupilsMark.indices){pupilsMark[index] =  Random.nextInt(3,5) }
    var sum = 0
    for (pupilMark  in pupilsMark) { sum += pupilMark!!}
    val avr = sum.toDouble() / pupilsMark.size
    println("средняя оценка :" +"%.02f".format(avr))

}