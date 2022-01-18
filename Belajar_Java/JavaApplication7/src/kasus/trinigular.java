package kasus;

import java.util.Scanner;

public class trinigular {
    public static void main(String[] args) {
        int i, n, jumlah = 0;
        System.out.print("masukan nilai N : ");
        n = new Scanner(System.in).nextInt();

        for (i = n; i >= 1; i--) {
            jumlah += i;
        }
        System.out.println(jumlah);
    }
}
