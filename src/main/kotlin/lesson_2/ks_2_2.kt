package lesson_2

fun main() {
    val employees = 50
    val employeeSalary = 30000
    val trainees =  30
    val traineeSalary =  20000

    val personal = employees + trainees
    val sumEmployees = employees * employeeSalary
    val sumTrainees = trainees * traineeSalary
    val sumPersonal = sumEmployees + sumTrainees
    val averagePayment = sumPersonal.toDouble() / personal

    println("Расходы на выплату зарплаты постоянных сотрудников: %d".format(sumEmployees))
    println("Общие расходы по ЗП после прихода стажеров: %d".format(sumPersonal))
    println("Средняя ЗП одного сотрудника после устройства стажеров: %d".format(averagePayment.toInt()))
}