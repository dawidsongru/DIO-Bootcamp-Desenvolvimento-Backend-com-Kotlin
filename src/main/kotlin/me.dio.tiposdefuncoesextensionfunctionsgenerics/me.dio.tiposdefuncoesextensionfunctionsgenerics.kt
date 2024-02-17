// Tipos de Funções Extension Functions Generics

package me.dio.tiposdefuncoesextensionfunctionsgenerics
                                                                            // 1 cria um extension function para qualquer tipo que possa ser nulable <T>
fun <T> T?.nullSafeToString() = this?.toString() ?: "NULL"                  //   T?.nullSafeToString() faz chamada para imprimir uma variável
                                                                            //   Quando for nulo dá o toString, caso contrário, imprime NULL
fun main() {
    println(null.nullSafeToString())                                        // imprime NULL
    println("Kotlin".nullSafeToString())                                    // imprime Kotlin
}
