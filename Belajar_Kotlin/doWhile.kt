import java.util.Scanner

fun main(args: Array<String>) {
    var jawaban:String ; 
    var angka:Int ;
    var total : Int = 0  ;  
    do{
        print("masukan angka : ")
        angka = Scanner(System.`in`).nextInt()
        total = total + angka
        print("apakah anda ingin mengulang ? : ")
        jawaban = Scanner(System.`in`).nextLine()
    }while(jawaban == "y" )
     
    println(total)
}