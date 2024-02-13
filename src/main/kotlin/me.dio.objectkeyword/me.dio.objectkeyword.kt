// Object Keyword

package me.dio.objectkeyword

// Objetos complementares                       // Criação de um bloco onde estaremos expondo funções estáticas
class BigBen {                                  //1 classe BigBen
    companion object Bonger {                   //2 complemento object chamado Bonger
        fun getBongs(nTimes: Int) {             //3 função getBongs
            for (i in 1 .. nTimes) {
                print("BONG ")
            }
        }
    }
}

fun main() {
    BigBen.getBongs(12)                         //4 chamando uma função .getBongs através da classe BigBen. Imprime 12 vezes o nome BONG.
}








// // object como Declaração                                       // Declara uma classe como um objeto
// object DoAuth {                                                 //1 objeto DoAuth
//     fun takeParams(username: String, password: String) {        //2 função takeParams que recebe como parâmetro um username e um password do tipo String
//         println("input Auth parameters = $username:$password")
//     }
// }

// fun main(){
//     DoAuth.takeParams("foo", "qwerty")                          //3 Doauth é um objeto que conseguimos acessar de maneira única e dá acesso as suas funções que estão abertas para utilizarmos.
// }






// // object como Expression
// fun rentPrice(standardDays: Int, festivityDays: Int, specialDays: Int): Unit {  //1 Podemos criar uma função para calcular um preço

//     val dayRates = object {                                                     //2 Cria uma estrutura dinâmica em tempo de execução. Criando um object expression que possui algumas variáveis internas
//         var standard: Int = 30 * standardDays                                   //  30 * standardDays 10 = 300
//         var festivity: Int = 50 * festivityDays                                 //  50 * festivityDays 2 = 100
//         var special: Int = 100 * specialDays                                    // 100 * specialDays   1 = 100
//     }                                                                           //                        =====     
//                                                                                 //                 Total = 500     
//     val total = dayRates.standard + dayRates.festivity + dayRates.special       //3 a variável dayRates tem acesso a essas 3 propriedades: standard, festivity e special

//     print("Total price: $$total")                                               //4 imprime o total 500

// }

// fun main() {
//     rentPrice(10, 2, 1)                                                         //5 Esses são os valores que serão multiplicados acima, nas variáveis standardDays, festivityDays e specialDays.
// }





// import java.util.Random

// class LuckDispatcher {                      //1 criada a classe LuckDispatcher
//     fun getNumber() {                       //2 que tem a função fun getNumber
//         var objRandom = Random()
//         println(objRandom.nextInt(5))       // gera números aleatórios menores que o valor informado
//     }
// }

// fun main() {
//     val d1 = LuckDispatcher()               //3 define 2 variáveis, d1 e d2
//     val d2 = LuckDispatcher()
    
//     d1.getNumber()                          //4 imprime o conteúdo dessas variáveis
//     d2.getNumber()
// }
