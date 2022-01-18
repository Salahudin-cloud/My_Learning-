package Latihan;

import java.util.Scanner;

public class tumpukanBilangan {
    public static void main(String[] args) {
        int i, j, k, l, n, hasil_1 = 0, hasil_2 = 0, hasil_3 = 0, total;
        System.out.print("masukan nilai : ");
        n = new Scanner(System.in).nextInt();
        for (i = 1; i <= n; i++) {
            // outerloop
            for (j = n; j >= i; j--) {
                // inner loop no 1
                System.out.print(" ");
                hasil_1 = hasil_1 + j;
                // Untuk memberikan spasi ke samping
            }

            for (k = 1; k <= i; k++) {
                // inner loop no 2
                System.out.print("*");
                hasil_1 = hasil_1 + k;
                // menampilkan dari kanan ke kiri
            }
            for (l = 1; l <= i - 1; l++) {
                // inner loop no 3
                System.out.print("*");
                hasil_1 = hasil_1 + l;
                // menampilkan dari kiri ke kanan
            }
            System.out.println();

            // Memberikan baris baru atau enter pada
        }
    }
}
