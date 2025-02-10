fun main(){
    print("Digite um número: ")
    val num = readLine()!!.toInt()
    val ant = num - 1
    val suc = num + 1
    println("O atecessor e o sucessor de $num é: $ant e $suc")
}