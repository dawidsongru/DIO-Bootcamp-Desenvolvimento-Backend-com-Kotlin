// Funções de Escopo Also

package me.dio.funcoesdeescopoalso

data class Person(val name: String, val age: Int, val about: String) {      // data class Person. nome, idade e sobre, como propriedade
    constructor() : this("", 0, "")
}

fun writeCreationLog(p: Person) {                           // função de log 
    println("A new person ${p.name} was created.")              
}

fun main() {                                                // função principal

//    val jake = Person("Jake", 30, "Android developer")    // val jake não pode ser usada em kotlin, por isso foi removida na linha de baixo para corrigir o erro.
    Person("Jake", 30, "Android developer")                 // 1 cria um objeto do tipo Person usando o construtor com todos os parâmetros (propriedades: nome, idade e sobre)
        .also {                                             // 2 encadeiar a função de escopo, also. also vai fazer alguma ação adicional. faça isso...
            writeCreationLog(it)                            // 3 ... e depois também faça isso, na sequência. Escreve o CreationLog passando o it, que é a instância de Person (nome, idade e sobre)
    }

}
