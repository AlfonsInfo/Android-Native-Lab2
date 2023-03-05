fun main() {

    //maxOf(3,4) // fungsi di dalam main bersifat
    fun maxOf(a: Int, b: Int) = if (a>b) print(a) else print(b)
    maxOf(3,4)
    //fungsi di luar bebas di taruh dimana
    maxOf2(2,3)
}

fun maxOf2( a : Int , b : Int): Int
{
    if(a>b){
        return a
    }
    return b
}



