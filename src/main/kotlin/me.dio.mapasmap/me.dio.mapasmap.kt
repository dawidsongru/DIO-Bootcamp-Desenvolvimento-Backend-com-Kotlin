// Mapas (Map)

package me.dio.mapasmap

const val POINTS_X_PASS: Int = 15                                                       // Constante imutável com valor 15 (quantidade de pontos para ganhar)
val EZPassAccounts: MutableMap<Int, Int> = mutableMapOf(1 to 100, 2 to 100, 3 to 100)   // 1 Variável Accounts e seus pontos. Usuário 1, 100 pontos, etc. Chave 1 e seu valor 100, etc.
val EZPassReport: Map<Int, Int> = EZPassAccounts                                        // 2 Criando uma variável cópia somente leitura chamada Report

fun updatePointsCredit(accountId: Int) {                                                // Update dos pontos desse mutableMapOf(). Vai receber um Id da conta que eu quero atualizar e...
    if (EZPassAccounts.containsKey(accountId)) {                                        // 3 ... se o Mapa que tem a chave valor da conta, quanto cada conta tem de saldo, ele tem essa accountId?
        println("Updating $accountId...")                                               //       se sim, fala o update...
        EZPassAccounts[accountId] = EZPassAccounts.getValue(accountId) + POINTS_X_PASS  // 4 ... adicionando a quantidade de pontos ao que ele já tem. Atualiza a quantidade de pontos.
    } else {                                                                            // senão
        println("Error: Trying to update a non-existing account (id: $accountId)")      // Imprime mensagem de erro: Tentando atualizar uma conta inexistente
    }
}

fun accountsReport() {                                                                  // Faz um relatório das accounts (contas)
    println("EZ-Pass report:")                                                          // Imprime um cabeçalho
    EZPassReport.forEach {                                                              // 5 Faz um orEach na variável somente de leitura
        k, v -> println("ID $k: credit $v")                                             // Imprime os Accounts Id's e seus respectivos pontos.
    }
}

fun main() {
    accountsReport()                                                                    // 6 Gera o Report de todas as contas pra saber se todas estão com valor 100.
    updatePointsCredit(1)                                                               // 7 Adicionar credito na conta 1, duas vezes.
    updatePointsCredit(1)                                                               //   A conta 1 iria somar 100 pontos já existente + 15 +15 = 130 pontos.
    updatePointsCredit(5)                                                               // 8 Atualizar os pontos da conta 5, que não existe. Imprime Erro: Tentando atualizar uma conta inexistente
    accountsReport()                                                                    // 9 Gera um novo relatório para ver se tudo foi atualizado como deveria.
}
