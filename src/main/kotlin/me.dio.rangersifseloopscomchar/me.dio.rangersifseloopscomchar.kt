// Rangers: Ifs e Loops com Char

package me.dio.rangersifseloopscomchar

fun main() {

    // Rangers com Ifs
    val x = 2                                       // variável val imutável com valor 2
    if (x in 1..5) {                                // 1 x está entre 1 e 5? sim (verdadeiro)
        print("x is in range from 1 to 5")          // se verdadeiro, imprima esta frase.
    }
    println()                                       // pule uma linha

    if (x !in 6..10) {                              // 2 x não está entre 6 e 10? sim (verdadeiro)
        print("x is not in range from 6 to 10")     // se verdadeiro, imprima esta frase.
    }
}

// // Rangers com Char
//     for (c in 'a'..'d') print(c)                // 1 c recebe de a até d. imprima c
//     println()                                   // pule uma linha

//     for (c in 'z' downTo 's' step 2) print(c)   // 2 c recebe de z decrementando até s, pulando 2. imprima c
//     println()                                   // pule uma linha

// //   OU

//     for (c in 'a'..'d') {                       // 1 c recebe de a até d.
//         print(c)                                // imprima c
//     }
//     println(" ")                                // pule uma linha

//     for (c in 'z' downTo 's' step 2) {          // 2 c recebe de z decrementando até s, pulando 2.
//     print(c)                                    // imprima c
//     }
//     print(" ")                                  // não pule linha
// }
