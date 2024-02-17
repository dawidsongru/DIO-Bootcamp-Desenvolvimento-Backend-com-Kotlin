// Tipos de Funções Lambda Functions

package me.dio.tiposdefuncoeslambdafunctions

fun main() {

    // Todos os exemplos criam um objeto de função que executa letras maiúsculas.       
    //Então é uma função de String para String

    val upperCase1: (String) -> String = { str: String -> str.uppercase() } // 1 Não usa inferência de tipo externa nem interna.
                                                                            //   Tipando a função lambda (String) -> String e também tipando a função lambda str: String
    val upperCase2: (String) -> String = { str -> str.uppercase() }         // 2 Inferência de tipo interna str -> str.uppercase()

    val upperCase3 = { str: String -> str.uppercase() }                     // 3 Inferência de tipo externa da função lambda str: String

    // val upperCase4 = { str -> str.uppercase() }                          // 4 Você não save o que entra nem o que sai. O compilador do Kotlin não consegue inferir tudo.
                                                                            //   Essa função dá erro.
    val upperCase5: (String) -> String = { it.uppercase() }                 // 5 Usar o it para representar o elemento que vai usar a expressão lambda

    val upperCase6: (String) -> String = String::uppercase                  // 6 fazer a chamada do uppercase de maneira direta   ::uppercase 
                                                                            // :: é a passagem de uma função para outra função ou o retorno de uma função dentro de outra função.
    println(upperCase1("hello"))
    println(upperCase2("hello"))
    println(upperCase3("hello"))
    println(upperCase5("hello"))
    println(upperCase6("hello"))

}
