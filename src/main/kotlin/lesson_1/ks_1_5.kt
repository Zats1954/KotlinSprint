package  lesson_1


fun main() {
    val allSeconds: Short = 6480
    val minutes: Short
    val hours: Short
    val seconds: Short

    hours = (allSeconds/3600).toShort()
        .also{minutes=((allSeconds - it*3600)/60).toShort()
            .also{it1 -> seconds = (allSeconds - it*3600 - it1*60).toShort()}}
    println( "%02d".format(hours) + ":" + "%02d".format(minutes) + ":" +"%02d".format(seconds))

}