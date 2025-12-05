package  lesson_1

const val ALL_SECONDS: Short = 6480
const val TIME_DIVIDER: Short = 60
fun main() {

    val hours = ALL_SECONDS / TIME_DIVIDER / TIME_DIVIDER
    val minutes = (ALL_SECONDS - hours * TIME_DIVIDER * TIME_DIVIDER) / TIME_DIVIDER
    val seconds = ALL_SECONDS - (hours * TIME_DIVIDER + minutes) * TIME_DIVIDER

    println( "%02d:%02d:%02d".format(hours,minutes,seconds))
}