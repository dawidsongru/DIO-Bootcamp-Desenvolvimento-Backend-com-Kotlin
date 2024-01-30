package me.dio.genericsclassesgenericas

class MutableStack<E>(vararg items: E) {                // 1 Classe MutableStack, recebe como parâmetro vararg. <E> pode ser qualquer coisa, qualquer tipo.
                                                        //   <E> está como parâmetro genérico da classe MutableStack.
    private val elements = items.toMutableList()
    
    fun push(element: E) = elements.add(element)        // 2 Recebe um elemento do tipo E da pilha que foi instanciada e adiciona esse elemento na lista.

    fun peek(): E = elements.last()                     // 3 Pega o último elemento sem remover. Só observa quem é o último.

    fun pop(): E = elements.removeAt(elements.size - 1) // 4 Pega o último elemento e remove, arranca da pilha.

                                                        // 2, 3, e 4 são as operações mais importantes de pilha.

    fun isEmpty() = elements.isEmpty()                  // 5 Função para verificar se está vazia.

    fun size() = elements.size                          // 6 Função para devolver o tamanho.

    override fun toString() = "MutableStack(${elements.joinToString()})"    // 7 Sobrescrita do método ToString, converter a pilha para texto.
}

fun main() {                                    // fun main(): função principal
    val stack = MutableStack(0.62, 4.14, 2.7)   // É criado uma MutableStack, uma pilha mutável, que inicializa com alguns elementos (0.62, 4.14, 2.7)
    stack.push(9.87)                            // push adiciona mais um elemento na pilha (9.87)
    println(stack)                              // Imprime todos os elementos da pilha (0.62, 4.14, 2.7, 9.87)

    // val stack = MutableStack("A", "B", "C")     // É criado uma MutableStack, uma pilha mutável, que inicializa com alguns elementos (A, B, C)
    // stack.push("D")                             // push adiciona mais um elemento na pilha (D)
    // println(stack)                              // Imprime todos os elementos da pilha (A, B, C, D)

                                                // O primeiro a entrar (9.87), vai ser sempre o último a sair (9.87) da pilha

    println("peek(): ${stack.peek()}")          // Pega o último elemento da pilha, aquele que está no topo (9.87), mas não o remove.
    println(stack)                              // Imprime só esse último elemento do topo da pilha

    for (i in 1..stack.size()) {                // está sendo feito um laço na pilha para fazer o pop dela inteira (remover sempre o último elemento).
                                                // i vai de 1.. até o size (tamamho da pilha), ou seja, vai de 1 até o último elemento da pilha.
        println("pop(): ${stack.pop()}")        // remove cada elemento da pilha, um a um até o final da pilha.
        println(stack)                          // imprime só os elementos restantes.    
    }

}
