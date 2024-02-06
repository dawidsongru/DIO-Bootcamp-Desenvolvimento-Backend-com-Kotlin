// Herança Passando Argumentos do Construtor para a Superclasse

package me.dio.herancapassandoargumentosdoconstrutorparaasuperclasse
                                                                    // open classe pode ser utilizada por outras classes pra explorar o conceito de herança.
open class Lion(val name: String, val origin: String) {             // classe Leão com as propriedades nome e origem.
    fun sayHello() {                                                // Leão tem a função de dizer sayHello (Olá)
        println("$name, the lion from $origin says: graoh!")        // que vai imprimir um texto e o grunido do Leão. $name, interpolação de String.
    }
}

class Asiatic(name: String) : Lion(name = name, origin = "India")   // 1 a classe Asiatic recebe apenas o nome em seu construtor em tempo de construção.
                                                                    //   a intenção é propagar esse name Asiatic para a superclasse Lion.
                                                                    //   um Leão Asiático vai poder receber um nome e que a origem dele será sempre da India.
                                                                    //   Obs: não tem variável var nem val. O parâmetro vai ser propagado para a superclasse.
fun main() {
    val lion: Lion = Asiatic("Rufo")                                // 2 cria uma variável Lion: do tipo especíico Asiatic, tipada como Lion do tipo genérico...
    lion.sayHello()                                                 //   ... que trás aspéctos de polimorfismo e que imprime a função sayHello do println.
}
