// Tipos de Funções Extension Functions e Properties

package me.dio.tiposdefuncoesextensionfunctionseproperties

data class Item(val name: String, val price: Float)                                         // 1 data class item, com nome e preço 

data class Order(val items: Collection<Item>)                                               //   data class order tem uma coleção de ítens, um pedido
                                                                                            // 2 criando extensions functions. this é a forma de chamar essa extension function
fun Order.maxPricedItemValue(): Float = this.items.maxByOrNull { it.price }?.price ?: 0F    //   faz um filtro pelo preço. pegar o preço ?.price, caso não tenha, colocar ?: 0F
fun Order.maxPricedItemName() = this.items.maxByOrNull { it.price }?.name ?: "NO_PRODUCTS"  //   pegar o preço pelo ?.name, caso não tenha, colocar "NO_PRODUCTS"

val Order.commaDelimitedItemNames: String                                                   // 3 declaração da variável imutável commaDelimitedItemNames
    get() = items.map { it.name }.joinToString()                                            // retorna um map passando os nomes concatenados em formato de string
                                                                                            // cria uma propriedade encapsulando com o get.
fun main() {

    val order = Order(listOf(Item("Bread", 25.0F), Item("Wine", 29.0F), Item("Water", 12.0F)))  // lista imutável: pão, vinho e ág ua
    
    println("Max priced item name: ${order.maxPricedItemName()}")                           // 4 chama o nome do produto com maior preço... Item com preço máximo é o vinho.
    println("Max priced item value: ${order.maxPricedItemValue()}")                         //   ... e o valor desse produto. Valor é 29.0
    println("Items: ${order.commaDelimitedItemNames}")                                      // 5 imprime a lista de todos os elementos (produtos)

}
