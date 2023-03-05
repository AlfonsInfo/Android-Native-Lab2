fun main() {
    //Standard output
    println("Hello World!")


    // Function
    fun sum (a :Int , b: Int) : Int = a + b
    val contentSum = sum(2,3)
    println(contentSum)
    contentSum2(2,4)

    fun printSum(a : Int, b: Int): Unit{
        print("a bernilai $a dan b benrilai $b")
        //Unit type is what you return from a function that doesn't return anything of interest.
        //you should using java if you using Java-Library
    }

    printSum(3,4)
    print(printSum(2,3)) // kotlin unit
}

//Function bisa ditaruh didalam maupun diluar main
fun contentSum2(a : Int, b: Int){
    print(a+b)
}
