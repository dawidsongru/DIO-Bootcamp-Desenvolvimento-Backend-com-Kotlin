// When Statement
// Instead of the widely used switch statement, Kotlin provides the more flexible and clear when construction.
// It can be used either as a statement or as an expression.
// Em vez da instrução switch amplamente usada, o Kotlin fornece uma forma mais flexível e clara durante a construção.
// Pode ser usado como uma declaração ou como uma expressão.

package me.dio.whenstatement

fun main() {                                    // 1 Temos uma função main...
    cases("Hello")                              // Feito uma cadeia de chamadas
    cases(1)                                    //   "    "     "    "    "
    cases(0L)                                   //   "    "     "    "    "      como "Long"
    cases(MyClass())                            //   "    "     "    "    "      // Passa uma instância de MyClass
    cases("hello")                              //   "    "     "    "    "      // hello com h minúsculo, cai no else 10 ...
}

fun cases(obj: Any) {                           // 2 ...onde chamamos outra função chamada cases...     4 ...que está tipado como Any, que pode receber qualquer coisa
    when (obj) {                                // 3 ...onde temos um objeto (obj) que está sendo recebido como parâmetro... 5 ...fazendo uma estrutura de When que...
        1 -> println("One")                     // 6 ... se for igual a 1 vai imprimir One...
        "Hello" -> println("Gretting")          // 7 ... se for igual a Hello, imprimir Gretting...
        is Long -> println("Long")              // 8 ... se for do tipo Long, imprimir Long...
        !is String -> println("Not a string")   // 9 ... se não or String, imprimir Not a string...
        else -> println("Unknown")              // 10 ... caso contrário, imprimir Unknown (não sei)
    }                                           // Mistura Switch Case com estrutura de IF / ELSE.
}                                               // Faz comparações de igualdade de maneira reduzida
                                                // Faz verificações e tipagem de maneira muito simples (é um Long, não é uma String)
class MyClass                                   // Classe só para fazer um teste que cai como Not a string.fun main() {
