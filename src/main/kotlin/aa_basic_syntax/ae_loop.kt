package aa_basic_syntax

fun main() {
    val items = listOf<String>("apple", "banana", "kiwifruit")
    for(item in items)
    {
        println(item)
    }
    for(index in items.indices)
    {
        println("item at $index is ${items[index]}")
    }

}






