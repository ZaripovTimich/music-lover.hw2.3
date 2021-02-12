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
        }

        when (lastBuy) {
            in 0.0..1000.0 -> lastBuy = buy - sale
            in 1001.0..10000.0 -> lastBuy = (buy - 100.0) - sale
            else -> lastBuy = (buy - buy * 0.05) - sale
        }

        println("Сумма покупки $lastBuy руб")

        regularClient = buy != 0.0
    }
}