package lesson_2



fun main() {
    val employees = IntArray(50){30000}
    val trainees = IntArray(30){20000}
    val personal = employees + trainees
    val sumEmployees = employees.reduce {acc, employee -> acc + employee}
    val sumPersonal = personal.reduce {acc, person -> acc + person}
    var averagePayment = sumPersonal.toDouble() / personal.size

    println("Расходы на выплату зарплаты постоянных сотрудников: $sumEmployees")
    println("Общие расходы по ЗП после прихода стажеров: $sumPersonal")
    println("Средняя ЗП одного сотрудника после устройства стажеров: %.2f".format(averagePayment))
}