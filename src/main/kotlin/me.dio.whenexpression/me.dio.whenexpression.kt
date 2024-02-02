// When Expression

package me.dio.whenexpression

fun main() {                        // Função main (principal)
    println(whenAssign("Hello"))    // Quando chamar o método whenAssign passando a string "Hello", a função whenAssigh (linha 12) vai receber essa string no objeto (linha 12) e vai fazer a expressão when expression (linha 13)
    println(whenAssign(3.4))        // Não estamos colocando o L após o 4, e como tem ponto flutuante (casa decimal), não pode ser Long. Double ou alguma coisa com ponto flutuante (casa decimal), vai cair no 42 (linha 18)
    println(whenAssign(1))          // Quando passar 1, vai cair em "one" (linha 15)
    println(whenAssign(MyClass()))  // Quando passar MyClass, vai cair em MyClass (linha 23). Quando passa uma instância de MyClass, cai no else, 42.
}

fun whenAssign(obj: Any): Any {     // Função whenAssign recebe um objeto que pode ser qualquer coisa como parâmetro e ela também retorna qualquer coisa.
    val result = when (obj) {       // 1 Criando uma variável result (resultado) e fazendo uma atribuição de alguma atribuição de // 2, 3, 4 ou 5
                                    //   Fazendo uma atribuição, por isso que when está sendo usado como uma expression.
        1 -> "one"                  // 2 Quando passa 1, retorna "one"
        "Hello" -> 1                // 3 Caiu no "Hello" e retornou 1
        is Long -> false            // 4 3.4 não é Long, é um número com ponto flutuante (casa decimal)
        else -> 42                  // 5 Quando passou 3.4, caiu no else e retorna 42, porque 3.4 não é "one", não é "Hello" e não é Long, ele é um número com ponto flutuante (casa decimal)
    }
    return result                   // Retorna o resultado (uma espécie de println)
}

class MyClass                       // Quando não cair em (1, "Hello", Long), cai no else e imprime 42.