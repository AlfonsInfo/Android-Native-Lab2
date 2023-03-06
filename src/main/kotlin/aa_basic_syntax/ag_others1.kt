package aa_basic_syntax

import java.io.File

fun main() {
    //Singleton
    println(Resource.databaseId)

    //if not_null_shorthand
    val files =File("Test").listFiles()
    //short hand if not null
    println(files?.size)
    //versi panjangnya
    if(files == null)
    {
        println("null")
    }else{
        println(files)
    }

    //Execute if not null
    var valueData: Int
    valueData = 20
    valueData?.let {
        println(it.toString())
    }
    //valueData = null
    //swap two variables
    var a = 10
    var b = 20
    a = b.also { b= a } // a sama dengan b begitu juga dengan b sama dengan a
    var data1 = listOf<String>("ayam","babi")
    var data2 = listOf<String>("mantap", "jiwa") //tipe harus sama
    data1 = data2.also { data2 = data1 }
    println(data1)
    println(data2)

    TODO("Mark code as Incomplete")

}


object Resource{
    const val databaseId = "dsdmadsa"
}