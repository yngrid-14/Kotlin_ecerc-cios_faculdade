fun main(){
    print("Dinheiro em sua carteira: R$")
    val reais = readln().toFloat()
    val saldo = reais/5.81
    println("Conversão para dólares: US$${"%.2f".format(saldo)}.Cotação: US$5,81")
}