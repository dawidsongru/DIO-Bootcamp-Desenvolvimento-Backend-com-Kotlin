// Funções de Escopo run

package me.dio.funcoesdeescoporun

fun main() {                                        // função main

    fun getNullableLength(ns: String?) {            // função getNullableLength que recebe como parâmetro uma String? nulable (uma string que pode ser nula). Retornar um Int.
        println("for \"$ns\":")                     // imprimir qualquer coisa que ver em ns
        ns?.run {                                   // 1 faz uma verificação. Verifica se o ns está nulo, se ele não estiver, vai executar o run.
            println("\tis empty? " + isEmpty())     // 2 no caso de run, está chamando o isEmpty direto. (se estivesse usando o let, precisaria do it antes it.isEmpty())
            println("\tlength = $length")               
            length                                  // 3 chamando a propriedade length direto, para retornar.
        }                                           // fazer o tratamento nulo 
    }
    getNullableLength(null)                         // retornando o length. Se o ns? (return ns?.run) for diferente de nulo, vai executar o run e vai retornar o length, senão, retona 0.
    getNullableLength("")                           // como vazio não é nulo, vai executar, vai alar que o isEmpty é true e que o length é 0 e está retornando 0
    getNullableLength("some string with Kotlin")    // tem um texto válido com length (tamanho) de 23 caracteres.

}


// // Funções de Escopo run

// package me.dio.funcoesdeescoporun

// fun main() {                                        // função main

//     fun getNullableLength(ns: String?): Int {       // função getNullableLength que recebe como parâmetro uma String? nulable (uma string que pode ser nula). Retornar um Int.
//         println("for \"$ns\":")                     // imprimir qualquer coisa que ver em ns
//         return ns?.run {                            // 1 faz uma verificação. Verifica se o ns está nulo, se ele não estiver, vai executar o run.
//             println("\tis empty? " + isEmpty())     // 2 no caso de run, está chamando o isEmpty direto. (se estivesse usando o let, precisaria do it antes it.isEmpty())
//             println("\tlength = $length")               
//             length                                  // 3 chamando a propriedade length direto, para retornar.
//         } ?: 0                                      // fazer o tratamento nulo 
//     }
//     println(getNullableLength(null))                // retornando o length. Se o ns? (return ns?.run) for diferente de nulo, vai executar o run e vai retornar o length, senão, retona 0.
//     println(getNullableLength(""))                  // como vazio não é nulo, vai executar, vai alar que o isEmpty é true e que o length é 0 e está retornando 0
//     println(getNullableLength("some string with Kotlin"))   // tem um texto válido com length (tamanho) de 23 caracteres.

// }
