// Verificações de Igualdade == e ===

// ==    comparação estrutural: compara se tem os mesmo caracteres (as mesmas palavras)
// ===  comparação referencial: mesmo que esteja em outra ordem, o tipo setOf não aceita registros duplicados quando comparamos com ===.

package me.dio.verificacoesdeigualdade

fun main() {                                        // Função main (principal)

    val authors = setOf("Café", "Leite", "Suco")
    val writers = setOf("Suco", "Café", "Leite")    // mesmo que esteja em outra ordem,
                                                    // o tipo setOf não aceita registros duplicados quando comparamos com ===.

    println(authors == writers)                     // 1 Verdadeiro, tem os mesmo caracteres (as mesmas palavras)
    println(authors === writers)                    // 2 Falso, o tipo setOf não aceita registros duplicados quando comparamos com ===.

}
