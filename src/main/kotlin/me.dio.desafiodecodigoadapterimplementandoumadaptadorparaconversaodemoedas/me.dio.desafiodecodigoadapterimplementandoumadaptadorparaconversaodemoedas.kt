// Desafio de Código: Adapter
// Implementando um Adaptador para Conversão de Moedas
// https://web.dio.me/coding/desafio-de-codigo-implementando-um-adaptador-para-conversao-de-moedas/algorithm/implementando-um-adaptador-para-conversao-de-moedas?back=/track/desenvolvimento-backend-com-kotlin&tab=undefined&moduleId=undefined


// Antiga classe de conversão que só suporta a conversão de USD para GBP
class OldCurrencyConverter {
    fun convertUSDtoGBP(amount: Double): Double {
        return amount * 0.80 // 80% do valor em USD
    }
}

// Novo adaptador que usa a antiga conversão e aplica a taxa adicional de GBP para EUR
class CurrencyAdapter(private val oldConverter: OldCurrencyConverter) {
    private val usdToGBP = 0.80
    private val gbpToEUR = 1.0625

    fun convertUSDtoEUR(amount: Double): Double {
        val amountInGBP = oldConverter.convertUSDtoGBP(amount)
        return amountInGBP * gbpToEUR
    }
}

fun main() {
    val input = readLine()?.toDoubleOrNull() ?: return
    val oldConverter = OldCurrencyConverter()
    val adapter = CurrencyAdapter(oldConverter)

    val amountInEUR = adapter.convertUSDtoEUR(input)

    println("USD: $input")
    println("EUR: $amountInEUR")
}
