fun main(args: Array<String>) {
    var amount: Double = 11000.0
    var regularClient: Boolean = true
    var result: Double
    val firstsale: Double = 100.0
    val secondsale: Double = 0.95
    val onesale: Double = 0.99

    if (amount < 1000) {
        println("Итоговая сумма : " + amount)
        result = amount
    } else if (amount >= 1000 && amount <= 10_000) {
        result = (amount - firstsale)
        println("После применения скидки : " + result)
    } else {
        result = amount * secondsale
        println("После применения 5% скидки : " + result )
    }

    if (regularClient == true) {
        result *= onesale
        println("После применения 1% скидки : " + result)
    }
}