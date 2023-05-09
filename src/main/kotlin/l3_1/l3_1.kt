package l3_1

fun main(){
    println("Введите время в формате 24 часов: ")
    val userTime = readLine()!!.toInt()

    if (userTime < DAY_TIME ){
        println("Добрый день Пользователь")
    }
    if (userTime >= DAY_TIME){
        println("Добрый вечер Пользователь")
    }
}
const val DAY_TIME = 15