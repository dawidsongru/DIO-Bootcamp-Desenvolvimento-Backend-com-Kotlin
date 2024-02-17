// Funções de Escopo Apply

package me.dio.funcoesdeescopoapply

// PODEMOS UTILIZAR O APPLY PARA ATUALIZAR VALORES ESPECÍFICOS DENTRO DE UMA ESTRUTURA DE OBJETOS

data class Person(var name: String, var age: Int, var about: String) {      // data class é um tipo de classe preparada pra armazenar informações, dados. var mutável.
    constructor() : this("", 0, "")                                         // sobrecarga de construtor vazio 
}

fun main() {
    val jake = Person()                         // 1 se chamar o construtor vazio, this("", 0, ""), ele vai iniciar com o nome vazio, a idade 0 e o sobrenome vazio     
    val stringDescription = jake.apply {        // 2 usar o escopo function apply pra atribuir os valores das propriedades dele
        name = "Jake"                           // 3 atribuindo os valores nome, idade e sobre.
        age = 30
        about = "Android developer"
    }.toString()                                // 4 convertendo tudo para String, já que a idade inicialmente foi atribuida como Int

    println(stringDescription)                  // imprimir o conteúdo             
    println(jake.toString())                    // também podemos dar um jake.toString que tem a mesma função da linha acima
}
