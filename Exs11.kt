fun main(){
    print("Altura: ")
    val altura = readln().toFloat()
    print("Largura: ")
    val largura = readln().toFloat()

    val area = altura * largura
    val tinta = area / 2

    println("Área a ser pintada: $area metros quadrados")
    println("Quantidade de tinta necessária: $tinta litros")


}