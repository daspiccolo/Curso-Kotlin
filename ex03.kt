package exercicios
fun main(args:Array<String>){

    println("${VERMELHO}----------------------------------------")
    println("        CADASTRO ESTUDONAUTA")
    println("----------------------------------------")
    print("${BRANCO}Nome do funcionario:")
         val nome: String= readLine()!!

    print("${BRANCO}Ano de Nascimento:")
        val ano:Int = readLine()!!.toInt()

    print("${BRANCO}Salario:")
    val sal:Float = readLine()!!.toFloat()

    println()

    println("${AMARELO}-------------FICHA FUNCIONAL------------")

    println("$AMARELO Nome:     $nome")
    println("$AMARELO Nascimento:     $ano")
    println("$AMARELO Salario:     R$$sal")
    println("$AMARELO----------------------------------------")
}
