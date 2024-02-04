// Conjuntos (Set)

package me.dio.conjuntosset

val openIssues: MutableSet<String> = mutableSetOf("uniqueDescr1", "uniqueDescr2", "uniqueDescr3")   // 1 Variável imutável recebendo uma instância mutável de uma mutableSerOf.
// val openIssues = mutableSetOf("uniqueDescr1", "uniqueDescr2", "uniqueDescr3")                    //  Poderia atribuir dessa forma, fazendo inferência de tipo.

fun addIssue(uniqueDesc: String): Boolean {                                                         // 2 Criada uma função chamada addIssue que recebe uma descrição e adiciona a
    return openIssues.add(uniqueDesc)                                                               //   mutableSetOf acima. Dando um add nessa instância que é de uma lista mutável, mutableSetOf.
}

fun getStatusLog(isAdded: Boolean): String {                                                        // 3 Função que retorna uma String inormando o Status
    return if (isAdded) "registered correctly." else "marked as duplicate and rejected."            //   Se foi adicionado, "registered correctly." else "marked as duplicate and rejected."
}                                                                                                   //   Aqui temos uma Conditional Expression
// fun getStatusLog(isAdded: Boolean) = if (isAdded) "registered correctly." else "marked as duplicate and rejected."   // Essa atribuição poderia ser reduzida dessa forma, em uma única linha.

fun main() {
    val aNewIssue: String = "uniqueDescr4"                                                          // Tentar incluir uma Descrição Nova.
    val anIssueAlreadyIn: String = "uniqueDescr2"                                                   // Tentar incluir outra Descrição que já Existe (Não deve deixar essa ser adicionada)

    println("Issue $aNewIssue ${getStatusLog(addIssue(aNewIssue))}")                                // 4 Pegar o status de quando chamar o getStatusLog passando o addIssue. Consiga inserir.
    println("Issue $anIssueAlreadyIn ${getStatusLog(addIssue(anIssueAlreadyIn))}")                  // 5 É esperado que falhe, porque deu duplicado.
}
