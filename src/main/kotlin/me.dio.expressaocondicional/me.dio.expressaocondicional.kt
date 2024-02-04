// Expressão Condicional

package me.dio.expressaocondicional

fun main(){
    fun max(a: Int, b: Int) = if (a > b) a else b   // 1 Criando uma função max, recebe parâmetros Int a e Int b: fun max(a: Int, b: Int)
                                                    // Usando um If Else como expression. Se (a > b), armazene em a, senão, armazene em b.
    println(max(2, 1))                              // a=2, b=1   (Imprima o maior)
    println(max(10, 20))                            // a=10, b=20 (Imprima o maior)

}
