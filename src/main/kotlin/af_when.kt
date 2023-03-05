fun main() {



    //fungsi yang melakukan konversi semua input menjadi string

    fun describe(obj : Any) : String =
        when(obj) {
            1 -> "One"
            "Hello" -> "Greeting"
            is Long -> "Long"
            !is String -> "Not A String"
            else -> "Unknown"
        }

    println(describe(1))
    println(describe(3))
}



//next when, ranges, null check




