
class Perro(val nombre:String, var edad:Int, val raza:String): Animal(false, "Ninguno")
{
    override fun caminar() = println("${this.nombre} dice: Guauu")

    constructor(nombre:String, raza:String):this(nombre, 0, raza)


}