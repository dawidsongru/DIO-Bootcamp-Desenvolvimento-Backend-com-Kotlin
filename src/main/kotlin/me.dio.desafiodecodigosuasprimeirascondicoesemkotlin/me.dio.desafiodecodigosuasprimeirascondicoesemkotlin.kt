// Desafio de Codigo: Suas Primeiras Condições em Kotlin
// Média Final do Aluno
// https://web.dio.me/coding/suas-primeiras-condicoes-em-kotlin/algorithm/media-final-do-aluno-1?back=/track/desenvolvimento-backend-com-kotlin&tab=undefined&moduleId=undefined

/* Desafio
Faça um programa que receba a média de um aluno e imprima o seguinte:

Caso a média seja < 5 imprima "REP";
Caso a média seja >= 5 e < 7 imprima "REC";
Caso a média seja >7 imprima "APR".
Entrada
A entrada consiste em vários arquivos de teste, cada um com uma linha, que conterá o valor da média do aluno. Conforme mostrado no exemplo de entrada a seguir.

Saída
Para cada arquivo da entrada, terá um arquivo de saída. E como mencionado no Desafio, será gerado uma linha com a palavra
"Reprovado" caso sua média seja < 5,
"Recuperação" caso sua média seja >= 5 e < 7 e
"Aprovado" caso a média seja > 7. Use o exemplo abaixo para clarear o que está sendo pedido.

Exemplos
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos
e com outros casos possíveis.

Entrada
5.5
8
2

Saída
REC
APR
REP

*/ 

fun main() {
    val media = readLine()!!.toDouble()
  
    when {
      media < 5 -> println("REP")
      media >= 5 && media < 7 -> println("REC")
      else -> println("APR")
    }
  }
