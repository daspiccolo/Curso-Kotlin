package exercicios

import org.omg.CORBA.INTERNAL
import java.lang.Math.pow


fun main(args:Array<String>){

    println("${VERMELHO}----------------------------------------")
    println("           CALCULO POTENCIA")
    println("----------------------------------------")
    print("${BRANCO}Base:")
    val n1: Double= readLine()!!.toDouble()
    print("${BRANCO}Expoente:")
    val n2: Double= readLine()!!.toDouble()
    var pot:Double = pow(n1,n2)

    println("${AMARELO}---------------RESULTADOS---------------")
    println("O numeros digitados foram $n1 e $n2")
    println("A potencia é $pot")
    println("----------------------------------------")

}