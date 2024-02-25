// Tratamento de Exceções no Kotlin - Exceções Customizadas e Idiomaticas

package me.dio.tratamentodeexcecoesnokotlinexcecoescustomizadaseidiomaticas
                                            // O código idiomático usa os recursos de uma linguagem de programação de um jeito adequado ao problema em questão.
                                            // Ele tende a ser conciso, mais claro, mais legível, fácil de verificar e fácil de expandir.
@Throws(IllegalArgumentException::class)    // lançar uma exceção do tipo IllegalArgumentException. Dessa forma o código fica mais idiomático.
fun vote(name: String, age: Int) {          // função para votar receve nome como String e idade como Inteiro.
    if (age < 16) {                         // criar uma regra. Só permitir o voto se a pessoa tiver 16 anos ou mais
        throw IllegalArgumentException("$name não pode votar.")     // lançar uma exceção padrão
    }
                                            
    println("Voto de $name realizado com sucesso!")
}          

fun main() {
    var quantidadedeVotos = 0;
    quantidadedeVotos += try { vote("Dawidson", 46); 1; } catch (e: IllegalArgumentException) { 0 }     // maior de idade soma 1 voto, caso contrário, 0 votos.
    quantidadedeVotos += try { vote("Maria", 10); 1; } catch (e: IllegalArgumentException) { 0 }        // maior de idade soma 1 voto, caso contrário, 0 votos.
    quantidadedeVotos += try { vote("Renan", 50); 1; } catch (e: IllegalArgumentException) { 0 }        // maior de idade soma 1 voto, caso contrário, 0 votos.
    println(quantidadedeVotos)              // Imprime a quantidade de votos. 
}
