import java.util.Scanner
fun main(args: Array<String>) {
var rambu:String; 
var jawaban : String = "y" ; 
val scan = Scanner(System.`in`)

while (jawaban == "y") {
    print("masukan warna rambu : ")
    rambu = scan.nextLine()
    
    if (rambu == "merah" ){
        println("berhenti")
    }else if (rambu == "hijau") {
        println("jalan")
    }else {
        println("hati hati")
    }

    print("apakah anda ingin mengulang ?(y/t) : ")
    jawaban = scan.nextLine()
}




}