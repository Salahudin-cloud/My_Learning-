import java.util.Scanner
fun main(args: Array<String>) {
    var jawab : String = "y" ; 
    var  keluar :String ; 
    while( jawab == "y" ) {
        println("hello world")
        print("ingin mencetak lagi ?(y/t) :")
        jawab = Scanner(System.`in`).nextLine()
        if ( jawab == "t") {
            break 
        }else {
            continue
        }
    }
}