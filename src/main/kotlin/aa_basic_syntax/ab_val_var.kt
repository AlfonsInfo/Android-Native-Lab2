package aa_basic_syntax

fun main() {
    // ----------------VAL----------------------------------------------------
    //Read-only variable are defined using keyword val
    //val a; Must have type annotation(tipe data) atau di inisialisasi nilai awal
    val b = 3 // otomatis int
    val c : Int // ngga error
    //print(c) // ini error karena ngga ada inisialisasinya
    c = 3 // cuman bisa di assign 1 kali ( deklarasi variable dan inisialisasi bisa dilakukan terpisah)
    print(b)
    print(c)
    //-----------------------VAR-----------------------------------------------
    //var x //harus ditentukan tipenya atau initnya berlaku juga untuk var
    var x = 5
    print(x) // redudant terjadi ketika ada perubahan tetapi kondisi sebelum perubahan tidak diperlukan
    x = 6
    print(x)

}

