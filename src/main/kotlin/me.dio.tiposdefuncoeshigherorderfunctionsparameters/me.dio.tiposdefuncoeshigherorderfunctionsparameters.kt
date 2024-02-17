// Tipos de Funções Higher-Order Functions Parameters (Parâmetros de Funções de Ordem Superior)

package me.dio.tiposdefuncoeshigherorderfunctionsparameters

fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {  // 1 função calculate recebe x e y Int. operação que recebe declaração de função: (Int, Int) -> Int
    return operation(x, y)                                          // 2 vai receber as inormações de x e y que está recebendo acima.
}

fun sum(x: Int, y: Int) = x + y                                     // 3 função normal de soma

fun main() {
    val sumResult = calculate(4, 5, ::sum)                          // 4 calcula a soma de 4 e 5. chamada direta
    val mulResult = calculate(4, 5) { a, b -> a * b }               // 5 passado uma função lambda para determinar a multiplicação de dois valores.
    println("sumResult $sumResult, mulResult $mulResult")           //   expressão lambda: usar uma função como argumento numa chamada à outra função.
}
