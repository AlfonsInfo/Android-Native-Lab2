package Idioms
fun main() {

    val map1 = mapOf<String,Any>("nama" to "Alfonsus Setiawan J","umur" to 20, "sekolah" to "Universitas atma jaya")
    val map2 = mapOf<String,Any>("nama" to "Lucas","umur" to 20, "sekolah" to "Universitas atma jaya")
    val map3 = mapOf<String,Any>("nama" to "Ricky","umur" to 20, "sekolah" to "Universitas atma jaya")
    val listOfMap = listOf<Map<String,Any>>(map1,map2,map3)
    for(index in listOfMap.indices){
        println("Nomor ${index + 1} = ${listOfMap[index]["nama"]}")
    }

    val map4 = mapOf<String,Any>("data" to 2)

    for((k,v) in map4)
    {
        println("$k -> $v")
    }
}



//next when, ranges, null check




