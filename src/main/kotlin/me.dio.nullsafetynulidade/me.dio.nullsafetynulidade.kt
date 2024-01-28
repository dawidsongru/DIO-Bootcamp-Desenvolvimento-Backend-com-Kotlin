// Null Safety Nulidade
package me.dio.nullsafetynulidade

fun describeString(maybeString: String?): String {				// 1 Função chamada describeString que recebe um parâmetro que pode ser nulo String? e retorna uma String também
    if (maybeString != null && maybeString.length > 0) {		// 2 Se o parâmetro for diferente de nulo e for > 0
        return "String of length ${maybeString.length}"			// 3 retorne o tamanho da String
    } else {													// 4 senão
        return "Empty ou null string"							// 5 retorne a mensagem "Empty ou null string"
    }
}


fun main() {													// 3 casos de teste	
    println(describeString(null))								// passar nulo
    println(describeString(""))									// passar vazio
    println(describeString("dio.me"))							// passar string válida
}







// fun main() {
//     var neverNull: String = "This can't be null"			// 1 Informando que essa String não pode ser nula
//  // neverNull = null										// 2 Tentando atribuir um valor nulo para uma variável não nula. Dá erro.

//     var nullable: String? = "You can keep a null here"		// 3 String? Diz explicitamente que a variável aceita String ou valor nulo.
//     nullable = null											// 4 Essa linha não dá erro porque no tipo String tem uma ? que aceita valor nulo.
 
//  //   var inferredNonNull: String? = "The compiler assumes non-null"		// Sem erro.
//     var inferredNonNull = "The compiler assumes non-null"	// 5 Atribuindo uma string e não tipando. O compilador faz uma inferência e entende que essa variável é não nula.    
//  // inferredNonNull = null									// 6 Tentando atribuir um valor nulo para uma variável não nula. Dá erro. 
//  // Quando existe uma inferência e você tenta atribuir algo que vai contar a inferência, dá erro. 

//                                                             // Segurança nula dentro do Kotlin
//     // fun strLength(str: String): Int {	// errado		// 7 Função que está esperando como parâmetro um valor não nulo (notNull: String)
//     fun strLength(str: String?): Int {		// correto
//       // return str.length					// errado		// return notNull.length		errado
//       return str?.length ?: 0				// correto		// return str?.length ?: 0		correto
//     }
    
//     println(strLength(neverNull))							// 8 neverNull vai passar o valor
//     println(strLength(nullable))							// 9 não tenho uma função strLenght que recebe um valor nullable. Dá erro de compilação.
    
// }
