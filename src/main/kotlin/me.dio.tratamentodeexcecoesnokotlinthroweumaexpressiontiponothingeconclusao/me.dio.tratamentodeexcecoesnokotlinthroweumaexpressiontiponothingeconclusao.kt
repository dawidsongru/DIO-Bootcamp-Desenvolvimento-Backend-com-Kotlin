// Tratamento de exceções no Kotlin - Throw é uma Expression, Tipo Nothing e Conclusão

package me.dio.tratamentodeexcecoesnokotlinthroweumaexpressiontiponothingeconclusao

data class Person(val name: String?) // criar um data class só com o name do tipo string. Esse name vai ser nulable     name: String?

fun fail(message: String): Nothing {                // O fato da função retornar um Nothing (nada)...  
    throw IllegalArgumentException(message)         // ... que é o lançamento dessa seção, faz com que o fluxo pare e a exceção sea lançada...
}

fun main() {
    val person = Person(null)                       // simular a seção passando nulo ele dá erro de Name requirid.
    val s = person.name ?: fail("Name required")    // ... e propagada para a linha 13, que é a linha do fail.
    println(s)                                      // 's' é conhecido por ser inicializado neste ponto
}
