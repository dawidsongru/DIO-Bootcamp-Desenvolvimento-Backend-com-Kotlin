// Tipos de Funções Infix Functions

package me.dio.tiposdefuncoesinfixfunctions

fun main() {

    infix fun Int.times(str: String) = str.repeat(this)         // 1 infix function plicada ao tipo inteiro com a definição de times (vezes) quando receber uma String repetir isso "x" vezes
    println(2 times "Bye ")                                     // 2    2 x Bye (imprime "Bye" 2 vezes)
  
    val pair = "Ferrari" to "Katrina"                           // 3 infix function nativa do kotlin. Cria um par (Ferrari + Katrina)
    println(pair)                                               // imprime o conteúdo da variável pair (Ferrari Katrina)
  
    infix fun String.onto(other: String) = Pair(this, other)    // 4 função idêntica a de cima, porém menos legível.
    val myPair = "McLaren" onto "Lucas"                         // Cria um par (McLaren + Lucas)
    println(myPair)                                             // imprime o conteúdo da variável myPair (McLaren Lucas)
  
    val sophia = Person("Sophia")                               // Cria a variável sophia
    val claudia = Person("Claudia")                             // Cria a variável claudia
    sophia likes claudia                                        // 5 e chama as duas dessa forma. A lista de pessoas de sofia, já adiciona claudia nas linhas abaixo.
  }
  
  class Person(val name: String) {                              // classe Person que possui um construtor com uma variável imutável name do tipo String
    val likedPeople = mutableListOf<Person>()                   // classe Person possui uma mutableList de pessoas (que aquela pessoa gosta)
    infix fun likes(other: Person) { likedPeople.add(other) }   // 6 infix function chamada de likes, recebendo uma outra pessoa como parâmetro. Ela adiciona dentro da mutablelist...
  }                                                             //   a pessoa que está chegando como parâmetro.
