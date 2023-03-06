package Idioms
fun main() {

    val email = listOf<String>(
        "alvonsus.setiawan@gmail.com",
        "200710541@students.uajy.ac.id",
        "itsmealfons@gmail.com",
        "xi.a.alfonsussetiawan@gmail.com",
        "alfonsussetiawanjacub@gmail.com"
    )

    if("alvonsus.setiawan@gmail.com" in email)
    {
        println("ketemu")
    }
    if("alvonsus" in email)
    {
        println("ketemu lagi")
    }
}



//next when, ranges, null check




