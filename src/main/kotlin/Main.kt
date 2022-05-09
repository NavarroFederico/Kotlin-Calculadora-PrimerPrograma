import kotlin.math.PI
import kotlin.math.pow
import kotlin.random.Random
import kotlin.random.nextInt

fun main(args: Array<String>) {
    println("Hello World!")
//    val isUnit = println("This is an expression")
//    println(isUnit)
    //1
    //printDayMonth(readLine(), readLine(), readLine())
    //2
    //calculateSquare(readln().toInt())
    //3
    // println(calculateAreaOfRectangle(base=10.0, height = 2.0))
/*  EJEMPLO DE LA DIAPOSITIVA
    var dirtLevel =20
    //val water={level:Int->level/2}//Simplificado
    val waterFilter:(Int)-> Int = {level->level/2}
    println(waterFilter(dirtLevel))
*/

    //4-FUNCIONES LAMBDAS
    val velocidad = { distance: Double, tempo: Double -> (distance / tempo) }
    val distancia = { velocity: Double, tempo: Double -> velocity * tempo }
    val tiempo = { distance: Double, velocity: Double -> distance / velocity }

    println(velocidad(10.0, 14.0))
    println(distancia(15.0, 20.0))
    println(tiempo(2.0, 8.0))
    //5
    println("Calculo de velocidad función lambda: ${operacionConEcuaciones(10.0, 14.0, velocidad)}")
    //OTRA FORMA SERIA con una lambda sin definir
    println(
        "Calculo de velocidad funcion lambda: ${
            operacionConEcuaciones(
                10.0,
                14.0
            ) { distance: Double, tempo: Double -> (distance / tempo) }
        }"
    )
    println(
        "Calculo de distancia funcion lambda: ${
            operacionConEcuaciones(
                15.0,
                20.0
            ) { velocity: Double, tempo: Double -> (velocity * tempo) }
        }"
    )
    println(
        "Calculo de tiempo funcion lambda: ${
            operacionConEcuaciones(
                2.0,
                8.0
            ) { distance: Double, velocity: Double -> (distance / velocity) }
        }"
    )
    /* //ejemplo del pdf
    val enc1: (String)->String = {input -> input.toUpperCase()}
    println(encodeMsg("abc",enc1))
*/
    //6
  /*
    println("Calcular el area de un circulo: ${calcularElAreaDelCirculo(4.0) { radio: Double -> (PI * radio.pow(2)) }}")
    val areaDelCirculo = { radio: Double -> (PI * radio.pow(2)) }
    println("Area del circulo ${areaDelCirculo(4.0)}")
*/
    //7
   /* calcularLaCantidadDeDiasDeUnMes("febrero", 2020) { mes: String, anio: Int ->
        if ((anio % 4 == 0) && (anio % 100 != 0) || (anio % 400 == 0) && mes == "febrero") {
            println("El mes $mes tiene 29 dias porque $anio es bisiesto")
        }else{
            when (mes){
                "enero","marzo","mayo","julio","octubre","agosto","diciembre"-> println("El mes $mes tiene 31 dias")
                "abril","junio","septiembre","noviembre"-> println("El mes $mes tiene 30 días.")
                "febrero"->println("El mes $mes tiene 28 días.")
            }
        }}
*/
    //8
    /*
    calcularLaCantidadDeDiasDeUnMes()
    */
    //9
    println("Juego de números aleatorios")
    println("Ingrese un número entre 1 y 100 para adivinar")
    val numeroAleatorio= generarNumeroAleatorio()
    var numeroIngresado= readLine()!!.toInt()

    while (numeroIngresado!=numeroAleatorio){
        if(numeroAleatorio>numeroIngresado){
            println("El número a adivinar es mayor a $numeroIngresado.")
        }else {
            println("El número a adivinar es menor a $numeroIngresado.")
        }
        println("Reingrese nuevamente un número...")
        numeroIngresado=readLine()!!.toInt()
    }
    if (numeroIngresado==numeroAleatorio) println("Felicitaciones Ha adivinado.")

}

fun printHello(name: String?): Unit {
    println("Hi there!$name")
}

fun pruebaDeArgumentosNombrados(loQueQuieras: String) {
    println(loQueQuieras)
}

//
//1
fun printDayMonth(day: String?, month: String?, year: String? = "2022") {
    println("Hoy es $day del mes de $month del año $year")
}

//2
fun calculateSquare(base: Int): Unit = println(base.times(base))

//3
fun calculateAreaOfRectangle(base: Double, height: Double): Double = (base * height)

//5
//FUNCION DE ALTO ORDEN
fun operacionConEcuaciones(num1: Double, num2: Double, funcionEcuacion: ((Double, Double) -> Double)): Double {
    return funcionEcuacion(num1, num2)
}

fun calcularElAreaDelCirculo(radio: Double, calcularArea: (Double) -> Double): Double {
    return calcularArea(radio)
}

fun encodeMsg(msg: String, encode: (String) -> String): String {
    return encode(msg)
}

//7 anio bisiesto
fun calcularLaCantidadDeDiasDeUnMes(mes: String, anio: Int, funcion:((String,Int) -> Unit)):Unit{
 return funcion(mes,anio)
}
fun generarNumeroAleatorio():Int{
    var numeroAleatorio= Random.nextInt(1..100)

    return numeroAleatorio
}

