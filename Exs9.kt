fun main(){
    print("Digite uma distância em metros: ")
    val num = readln().toFloat()
    val mili = num*1000
    val cm = num*100
    val km = num/1000

    println("Distância em milimetros: $mili")
    println("Distância em centímetros: $cm")
    println("Distância em kilômetros: $km")


}