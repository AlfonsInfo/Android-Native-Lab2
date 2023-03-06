package Idioms
fun main() {

    for (i in 1..5)
    {
        println(i)
    }

    for(i in 6 until 10){
        println(i)
    }

    for(x in 10..20 step 2)
        println(x)
    //harus didefinisikan sebagai iterator baru bisa gunakan it.
    val iterator = (1..10).iterator()
    iterator.forEach {
        println("data $it")
    }

}



//next when, ranges, null check




