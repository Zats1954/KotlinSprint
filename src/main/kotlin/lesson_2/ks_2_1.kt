package lesson_2

fun main() {
    val pupilsMark =  intArrayOf(3,4,3,5)
    var sum = 0
    for (pupilMark  in pupilsMark) { sum += pupilMark}
    val averageMark = sum.toDouble() / pupilsMark.size
    println("средняя оценка: %.2f".format(averageMark))

}