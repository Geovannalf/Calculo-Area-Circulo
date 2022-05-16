fun main(args: Array<String>) {
    println("Digite o diâmetro para calcular área e perímetro do círculo: ")
    val diametro = readln().toDouble()

    val raio = diametro / 2
    val area = 3.14 * (raio*raio)
    val perimetro = 2 * 3.14 * raio
    println("A área do círculo é ${area.toInt()} e o perímetro é ${perimetro.toInt()}")
}