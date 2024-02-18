// Tratamento de Exceções no Kotlin - Manipulando Minhas Primeiras Exceções

package me.dio.tratamentodeexcecoesnokotlinmanipulandominhasprimeirasexcecoes

fun main() {
    val a = 10                                          // a = 10
    val b = 2                                           // b = 0

    
    try {                                               // tenta fazer essa divisão...
        val divisao = a/b                               // exceção aritmética. essa linha lança uma exceção do tipo aritmética.
        println(divisao)                                // imprime o resultado da divisão.
    } catch(e: ArithmeticException) {                   // catch para uma exceção aritmética
        println("Ocorreu uma exceção aritmética.")      // imprimir a mensagem. sabemos que a exceção 
    } catch(e: Throwable) {                             // exibe uma exceção
        println(e.message);                             // pega só a mensagem de erro da seção
    } finally {                                         // finally é uma mensagem que sempre vai executar, independente de dar certo ou errado. Finally fecha o buffer.
        println("Finally executado!")                   // imprimir a mensagem. usar o Finally ajuda o sistema a não consumir recurso/memória do computador.
    }


    // try {                                       // tenta fazer essa divisão...
    //     val divisao = a/b                       // não existe divisão por 0. vai gerar uma exceção, um erro.
    // } catch(e: Throwable) {                     // ... e se der um erro, eu gostatia de tratar. Toda exceção de Kotlin herda de Throwable. e: é uma variável criada
    //     // e.printStackTrace();                 // printStackTrace é imprimir a pilha de erro exibindo informações mais detalhadas sobre os erros.
    //     println(e.message)                      // pega só a mensagem de erro da seção (by zero)
    // }
}
