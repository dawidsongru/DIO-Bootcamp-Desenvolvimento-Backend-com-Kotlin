// Tipos de Funções Operator Functions

package me.dio.tiposdefuncoesoperatorfunctions

fun main() {
                                                                            
    operator fun Int.times(str: String) = str.repeat(this)                  // 1 operation functions para a função times (quantidade de vezes). Essa é uma evolução
    println(2 * "Bye ")                                                     // 2 operador times é igual ao operador matemático * (multiplicação). 2 * Bye. Une um Int 2 com uma String Bye

    operator fun String.get(range: IntRange) = substring(range)             // 3 Operation function do tipo get, espera uma range completa para fazer uma substring mais curta...
    val str = "Always forgive your enemies; nothing annoys them so much."
    println(str[0..14])                                                     // 4 ... imprime do índice 0 até o 14 (imprimindo os 14 primeiros, que neste caso também inclui o espaço)
  
  }
