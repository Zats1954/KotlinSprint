package lesson_2



fun main() {
    val employees = IntArray(50){i -> 30000}
    val trainees = IntArray(30){i -> 20000}
    val personal = employees + trainees
    val sumEmployees = employees.reduce {acc, employee -> acc + employee}
    val sumPersonal = personal.reduce {acc, person -> acc + person}
    var averagePayment = sumPersonal.toDouble() / personal.size

    println("Расходы на выплату зарплаты постоянных сотрудников: $sumEmployees")
    println("Общие расходы по ЗП после прихода стажеров: $sumPersonal")
    println("Средняя ЗП одного сотрудника после устройства стажеров: %.02f".format(averagePayment))
}