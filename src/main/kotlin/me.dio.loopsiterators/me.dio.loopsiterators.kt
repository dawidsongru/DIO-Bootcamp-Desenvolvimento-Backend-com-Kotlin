// Loops: Iterators

package me.dio.loopsiterators

class Animal(val name: String)                      // Classe Animal com propriedade do tipo val, imutável

class Zoo(val animals: List<Animal>) {              // Classe Zoo (zoológico) que recebe uma lista val (imutável) de animais.

    operator fun iterator(): Iterator<Animal> {     // 1 operators functions cria dentro da classe zoo a capacidade de ser iterada, de poder fazer um laço,
                                                    //   uma estrutura de repetição dentro dessa estrutura, dessa classe Zoo.
        return animals.iterator()                   // 2 O iterator do Zoológico irá iterar a lista de animais.
                                                    //   Ele pega a lista de animais que recebeu como parâmetro do construtor e busca o iterator dele pra
                                                    //   retornar como iterator de animal.
    }                                               //   O Zoológico tem a capacidade de ser iterado, ele implementa um iterator específico.
}

fun main() {

    val animals = listOf(Animal("zebra"), Animal("lion"));  // val animals recebe uma lista de animais (zebra e leão)
    val zoo = Zoo(animals)                                  // passando a lista de animais como parâmetro para o construtor do Zoológico.

    for (animal in zoo) {                                   // 3 Ao invés de fazer um for na lista de animais (Linha 19), estamos fazendo o for no Zoo.
        println("Watch out, it's a ${animal.name}")         // Imprimir o nome dos animais.
    }
}
