//kotlin strings 

fun main(args: Array<String>) {
    //create variabel with value 
    var name = "salahudin"
    //create string without value
    val age : Int ; 
    age = 10; 
    //access string / access element string / akses huruf string maybe ? 
    var greeting = "Hello!"
    val myLongName = "Muhammad Salahudin Al Ayyubi"
    val foox = "Hello World"
    println(name) 
    println(age)
    println(greeting[1]) // akan menghasilkan output huruf e
    println(myLongName.length) //unutk mengetahui panjang suatu string 
    println(foox.uppercase()) // akan menjadi huruf kapital semua 
    println(foox.lowercase())// akan menjadi huruf kecil semua 

    println(foox[0].lowercase() + foox.drop(1).uppercase() ); 
    println(greeting.compareTo(foox)) // akan menghasil kan output bernilai 1 yang artinya false (membandingkan )
    println(myLongName.indexOf("Al")) // akan menghasilkan output 19 ( posisi dimana Al itu berada (seperti iindex array ))
    println("$greeting,$myLongName welcome back!! ")

}