import java.util.*

fun main() {

    var lastBuy = 1001.0
    var scanner = Scanner(System.`in`)
    var regularClient = false
    var sale = 0.0

    while (true) {
        println("Введи сумму покупки или напиши -1 для выхода")
        var buy = scanner.nextDouble()
        if (regularClient == true) {
            sale = buy * 0.01
        }
        if (buy == -1.0) {

            break
        } else if (lastBuy <= 1000.0) {

            lastBuy = buy - sale
            println(
                "Скидки нет\n" +
                        "Сумма покупки составила: $lastBuy руб"
            )
        } else if ((lastBuy > 1000.0) && (lastBuy <= 10000.0)) {

            lastBuy = (buy - 100.0) - sale
            println(
                "Скидка 100руб\n" +
                        "Сумма покупки составила: $lastBuy руб"
            )
        } else if (lastBuy > 10000.0) {

            lastBuy = (buy - buy * 0.05) - sale
            println(
                "Скидка 5% от суммы покупки\n" +
                        "Сумма покупки составила: $lastBuy"
            )
        }

        if (buy != 0.0) {
            regularClient = true
        } else {
            regularClient = false
        }
    }
}