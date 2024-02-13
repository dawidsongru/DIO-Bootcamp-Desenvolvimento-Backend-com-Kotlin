// Sealed Classes                           // Classe selada pode herdar as características (propriedades) de todo mamífero.

package me.dio.sealedclasses                                                            // Traz todos os pilales da Orientação a Objetos: Encapsulamento, Polimorfismo, Herança e Abstração.

sealed class Mammal(val name: String)                                                   // 1 sealed class pra definir o tipo como mamíferos

class Cat(val catName: String) : Mammal(catName)                                        // 2   gato pode ser um mamífero, extender : Mammal(catName)
class Human(val humanName: String, val job: String) : Mammal(humanName)                 //   humano pode ser um mamífero, extender : Mammal(humanName)

fun greetMammal(mammal: Mammal): String {                                               //   Essa função genérica pode ser chamada tanto pra gatos quanto para humanos.
    when (mammal) {                                                                     // 3 está recebendo como parâmetro um mamíero, essa função é genérica, aceita qualquer tipo de mamífero.
        is Human -> return "Hello ${mammal.name}; You're working as a ${mammal.job}"    // 4 Se humano, imprima a frase
        is Cat -> return "Hello ${mammal.name}"                                         // 5 Se gato, imprima a frase
    }                                                                                   // 6 fecha a função
}

fun main() {
    val cat = Cat("Snowy")
    val human = Human("Dawidson", "estudante de TSI no IFPE")
    
    println(greetMammal(cat))                                                           // O compiador do Kotlin vai fazer inferência de tipo na variável cat como tipo Cat (gato)
    println(greetMammal(human))                                                         // O compiador do Kotlin vai fazer inferência de tipo na variável human como tipo Human (humano)
}
