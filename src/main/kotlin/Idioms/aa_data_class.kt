package Idioms

fun main() {
    var customer = Customer("alfons", "alfons@gmail.com")
    println(customer.toString()) // class -> string code, data class -> print property
    val (name , email ) = customer // data class can be destructed
    println(name)
    println(email)
    //data class contains internal code which we have to override in equals, hashCode, toString()
}

//data class must be decalred with at least one primary constructor , normal class can declared without params
//data class have dafault implementations for toString(), hasCode, copy()
//can not extended by another class

class Customer2(){}
data class Customer(val name: String, val email: String)
{

}



//next when, ranges, null check




