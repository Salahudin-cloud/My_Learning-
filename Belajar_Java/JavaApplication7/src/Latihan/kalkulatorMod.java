package Latihan;

import java.util.Scanner;

public class kalkulatorMod {
    public static void main(String[] args) {
        int angka, hasil , jam ;

        Scanner scan = new Scanner(System.in);
        System.out.print("masukan angka : ");
        angka = scan.nextInt();

        hasil = angka %  24  ;
        System.out.println(hasil);

    }
}
