package me.dio.funcoesparametrosvararg

fun main() {                                                            

    fun printAll (vararg messages: String) {                            // 1 O parâmetro messages: é do tipo String, mas ele é um vararg. Isso significa que vou poder receber quantas mensagens eu quiser, desde que todas sejam do mesmo tipo, String.
    for (m in messages) println(m)                                      // Numa única linha, fizemos um for, um laço, e estamos imprimindo as mensagens que estão chegando.
    }

    printAll("Hello", "Hallo", "Salut", "Hola")                         // 2 Strings passadas como parâmetro
    
    fun printAllWithPrefix(vararg messages: String, prefix: String) {   // 3 Argumento nomeado    prefix: String
        for (m in messages) println(prefix + m)                         // O println imprime o prefixo e concatena com as "messages"
    }
    printAllWithPrefix(
        "Hello", "Hallo", "Salut", "Hola",                              // Todas as saudações chegando como primeiro parâmetro que serão atribuídas ao array de messages (vararg messages: String
        prefix = "Greeting: "                                           // 4 O prefix está recebendo a outra String
    )
     
    fun Log(vararg entries: String) {                                   // Se você tiver uma função que vai chamar outra, que também é um vararg, você...
        printAll(*entries)                                              // .. precisa colocar * no seu parâmetro "entries" pra você não passar "*entries" como um array e sim como o vararg que você deseja como ele seja.
                                                                        // se não colocar o *, vai passar como array
                                                                        // se colocar o *, vai passar como um vararg do próximo método que vai utilizá-lo, que é o printAll que também está esperando um vararg.
    }
    Log("Hello", "Hallo", "Salut", "Hola")                              // Também podemos fazer uma chamada com o Log                                               
}   
