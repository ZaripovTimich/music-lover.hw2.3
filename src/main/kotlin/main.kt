import java.util.*

fun main() {

    val lastBuy = 1001
    val scanner = Scanner(System.`in`)
    var regularClient = false
    val sale = 0

    while (true) {
        println("Введи сумму покупки или напиши -1 для выхода")
        val buy = scanner.nextInt()
        if (regularClient == true) {
            val sale = buy * 0.01
        }
        if (buy == -1) {
            break
        } else if (lastBuy <= 1000) {
            val lastBuy = buy - sale
            println("Скидки нет\n" +
                    "Сумма покупки составила: ${lastBuy} руб")
        } else if ((lastBuy > 1000) && (lastBuy <= 10000)) {
            val lastBuy = (buy - 100) - sale
            println("Скидка 100руб\n" +
                    "Сумма покупки составила: ${lastBuy} руб")
        } else if (lastBuy > 10000) {
            val lastBuy = (buy - buy * 0.05) - sale
            println("Скидка 5% от суммы покупки\n" +
                    "Сумма покупки составила: ${lastBuy}")
        }

        if (buy != 0) {
            regularClient = true
        } else {
            regularClient = false
        }
    }
}