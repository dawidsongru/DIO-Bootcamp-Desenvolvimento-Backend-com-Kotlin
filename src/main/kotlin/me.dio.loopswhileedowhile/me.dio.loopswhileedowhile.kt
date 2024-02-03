// While e Do While

package me.dio.loopswhileedowhile

fun eatACake() = println("Eat a Cake")      // Comer um bolo
fun backACake() = println("Bake a Cake")    // Assar um bolo

fun main() {                                // Função principal 
    var cakesEaten = 0                      // Simular que alguns bolos vão ser comidos. var podem receber novos valores, val não pode.
    var cakesBaked = 0                      // E outros precisam ser assados para substituir. var podem receber novos valores, val não pode.

    while (cakesEaten < 5) {                // while vai executar enquanto a condição for verdadeira.
                                            // Enquanto os bolos comidos forem menor que 5, eu não saio do loop, do laço.
        eatACake()
        cakesEaten++                        // O loop (laço) só para de rodar quando os bolos comidos forem maior ou igual a 5.
    }                                       // Quando os bolos comidos forem maior ou iguais a 5, ele sai do while e entra no DO (FAÇA)
    
    do {                                    // Primeiro execute o bloco de código abaixo (DO)
        backACake()                          
        cakesBaked++
    } while (cakesBaked < cakesEaten)       // Depois veriique se a condição é verdadeira (WHILE)
}
