fun main(){
    print("Quantidade de Km percorridos: ")
    val km = readln().toFloat()
    print("Quantidade de dias alugados: ")
    val dia = readln().toInt()
    val total = (90*dia)+(0.2*km)
    print("O total a pagar pela locação se´ra de R$$total")
}