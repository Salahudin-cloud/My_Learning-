package Latihan;

import java.util.Scanner;;

public class reverseInt {
    private static void reverse(int bilangan) {
        int angka[] = new int[bilangan];
        int j = angka.length - 1;
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < angka.length; i++) {
            System.out.print("masukan bilangan : ");
            angka[i] = scan.nextInt();
        }

        for (int x = angka.length - 1; x >= 0; x--) {
            System.out.print(angka[x]);
        }

    }

    public static void main(String[] args) {
        int jumlahInput;
        System.out.println("tidak boleh  mengisi  jumlah : 1 / 0 ");
        System.out.print("masukan berapa angka yang ingin di masukan : ");
        jumlahInput = new Scanner(System.in).nextInt();
        reverse(jumlahInput);
    }
}
