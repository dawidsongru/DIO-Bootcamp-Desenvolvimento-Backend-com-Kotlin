// Enum Classes

package me.dio.enumclasses

enum class Color(val rgb: Int) {                        // 1 enum class Color tem um construtor que recebe RGB, um valor que vai representar uma cor.
    RED(0xFF0000),                                      // 2 Vermelho com valor Hexadecimal (0xFF0000) como parâmetro.
    GREEN(0x00FF00),                                    //   Verde    com valor Hexadecimal (0x00FF00) como parâmetro.
    BLUE(0x0000FF),                                     //   Azul     com valor Hexadecimal (0x0000FF) como parâmetro.
    YELLOW(0xFFFF00);                                   //   Amarelo  com valor Hexadecimal (0xFFFF00) como parâmetro.

    fun containsRed() = (this.rgb and 0xFF0000 != 0)    // 3 Verifica se alguma cor acima possui o código Hexadecimal PARECIDO com o Vermelho.
}                                                       //   O código Hexadecimal mais parecido com o vermelho, é o amarelo (0xFF....)

fun main() {
    val red = Color.RED                                 //   Pega o vermelho
    println(red)                                        // 4 imprime o vermelho
    println(red.containsRed())                          // 5 chama pra ver se ele é o red, verdade.
    println(Color.BLUE.containsRed())                   // 6 chamada direta do containsRed usando o Blue, não possui similaridade, false.
    println(Color.YELLOW.containsRed())                 // 7 chamada direta do containsRed usando o yellow, possui similaridade. Ambos começam com FF, true.
}




// // enum chamada State                                                
// enum class State {                              // enum class representa um número finito de possibilidades. Ex: Em estado de 1-Loading, 2-Sucess, 3-Error, etc.
//     IDLE, RUNNING, FINISHED                     // 1  estado: IDLE(parado), RUNNING(rodando), FINISHED(finalizado)
// }                                               //   posição: North(norte), South(sul), East(Leste), West(Oeste)
//                                                 //     nível: Easy(fácil), Médio(Medium), Difícil(Hard)
// fun main() {
//     val state = State.RUNNING                   // 2 o State começou como RUNNING(rodando)
//     val message = when (state) {                // 3 Fazer a verificação através da estrutura condicional When
//         State.IDLE -> "It's idle"               //   Se o estado for IDLE, escrever "Está parado" 
//         State.RUNNING -> "It's running"         //   Se o estado for RUNNING, escrever "Está rodando"
//         State.FINISHED -> "It's finished"       //   Se o estado for FINISHED, escrever "Está finalizado"
//     }
//     println(message)                            // Imprimir a mensagem de acordo com o estado que se encontra: parado, rodando ou inalizado.
// }
