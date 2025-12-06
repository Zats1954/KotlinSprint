package lesson_2

const val BUFF = 0.2
fun main(){
    val ironOre = 7
    val crystallOre = 11

    val ironBuff = (ironOre * BUFF).toInt()
    val crystallBuff = (crystallOre * BUFF).toInt()

    println("бонус кристаллической руды %d\nбонус железной руды %d".format(ironBuff, crystallBuff))
}