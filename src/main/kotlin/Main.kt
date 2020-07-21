fun main() {
    while (true) {
        println("Введите ваш город:")
        val name = readLine()
        if (name.isNullOrEmpty())
            throw error("Город введен неверно, попробуйте снова")
        println("Введите температуру за окном:")
        val temp = readLine()?.toDoubleOrNull() ?: throw error("Температура введена неверно, попробуйте снова")

        val city = City(name, temp)
        println("В городе ${city.name} сейчас ${city.temp} градусов")
        printTemp(city.temp)

        println("Для нового ввода нажмите 1 или любую клавишу для выхода")
        val res = readLine().toString()
        if (!(res?.equals("1")!!)) {
            return
        }
    }
}

fun printTemp(temp: Double)
{
    when (temp)
    {
        in -50.0..15.0 -> println("На улице дубак")
        in +15.0..+25.0 -> println("На улице нормальная температура")
        in +20.0..+50.0 -> println("На улице жара")
        else -> println("В городе катастрофа!")
    }
}
