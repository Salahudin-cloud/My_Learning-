package Latihan;

import java.util.Stack;

public class stack_1 {
    public static void main(String[] args) {
        Stack kotor = new Stack<>();
        Stack bersih = new Stack<>();

        for(int i = 1 ; i <= 5 ; i ++ ) {
            kotor.push("piring : " + i); 
        }
        System.out.println("Jumlah piring kotor : " + kotor.size());
        System.out.println("Jumlah piring bersih : " + bersih.size()); 
        System.out.println("piring kotor : ");
        for(int i = 1 ; i <=5 ; i++) {
            System.out.println(kotor.peek());
            bersih.push(kotor.pop()); 
        }
        System.out.println("Jumlah piring kotor : " + kotor.size());
        System.out.println("Jumlah piring bersih : " + bersih.size()); 
        System.out.println("piring bersih : ");
        for(int i = 4 ; i >= 0 ; i --) {
            System.out.println("piring " + bersih.elementAt(i));
        }
        
    }
}
