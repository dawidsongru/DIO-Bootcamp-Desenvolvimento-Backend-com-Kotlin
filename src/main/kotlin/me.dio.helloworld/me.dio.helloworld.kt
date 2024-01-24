package me.dio.helloworld               // 1. Definição do pacote (algo muito comum para organização de código)

fun main() {                            // 2. Ponto de entrada de um código Kotlin, definido pela função [main]
    println("Hello World 1!")           // 3. imprime o texto contido entre aspas "" 

    val kotlin = "Hello World 2!"       // 4. a variável kotlin recebe o conteúdo contido entre aspas ""
    println(kotlin)                     // 5. println imprime o conteúdo da variável kotlin e pula uma linha

    print("Hello World 3! ")            // 6. print imprime e não pula linha (a próxima impressão será na mesma linha de "Hello World 3! ")
    println("Hello World 4!")           // 7. println imprime pula linha
    println("Hello World 5!")           // 8. println imprime pula linha
}
