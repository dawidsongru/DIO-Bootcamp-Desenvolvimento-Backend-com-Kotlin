// Funções de Escopo let

package me.dio.funcoesdeescopolet

fun customPrint(s: String) {            // função customPrint que recebe uma String
    print(s.uppercase())                // faz um print em uppercase (imprime em letras maiúsculas). Imprime o TEST em maiúsculo.
}

    fun main() {

    val empty = "test".let {            // 1 Texto chamado test que está usando o let como uma função de escopo...
        customPrint(it)                 // 2 ... chamando o customPrint chamando o it (que é o "test")
        it.isEmpty()                    // 3 colocando como última instrução it.isEmpty(). A ÚLTIMA INSTRUÇÃO DO LET É SEMPRE O QUE ELE VAI RETORNAR, SE ESTIVERMOS ATRIBUINDO ELE A UMA VARIÁVEL.
    }
    println(" is empty: $empty")        // retorna um valor booleano, false
                                        // Empty é falso porque it.isEmpty verifica se a variável empty está vazia ou não. Não está vazia porque a variável empty recebeu o conteúdo "test".


// ===========================================================================================================================================================================================

    fun printNonNull(str: String?) {        // função printNonNull que recebe uma String nulable (uma String que pode ser nula)
        println("Printing \"$str\":")       // print da String sem validar

        str?.let {                          // 4 faz o let executar SOMENTE se a string não for nula. Se o str? vier nulo, ele não vai executar o let.
            print("\t")                     //   ... não executa esta linha...
            customPrint(it)                 //   ... não executa esta linha...
            println()                       //   ... não executa esta linha.
        }
    }
    printNonNull(null)                      // primeira passagem de parâmetro como null ele não faz nada, imprime null poruq tem um println("Printing \"$str\":") no começo da função.
    printNonNull("my string")               // ele imprime o "my string" e depois faz o customPrint(it) do jeito que está definido dentro do str?.let { , imprimindo em maiúsculo.
    // printIfBothNonNull("First","Second")
    // }


// ===========================================================================================================================================================================================

                                                                    // 2 strings de entrada na primeira linha: (strOne: String?, strTwo: String?), strings que podem ser nulas.
    fun printIfBothNonNull(strOne: String?, strTwo: String?) {      // Encadear lets, fazer um let dentro do outro, você...
        strOne?.let { firstString ->                                // 5 ...precisa nomear o parâmetro it. Fazendo um let e chamando de firstString
            strTwo?.let { secondString ->                           // Fazendo um let e chamando de secondString
                customPrint("$firstString : $secondString")         // Imprimindo ambas as strings.
                println()
            }
        }
    }

printNonNull(null)
printNonNull("my string") 
printIfBothNonNull("First","Second")                                // Ambas vão aparecer em maiúscula.
}