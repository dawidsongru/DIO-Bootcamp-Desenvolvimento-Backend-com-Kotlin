// Rangers: Loops com Int

package me.dio.rangersloopscomint

fun main() {								

    for(i in 0..3)  print(i)				// 0 até 3, inclusive 3  (condição de menor ou igual a 3)
    println() 	// println pula uma linha	// 0123
    
    for(i in 0 until 3) print(i)			// 0 até 3, exclusive 3  (condição de menor que 3)
    println() 								// 012

    for(i in 2..8 step 2) print(i)			// 2 até 8, pulando 2
    println() 								// 2468

    for(i in 3 downTo 0) print(i)			// de 3 decrementando até 0
    println() 								// 3210
    
    for (i in 0..8 step 2) print(i)			// 0 até 8, pulando 2
    println()								// 02468

    for (i in 0..<8 step 2) print(i)		// 0 até menor que 8, pulando 2
    println()								// 0246

    for (i in 8 downTo 0 step 2) print(i)	// 8 até 0, pulando 2
						                    // 86420 (não precisou pular linha)
}
