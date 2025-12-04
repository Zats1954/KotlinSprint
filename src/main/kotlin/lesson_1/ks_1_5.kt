package  lesson_1

const val ALL_SECONDS: Short = 6480
fun main() {
    
    val hours = (ALL_SECONDS / 3600).toShort()
    val minutes = ((ALL_SECONDS - hours * 3600) / 60).toShort()
    val seconds = (ALL_SECONDS - hours * 3600 - minutes * 60).toShort()

    println( "%02d:%02d:%02d".format(hours,minutes,seconds))
}