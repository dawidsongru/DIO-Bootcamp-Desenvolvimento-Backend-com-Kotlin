// Desafio de Código: Utilizando a Keyword Object com Orientação a Objetos (OO)
// Cálculo Salarial
// https://web.dio.me/coding/utilizando-a-keyword-object-com-orientacao-a-objetos-oo/algorithm/calculo-salarial?back=/track/desenvolvimento-backend-com-kotlin&tab=undefined&moduleId=undefined

object ReceitaFederal {
    fun calcularImposto(salario: Double): Double {
      val aliquota = when (salario) {
        in 0.0..1100.0 -> 0.05
        in 1100.01..2500.0 -> 0.10
        else -> 0.15
      }
      return aliquota * salario
    }
  }
  
  fun main() {
    val valorSalario = readLine()!!.toDouble()
    val valorBeneficios = readLine()!!.toDouble()
  
    val valorImposto = ReceitaFederal.calcularImposto(valorSalario)
    val saida = valorSalario - valorImposto + valorBeneficios
  
    println("%.2f".format(saida))
}
