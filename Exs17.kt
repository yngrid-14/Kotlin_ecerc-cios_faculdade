fun main(){
    print("Quantos cigarros você fuma por dia? ")
    val qnt = readln().toInt()
    print("Quantos anos você já fumou? ")
    val anos  = readln().toFloat()

    val dias = anos * 365
    val cig_fumados = qnt * dias
    val min_perdidos = 10 * cig_fumados
    val dias_perdidos = min_perdidos/ 1440
    print("Você perdeu $dias_perdidos dias")


}