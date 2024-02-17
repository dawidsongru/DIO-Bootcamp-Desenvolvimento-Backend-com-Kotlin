// Funções de Escopo With

package me.dio.funcoesdeescopowith                                          

// 3 FORMAS DE FAZER A MESMA COISA
// ===============================

class Configuration(val host: String, val port: Int)                        // classe configuration, tem um host e uma porta como val (quando possível, sempre utilizar o val, imutável)
                                                                            // utilizando a variável em tempo de construtur, pode utilizar o val
fun main() {                                                            
    val configuration = Configuration(host = "127.0.0.1", port = 9000)
    
    with(configuration) {                                                   // podemos acessar diretamente o host e o port
        println("$host:$port")
    }

    // alternative
    configuration.run {                                                     // como alternativa para acessar o host e a porta, podemos dar um run direto nele
        println("$host:$port")                                              // a coniguration já está inplicitamente aqui, dessa forma podemos acessar diretamente as propriedades host e port
    }

    // instead of:
    println("${configuration.host}:${configuration.port}")                  // outra forma de acessar o host e a porta seria assim

}
