// Desafio de Código: Singleton
// Padronizando um Sistema de Gerenciamento de Usuários
// https://web.dio.me/coding/desafio-de-codigo-padronizando-um-sistema-de-gerenciamento-de-usuarios/algorithm/padronizando-um-sistema-de-gerenciamento-de-usuarios?back=/track/desenvolvimento-backend-com-kotlin&tab=undefined&moduleId=undefined

/*

 Intermediário	               Estrutura de Dados

Descrição
O Singleton é uma abordagem de design de software que visa assegurar a existência de apenas uma instância de uma classe e fornecer um ponto centralizado para acessá-la. Isso é especialmente benéfico em contextos nos quais é desejável manter uma única ocorrência de uma classe responsável pelo controle de um recurso compartilhado, como configurações, conexões de banco de dados ou caches.

Neste desafio, você deve criar um sistema de gerenciamento de usuários que permita adicionar e listar usuários. Você tem a opção de implementar o padrão Singleton para garantir que haja apenas uma instância do gerenciador de usuários em toda a aplicação. No entanto, a implementação do padrão Singleton é opcional e você pode optar por seguir uma abordagem diferente para resolver o desafio, se preferir.

Especificações do Desafio:

1. Crie uma classe User com os seguintes atributos: id (inteiro) e name (string).
2. Implemente uma classe UserManager que siga o padrão Singleton. Esta classe deve possuir as seguintes funcionalidades:
   a. Adicionar um novo usuário ao sistema, recebendo o nome como entrada.
   b. Listar todos os usuários cadastrados.
3. No programa principal (main), siga as etapas abaixo:
   a. Solicite ao usuário a quantidade de usuários que deseja cadastrar.
   b. Peça ao usuário para informar os nomes dos usuários, um por linha.
   c. Após receber os nomes e cadastrar os usuários, liste os usuários cadastrados.

Entrada
Um número inteiro representando a quantidade de usuários que o usuário deseja cadastrar.

Para cada usuário a ser cadastrado, uma string contendo o nome do usuário.

Saída
Uma lista com os nomes dos usuários cadastrados.

Exemplos
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

Entrada     Saída
2
Ada	        1 - Ada
Linus	    2 - Linus

3
Grace	    1 - Grace
Alan	    2 - Alan
Steve	    3 - Steve

4
Tim	1 - Tim
Margaret	2 - Margaret
John	    3 - John
Richard	    4 - Richard


Nota:
A implementação do padrão Singleton traz uma abordagem centralizada, com uma única instância do gerenciador de entidades, favorecendo a consistência dos dados e facilitando o acesso global. Por outro lado, optar por não usar o padrão permite maior flexibilidade, possibilitando várias instâncias independentes. A escolha depende das demandas do projeto, design e manutenção. Isso garante adaptabilidade entre diferentes linguagens ou contextos.

Caso queira saber mais sobre o Design Pattern Singleton:
https://refactoring.guru/pt-br/design-patterns/singleton

 */



/* 
// Esse código funciona perfeitamente no VSCode
 
 class User(val id: Int, val name: String)

 object UserManager {
     private val users = mutableListOf<User>()
 
     fun addUser(name: String) {
         val id = users.size + 1
         val newUser = User(id, name)
         users.add(newUser)
     }
 
     fun listUsers() {
         if (users.isEmpty()) {
             println("Nenhum usuário cadastrado.")
         } else {
             println("Usuários cadastrados:")
             for (user in users) {
                 println("${user.id} - ${user.name}")
             }
         }
     }
 }
 
 fun main() {
     println("Quantidade de usuários a cadastrar:")
     val quantity = readLine()?.toIntOrNull() ?: 0
 
     for (i in 1..quantity) {
         println("Informe o nome do usuário $i:")
         val name = readLine() ?: ""
         UserManager.addUser(name)
     }
 
     UserManager.listUsers()
 }

*/
 



// Esse código funciona perfeitamente no ambiente de Teste da DIO

// Desafio de Código: Singleton
// Padronizando um Sistema de Gerenciamento de Usuários
// https://web.dio.me/coding/desafio-de-codigo-padronizando-um-sistema-de-gerenciamento-de-usuarios/algorithm/padronizando-um-sistema-de-gerenciamento-de-usuarios?back=/track/desenvolvimento-backend-com-kotlin&tab=undefined&moduleId=undefined

class User(val id: Int, val name: String)

object UserManager {

  private val users = mutableListOf<User>()

  fun addUser(name: String) {
    val newId = users.size + 1
    val newUser = User(newId, name)
    users.add(newUser)
  }

  fun listUsers() {
    for ((index, user) in users.withIndex()) {
      println("${index + 1} - ${user.name}")
    }
  }

  fun clearUsers() {
    users.clear()
  }
}

fun main() {
  val quantity = readLine()?.toIntOrNull() ?: 0

  // Limpa a lista de usuários antes de cada teste
  UserManager.clearUsers()

  for (i in 1..quantity) {
    val name = readLine() ?: ""
    UserManager.addUser(name)
  }

  UserManager.listUsers()
}

