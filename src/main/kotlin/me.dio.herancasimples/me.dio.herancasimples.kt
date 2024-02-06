// Herança simples

package me.dio.herancasimples

open class Dog {                // 1 Classe básica que pode ser pai de outra classe, ela precisa estar como open class. Ela pode ser usada como extensão.
    open fun sayHello() {       // 2 Também existe uma função aberta. Tanto a classe quanto a função são abertas. A classe Dog pode ser uma hierarquia.
        println("wow wow!")
    }
}

// Yorkshire é um Cachorro   <--// (Forma de ler a classe)
class Yorkshire : Dog() {       // 3 A classe Yorkshire está herdando a classe Dog. Lendo a herança: podemos dizer que Yorkshire é um Cachorro.
    override fun sayHello() {   // 4 override sobrescreve a função sayHello que é uma função open (aberta).
        println("wif wif!")     // Forma de latir da raça Yorkshire
    }
}

fun main() {
    val dog: Dog = Yorkshire()  // Instanciar um cachorro. Podemos atribuir o tipo Dog a variável dog.
//  val dog = Yorkshire         // Poderíamos fazer a inferência de tipo dessa forma.
    dog.sayHello()              // Dizer Olá!
}
