package exercicios

import kotlin.math.pow

fun main(args:Array<String>){

    println("${VERMELHO}----------------------------------------")
    println("           CALCULO POTENCIA")
    println("----------------------------------------")
    
    print("${BRANCO}Base:")
    val n1: Double= readLine()!!.toDouble()
    
    print("${BRANCO}Expoente:")
    val n2: Double= readLine()!!.toDouble()
      
    var pot:Float = n1.toFloat().pow(n2)

    println("${AMARELO}---------------RESULTADOS---------------")
    println("O numeros digitados foram $AZUL$n1 e $AZUL$n2")
    println("A potencia é $AZUL$pot")
    println("${AMARELO}----------------------------------------")

}
