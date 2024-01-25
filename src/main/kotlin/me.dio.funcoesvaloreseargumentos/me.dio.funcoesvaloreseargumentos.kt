package me.dio.funcoesvaloreseargumentos

fun printMessage(message: String): Unit {								// 1 Função printMessage, parâmetro (message: String). Recebe como parâmetro,um texto. :Unit define o tipo de retorno de uma função. Essa 1ª função, não retorna nada, aí você tem duas opções: retira o :Unit e informa que não retorna nada ou coloca :Unit e informa que retorna qualquer coisa, como se fosse uma unidade que também pode ser nada.                                       
	println(message)													//   Imprimindo a mensagem como parâmetro.
}

fun printMessageWithPrefix(message: String, prefix: String = "Info") {	// 2 Não precisa definir o :Unit, como nesse exemplo. Nesse caso, o :Unit está sendo definida de maneira implícita. Imprimir mensagem com prefixo.                                                
    println("[$prefix] $message")										// Interpolação de strings: Usa uma variável dentro de uma string. Interpolação de string de maneira elegante.                                       
}

fun sum(x: Int, y: Int): Int {			// função em várias linhas		// 3 Função soma recebe x e y do tipo Int. Função com return (retorno)
    return x + y														// e retorna Int também
}
    
fun multiply(x: Int, y: Int) = x * y	// função em uma só linha		// 4 Inline function: Está sendo definida em uma única linha.

fun main() {															// Função main() que vai executar os trechos de códigos abaixo:
printMessage("Hello")													// 5 Imprime Hello 
printMessageWithPrefix("Hello", "Log")									// 6 Vai imprimir o conteúdo da variável [$prefix] e depois vai imprimir a $message
printMessageWithPrefix("Hello")											// 7 Usa o valor padrão do parâmetro prefix:
printMessageWithPrefix(prefix = "Log", message = "Hello")				// 8 Usar parâmetros nomeados para inverter a ordem de passagem dos parâmetros.
println(sum(1, 2))														// 9 Função soma de 2 números inteiros
println(multiply(2,4))													// 10 Função multiplica 2 números inteiros

}
