// Loops: For

package me.dio.loopsfor

// fun main(args: Array<String>) { // Exemplo antigo, ainda tem o (args: Array<String>). Só precisa ter esse argumento em versões anterioes a 1.3 do Kotlin.
fun main() {

    val cakes = listOf("carrot", "cheese", "chocolate")     // Criando uma lista de Cakes (bolos): cenoura, queijo e chocolate.
                                                            // ListOf já está disponível de maneira implicita e podemos utilizá-la em qualquer momento.
                                                            // Quando chamar essa função ListOf, irá pegar os valores e criar uma lista (de bolos)
                                                            // Este ListOf recebe um vararg (de qualquer tipo), neste caso uma lista de Strings.
                                                            // Loop é percorrar cada elemento que foi adicionado em uma lista. Lista com 3 elementos.
    for (cake in cakes) {                                   // 1 Fazendo um for, um loop, um laço, uma estrutura de repetição dentro da variável cakes.
                                                            // Fazendo um for dentro da lista de cakes (bolos);
        println("Yummy, it's a $cake cake!")                // Imprima Yume, it's a (sabor do bolo) e a palavra cake (bolo).
    }                                                       // O for passa 3 vezes pelo número de elementos (3 sabores de bolo)
                                                            // Isso é um Loop. É a capacidade de percorrer uma lista, um array, um Set ou um Mapa.
}
