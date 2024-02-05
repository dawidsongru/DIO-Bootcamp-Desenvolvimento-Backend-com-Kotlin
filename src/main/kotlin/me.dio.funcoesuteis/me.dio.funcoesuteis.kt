// Funções Úteis

package me.dio.funcoesuteis

// flatMap
fun main() {


    val fruitsBag = listOf("apple","orange","banana","grapes")  // 1 Define uma coleção de Strings com nomes de frutas.
    val clothesBag = listOf("shirts","pants","jeans")           // 2 Define uma coleção de Strings com nomes de roupas.
    val cart = listOf(fruitsBag, clothesBag)                    // 3 Adiciona frutasBag e roupasBag à lista do carrinho.
    val mapBag = cart.map { it }                                // 4 Constrói um mapa de elementos do carrinho, que é uma lista de duas listas.
    val flatMapBag = cart.flatMap { it }                        // 5 Constrói um flatMap de elementos do carrinho, que é uma lista única composta por elementos de ambas as listas.


    println("Your bags are: $mapBag")                           // Suas malas são:
    println("The things you bought are: $flatMapBag")           // As coisas que você comprou são:
}




// // Any
// fun main() {


//     val numbers = listOf(1, -2, 3, -4, 5, -6)            // 1 Define uma coleção de números.
    
//     val anyNegative = numbers.any { it < 0 }             // 2 Verifica se existem elementos negativos.
    
//     val anyGT6 = numbers.any { it > 6 }                  // 3 Verifica se existem elementos maiores que 6.


//     println("Numbers: $numbers")
//     println("Is there any number less than 0: $anyNegative")    // Existe algum número menor que 0? Verdadeiro
//     println("Is there any number greater than 6: $anyGT6")      // Existe algum número maior que 6? Falso
// }



// // Map
// fun main() {

//     val numbers = listOf(1, -2, 3, -4, 5, -6)     // 1 Define uma coleção de números.
        
//     val doubled = numbers.map { x -> x * 2 }      // 2 Duplica números.

//     val tripled = numbers.map { it * 3 }          // 3 Usa a notação it mais curta para triplicar os números.


//     println("Numbers: $numbers")
//     println("Doubled Numbers: $doubled")
//     println("Tripled Numbers: $tripled")

// }


// // Filter
// fun main() {

//     val numbers = listOf(1, -2, 3, -4, 5, -6)       // 1 Define a coleção de números. Variável com lista imutável.
//                                                     //   
//     val positives = numbers.filter { x -> x > 0 }   // 2 Obtém números positivos. iltro para veriicar se os números são positivos. Predicado através de uma função Lambda. X > 0 são elementos positivos.
//                                                     //   Criada variável nomeada chamada x e utiliza ela pra fazer a condição. É opcional nomear essa variável no predicado, você pode usar it.
//     val negatives = numbers.filter { it < 0 }       // 3 Usa a notação it mais curta para obter números negativos. Ver os negativos.
//                                                     //   Podemos usar variável nomeada { x -> x > 0 } ou notação it { it < 0 } para obter o resultado desejado.

//     println("Numbers: $numbers")
//     println("Positive Numbers: $positives")
//     println("Negative Numbers: $negatives")
// }
