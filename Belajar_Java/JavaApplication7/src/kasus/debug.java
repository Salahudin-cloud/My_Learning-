package kasus;

import java.util.Scanner; 
public class debug {
    public static void main(String[] args) {
        int x = 10 ; 
        int y = 20 ; 
        String input ; 
        Scanner scan = new Scanner(System.in); 
        if (x > 5 ) {
            if(y > 10) {
                System.out.println("masukan nama : "); 
                input = scan.nextLine(); 
                System.out.println(input); 
            }
        }
    }
}
