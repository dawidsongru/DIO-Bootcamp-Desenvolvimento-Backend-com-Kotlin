// Variáveis var e val
package me.dio.variaveisvareval

fun someCondition() = true          // função auxiliar para simular alguma condição aleatória. Condição = true

fun main() {

    val d: Int                      // 1 Variável val não inicializada, e se...
    
    if (someCondition()) {
        d = 1                       // 2 ... a condição for verdadeira, d = 1
    } else {                        //       senão
        d = 2                       // 2 ... d = 2 
    }
        
    println(d)                      // 3 Imprime o conteúdo da variável d.
 }






    // fun main() {

    //     var e: Int = 0                      // 1 Variável inicializada
    //     println(e)                          // 2 Tentativa de impressão de uma variável que ainda não foi inicializada.
// }    






//     var a: String = "initial"           // 1 Não está usando a inferência de tipo do Kotlin, está declarando explicitamente o tipo como String
//     println(a)
//     a = "final"                         // var é mutável, então "a" era "inicial" e agora "a" mutou para "final". O valor pode ser alterado.
//     println(a)
    
//     val b: Int = 1                      // 2 Explicitamente declarando o tipo como Int
//     b = 5                               // se tentar mutar b para 5, dá erro na tentativa de compilar o código

//     val c = 3                           // 3 Usando a inerência de tipo do Kotlin, que já entende que 3 é do tipo Int
//     println(b)
//     println(c)
// }
