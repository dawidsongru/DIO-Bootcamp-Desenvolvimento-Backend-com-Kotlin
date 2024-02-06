// Herança Com Construtor Parametrizado

package me.dio.herancacomconstrutorparametrizado
                                                        // open class é uma classe que pode ser usada por outra através de herança, pode estender Tiger
open class Tiger(val origin: String) {                  // Tiger tem uma característica específica: possuir um construtor ( ) com um parâmetro origin...
    fun sayHello() {                                    // ... e tem uma função, dizer olá. fun não é uma função que pode ser sobrescrita.
        println("A tiger from $origin says: grrhhh!")   // imprime a frase junto com o conteúdo da variável imutável origin.
    }
}                                                       // 1 Se você quiser usar um construtor parametrizado da superclasse ao criar uma subclasse,
                                                        //   forneça os argumentos do construtor na declaração da subclasse.
class SiberianTiger : Tiger("Sibéria")                  //   Você pode herdar uma classe Tiger, passando um parâmetro "Sibéria" no construtor ( ).
                                                        //   Podemos passar a origem do Tigre como "Sibéria". Essa notação concretiza a herança.
fun main() {
    val tiger: Tiger = SiberianTiger()                  // Usando polimorfismo para instanciar um objeto. Atribuição de tipo tiger: Tiger é polimorfismo.
    tiger.sayHello()
}
