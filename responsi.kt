import java.util.*

fun main(args: Array<String>) {
    val dataMasuk = Scanner(System.`in`)
    val pangkat = 2

    print("Masukan panjang: ")
    val p = dataMasuk.nextInt()
    print("masukkan lebar: ")
    val l = dataMasuk.nextInt()

    val luas = p * l
    val keliling = pangkat * (p * l)

    println("keliling Persegi panjang : $keliling") //hasil keliling
    println("luas Persegi panjang : $luas")//halis luas

}