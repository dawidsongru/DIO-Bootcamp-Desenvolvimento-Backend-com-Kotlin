// Classes

package me.dio.classes

class Customer                                  // 1 palavra reservada para definir uma classe: class. Classe Customer, que seria um cliente.

class Contact(val id: Int, var email: String)	// 2 O e-mail está tipado com uma propriedade var, mutável (que pode mudar).

fun main() {
    // val customer = Customer()				// 3 Variável não usada, só exemplifica a criação de um Construtor padrão.

    val contact = Contact(1, "mary@gmail.com")	// 4 Instanciando um outro objeto do tipo Contact

    println(contact.id)							// 5 Imprimir o id
    println(contact.email)						// 5 Imprimir o e-mail

    contact.email = "jane@gmail.com"			// 6 Reatribuir o e-mail
    println(contact.email)						// 6 Reimprimir o e-mail
}
