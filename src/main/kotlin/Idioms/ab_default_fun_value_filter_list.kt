package Idioms
fun main() {
    val bilangan = listOf<Int>(2,3,-1,4,5,3,2,2,32,-2,-4,-5,6,2,32,23,32,3,21,2,1,23,2,32,3,1202020,23230230)
    val bilanganPositif  = bilangan.filter { x->x>0 }
    val bilanganBesar = bilanganPositif.filter{ it > 10 } // merujuk pada setiap nilai pada list.
    println(bilangan)
    println(bilanganPositif)
    println(bilanganBesar)
    //function with default value
    fun foo(a:Int = 0 , b: String = "")
    {
        println(a)
        println(b)
    }
}



//next when, ranges, null check




