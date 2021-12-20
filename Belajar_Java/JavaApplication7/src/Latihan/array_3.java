package Latihan;

import java.util.Scanner;
public class array_3 {
    public static void main(String[] args) {
        String tempat_duduk[][] = new String[2][3];
        Scanner scan = new Scanner(System.in); 

        for(int i = 0 ; i < tempat_duduk.length; i++) {
            for(int j = 0 ; j < tempat_duduk[i].length ; j++) {
                System.out.format("masukan nama unutk duduk di (%d,%d) : ",i,j);
                tempat_duduk[i][j] = scan.nextLine();  
            }
        }
       //menampilkan array 
        for( int i = 0 ; i < tempat_duduk.length ; i++) {
            for(int j = 0 ; j < tempat_duduk[i].length ; j++){
                System.out.format("|%s|\t",tempat_duduk[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");
    }
}
