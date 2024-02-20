fun main() {
    val purchaseAmount = 15000.0
    val isRegularCustomer = true
    val finalPrice = calculateFinalPrice(purchaseAmount, isRegularCustomer)
    println("Итоговая стоимость покупки: ${String.format("%.2f", finalPrice)} рублей")
}

fun calculateFinalPrice(amount: Double, isRegularCustomer: Boolean): Double {
    val discountAmount = when {
        amount in 1_001.0..10_000.0 -> 100.0
        amount > 10_000.0 -> amount * 0.05
        else -> 0.0
    }

    var finalPrice = amount - discountAmount

    if (isRegularCustomer) {
        finalPrice -= finalPrice * 0.01
    }

    return finalPrice
}
