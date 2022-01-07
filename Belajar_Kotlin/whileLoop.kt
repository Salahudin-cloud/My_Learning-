import java.util.Scanner
fun main(args: Array<String>) {
    var hargaBarang:Int; 
    var totalBarang : Int = 0 ; 
    var jawaban : String = "y" ; 
    val scan = Scanner(System.`in`)

    while (jawaban == "y") {
        print("masukan harga barang : ")
        hargaBarang = scan.nextInt()
        totalBarang = totalBarang + hargaBarang 
        print("apakah anda ingin mengulang ?(y/t) : ")
        jawaban = Scanner(System.`in`).nextLine()
       
    }
    println("total barang anda : Rp." + totalBarang)



}