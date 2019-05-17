package exercicios

fun main(args:Array<String>){

    println("${VERMELHO}----------------------------------------")
    println("           DOIS VALORES")
    println("----------------------------------------")
    print("${BRANCO}VALOR 1:")
    val n1: Int= readLine()!!.toInt()

    print("${BRANCO}VALOR 2:")
    val n2:Int = readLine()!!.toInt()
    var soma:Int = n1+n2
    var sub:Int = n1-n2
    var mult:Int = n1*n2
    var div:Float = n1.toFloat()/n2
    var mod:Int = n1%n2

    println("${AMARELO}---------------RESULTADOS---------------")
    println("Soma:              $AZUL$n1 + $n2 = $AMARELO$soma")
    println("Subtraçao:         $AZUL$n1 - $n2 = $AMARELO$sub")
    println("Multiplicacao:     $AZUL$n1 * $n2 = $AMARELO$mult")
    println("Divisao:           $AZUL$n1 / $n2 = $AMARELO$div")
    println("Modulo:            $AZUL$n1 % $n2 = $AMARELO$mod")
    println("----------------------------------------")

    }