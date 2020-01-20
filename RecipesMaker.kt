var recetas:MutableList<String> = mutableListOf<String>()
var NomRecetas:MutableList<String> = mutableListOf<String>()

fun main(args: Array<String>)
{
    println("Menu de inicio: ")
    menuImp()
}

fun menuImp()
{
    do
    {
        println("""
         Elige una opcion   
        1.Crear receta
        2.Ver recetas
        3.SALIR
        """.trimIndent())

        println("Seleccione: ")

        val cont: String? = readLine()

        when(cont)
        {
            "1" -> HacerReceta()
            "2" -> VerReceta()
            "3" -> println("Gracias por usar el programas")
            else -> println("Opcion invalida")
        }

    }while (!cont.equals("3"))

}

fun HacerReceta()
{
    val ingredientes: List<String> = listOf("Leche","Harina","Huevos","Agua","Aceite")
    var ingres : String = ""

    println("Nombre de la reseta")

    var nomReceta : String? = readLine()
    NomRecetas.add(nomReceta.toString())
    do{
        println("Elije uno por uno los ingreientes segun el indice")

        for((index,ingre) in ingredientes.withIndex()){
            println("$index: $ingre")
        }

        println("9. Guardar receta")

        val ingreIndex: String? = readLine()

        when(ingreIndex){
            "0" -> ingres += "Leche,"
            "1" -> ingres += "Harina,"
            "2" -> ingres += "Huevos,"
            "3" -> ingres += "Agua,"
            "4" -> ingres += "Aceite,"
            "9" -> recetas.add(ingres)
        }
    }while (!ingreIndex.equals("9"))
}

fun VerReceta()
{
    do{
        println("Recetas")

        for((inde,rece) in recetas.withIndex()){
            println("""
                Receta $inde:
                $rece
            """.trimIndent())
        }

        println("""
             Preciona 1para regresar
        """.trimIndent())

        val espera = readLine()

        when(espera){
            "1" -> println("Regresando..")
            else -> println("Opccion no valida")
        }

    }while (!espera.equals("1"))
}
