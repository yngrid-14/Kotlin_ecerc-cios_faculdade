fun main(){
    print("Produto: R$")
    val prod = readln().toFloat()
    val desc = prod - (prod*0.05)
    print("O produto com 5% de desconto ficará no valor de R$$desc")

}