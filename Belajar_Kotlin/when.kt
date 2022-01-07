import java.util.Scanner; 

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`) 
    var day:Int ; 
    print("input number : ")
    day = scan.nextInt()
    when(day) {
        1 -> print("Monday")
        2 -> print("tuesday")
        3 -> print("Wenesday")
        4 -> print("Thursday")
        5 -> print("Friday")
        6 -> print("Saturday")
        7 -> print("Sunday")
        else -> print("error")
    }
}