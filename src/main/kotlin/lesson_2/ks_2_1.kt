package lesson_2

fun main() {
    val pupilsMark = intArrayOf(3,4,3,5)
    val sumMarks = pupilsMark.sum()
    val averageMark = sumMarks.toDouble() / pupilsMark.size
    println("средняя оценка: %.2f".format(averageMark))
}