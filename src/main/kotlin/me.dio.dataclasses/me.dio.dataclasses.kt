// Data Classes

package me.dio.dataclasses

data class User(val name: String, val id: Int) {            // 1 data class chamada User que tem 2 propriedades, nome e id 
    override fun equals(other: Any?) =                      // Sobrescrita da função equals.
        other is User && other.id == this.id                // 2 comparar apenas se os id são iguais: other.id == this.id 
}
fun main() {
    val user = User("Alex", 1)                              // Criação de um usuário Alex com id 1
    println(user)                                           // 3 impressão desse usuário.

    val secondUser = User("Alex", 1)                        // Sendo criado outros 2 usuários:  Alex, id 1
    val thirdUser = User("Max", 2)                          // Max, id 2

    println("user == secondUser: ${user == secondUser}")    // 4 Comparação de valores Alex, id 1.   user == secondUser = true
    println("user == thirdUser: ${user == thirdUser}")      //   Comparação de valores  Max, id 2.   user == thirdUser = false
                                                            // == Não está comparando referência, está comparando estrutura.
    // hashCode() function                                  // 5 hashcode é um código hash que pega as propriedades do objeto e gera um valor
    println(user.hashCode())                                // O hashcode do user e do secondUser são iguais: 63347075
    println(secondUser.hashCode())                          // 63347075
    println(thirdUser.hashCode())                           // O hashcode do thirdUser é diferente: 2390846

    // copy() function                                      //   Cria uma cópia com uma referência de memória diferente. Cria uma nova instância com os mesmos valores.
    println(user.copy())                                    // 6 Cria uma cópia idêntica do user, com a mesma estrutura: val user = User("Alex", 1) 
    println(user === user.copy())                           // 7 Se comparar referência e endereço de memória, o user e sua cópia são diferentes, vai dar falso, pois a cópia é uma nova instância.
    println(user.copy("Max"))                               // 8 Executar a cópia especiicando algum valor diferente. Executar o copy passando como parâmetro o argumento de construção "Max"
    println(user.copy(id = 3))                              // 9 Se não quiser seguir a ordem dos parâmetros de construção, pode especiicar um id para o name

    println("name = ${user.component1()}")                  // 10 Dentro das instâncias, dentro das Data Classes, podemos acessar os componentes dela, que são as propriedades...
    println("id = ${user.component2()}")                    //    ...  em ordem de declaração no construtor. A propriedade 1 representa o "nome" e a propriedade 2, representa o "id"
}
