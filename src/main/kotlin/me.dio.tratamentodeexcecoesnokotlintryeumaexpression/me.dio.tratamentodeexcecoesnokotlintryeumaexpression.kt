// Tratamento de Exceções no Kotlin - Try É Uma Expression

package me.dio.tratamentodeexcecoesnokotlintryeumaexpression

// fun main() {
//     val a = 10
//     val b = 0                   // Divisão por zero gera uma Exceção do tipo ArithmeticException (warning: division by zero) e imprime o conteúdo da variável divisao.
//     // val b = 2                   // Divisão normal, funciona sem erro

//     val divisao = try { a/b } catch (e: ArithmeticException) { null }
//     println(divisao)
// }

fun main() {
    val a = 10
    // val b = 0                   // Divisão por zero gera uma Exceção do tipo ArithmeticException (warning: division by zero) e imprime o conteúdo da variável divisao.
    val b = 2                   // Divisão normal, funciona sem erro

    val divisao = try {
        // println("Divisão realizada com sucesso!")       // movendo o println para antes da divisão, não exibe o erro Unit.
        a/b
        println("Divisão realizada com sucesso!")       // a divisão é um kotlin.Unit. Unit é algo sem retorno dentro do Kotlin.
                                                        // o try como uma Expression vai pegar o último comando do bloco (println), por isso o erro Unit.
    } catch (e: ArithmeticException) {
        println("Divisão com erro!")
        null
    }
    println(divisao)
}
