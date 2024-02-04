// Listas (List)

package me.dio.listaslist
                                                            // 1 Criando uma variável imutável (val), mas recebendo uma mutableList (mutável).
val systemUsers: MutableList<Int> = mutableListOf(1, 2, 3)  //   A instância é de uma lista mutável, mas podemos add ou remover novos elementos.
val sudoers: List<Int> = systemUsers                        // 2 Estamos atribuindo a variável systemUsers para uma nova variável, sudoers.
                                                            //   Essa nova variável sudoers vai ser uma cópia "somente leitura" de systemUsers

fun addSystemUsers(newUser: Int) {                          // 3 Função que adiciona um novo usuário. Recebe um novo usuário e...
    systemUsers.add(newUser)                                //   ... adiciona na lista que pode receber novos elementos (newUser)
}                                                           //   Função para adicionar elementos na lista de usuários, que é uma lista mutável.

fun getSysSudoers(): List<Int> {                            // 4 Retorna uma cópia da lista de usuários.
    return sudoers                                          //   Essa variável, retorna a lista somente leitura
}

fun main() {
    addSystemUsers(4)                                       // 5 É adicionado um novo usuário no sistema com Id 4. (Já tem usuário 1,2 e 3).
    println("Tot sudoers: ${getSysSudoers().size}")         // 6 Imprime o total de usuário da lista Somente Leitura.
                                                            //   Pegando o size dela pra ver se ela foi atualizada.
    getSysSudoers().forEach {                               // 7 Percorrendo todos os elementos dessa lista, que é uma cópia.
        i -> println("Some useful info on user $i")         //   Imprime informações da lista original.
    }
    // getSysSudoers().add(5) <- Error!                     // 8 Simula um erro. Tentar adicionar um novo usuário na cópia imutable.
}
