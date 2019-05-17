package exercicios



fun main(args:Array<String>){

    println("${VERMELHO}----------------------------------------")
    println("           NOTAS ESTUDONAUTAS")
    println("----------------------------------------")
    print("${BRANCO}NOTA 1:")
    val n1: Float= readLine()!!.toFloat()
    print("${BRANCO}NOTA 2:")
    val n2: Float= readLine()!!.toFloat()
    val media:Float=(n1+n2)/2

    println("${AMARELO}---------------RESULTADOS---------------")
    println("As notas do aluno foram $n1 e $n2")
    println("A Média final foi $media")
    println("----------------------------------------")

}
