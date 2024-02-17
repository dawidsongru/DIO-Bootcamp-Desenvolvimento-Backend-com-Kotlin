// Tipos de Funções Higher Order Functions Returning (Retorno de funções de ordem superior)

package me.dio.tiposdefuncoeshigherorderfunctionsreturning

fun operation(): (Int) -> Int {                                     // 1 função operation que retorna uma outra função, recebe um inteiro e retorna um inteiro.
    return ::square                                                 // :: aciona uma outra função pelo nome
}

fun square(x: Int) = x * x                                          // 2 função square recebe x e multiplica x por ele mesmo. Eleva o número ao quadrado.

fun main() {
    val func = operation()                                          // 3 instancia a função de operation...
    println(func(2))                                                // 4 ... e chama ela passando como parâmetro um número
}
