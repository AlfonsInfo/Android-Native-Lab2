package aa_basic_syntax

fun main() {
    //cara inisialisasi objek disarankan menggunakan val jika tidka pernah di reassign
    val persegi = Persegi(3.0,4.0)

    //access modifier private tersedia di kotlin + ini penerapan string template
    println("panjang ${persegi.getPanjang()}")
    println("lebar ${persegi.lebar}")

    println("luas ${persegi.hitungLuas()}")
    println("lebar ${persegi.hitungKeliling()}")
}

class  Persegi(private var panjang : Double , var lebar  : Double){

    fun hitungLuas() = panjang*lebar
    fun hitungKeliling() = (panjang + lebar)*2

    fun getPanjang() = panjang
}

