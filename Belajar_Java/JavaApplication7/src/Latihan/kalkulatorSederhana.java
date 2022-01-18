package Latihan;

import java.util.Scanner;

public class kalkulatorSederhana {
    public static void main(String[] args) {
        int pilihan;
        int loop = 0;
        int bil1, bil2, hasil;
        String jawaban = "y";
        while (loop == 0) {
            System.out.println("Selamat Datang di program Kalkulatr sederhana !");
            System.out.println("Menu : ");
            System.out.println("1.Pertambahan angka ");
            System.out.println("2.Pengurangan angka ");
            System.out.println("3.Pembagian  angka ");
            System.out.println("4.Perkalian angka");
            System.out.println("5.Sisa bagi angka ");
            System.out.println("6.Keluar aplikasi ");
            System.out.print("Masukan pilihan (1-6) : ");
            pilihan = new Scanner(System.in).nextInt();
            if (pilihan == 1) {
                System.out.print("masukan bilangan 1 : ");
                bil1 = new Scanner(System.in).nextInt();
                System.out.print("masukan bilangan 2 : ");
                bil2 = new Scanner(System.in).nextInt();
                hasil = bil1 + bil2;
                System.out.println("hasil dari " + bil1 + "+" + bil2 + " = " + hasil);
                System.out.print("apakah anda ingin mengulang ?(y/t) : ");
                jawaban = new Scanner(System.in).nextLine();
                if (jawaban.equalsIgnoreCase("y")) {
                    loop = 0;
                } else {
                    loop = 1;
                }
            } else if (pilihan == 2) {
                System.out.print("masukan bilangan 1 : ");
                bil1 = new Scanner(System.in).nextInt();
                System.out.print("masukan bilangan 2 : ");
                bil2 = new Scanner(System.in).nextInt();
                hasil = bil1 - bil2;
                System.out.println("hasil dari " + bil1 + "-" + bil2 + " = " + hasil);
                System.out.print("apakah anda ingin mengulang ?(y/t) : ");
                jawaban = new Scanner(System.in).nextLine();
                if (jawaban.equalsIgnoreCase("y")) {
                    loop = 0;
                } else {
                    loop = 1;
                }
            } else if (pilihan == 3) {
                double hasill;
                System.out.print("masukan bilangan 1 : ");
                bil1 = new Scanner(System.in).nextInt();
                System.out.print("masukan bilangan 2 : ");
                bil2 = new Scanner(System.in).nextInt();
                hasill = bil1 / bil2;
                System.out.println("hasil dari " + bil1 + "/" + bil2 + " = " + hasill);
                System.out.print("apakah anda ingin mengulang ?(y/t) : ");
                jawaban = new Scanner(System.in).nextLine();
                if (jawaban.equalsIgnoreCase("y")) {
                    loop = 0;
                } else {
                    loop = 1;
                }
            } else if (pilihan == 4) {
                System.out.print("masukan bilangan 1 : ");
                bil1 = new Scanner(System.in).nextInt();
                System.out.print("masukan bilangan 2 : ");
                bil2 = new Scanner(System.in).nextInt();
                hasil = bil1 * bil2;
                System.out.println("hasil dari " + bil1 + "x" + bil2 + " = " + hasil);
                System.out.print("apakah anda ingin mengulang ?(y/t) : ");
                jawaban = new Scanner(System.in).nextLine();
                if (jawaban.equalsIgnoreCase("y")) {
                    loop = 0;
                } else {
                    loop = 1;
                }
            } else if (pilihan == 5) {
                System.out.print("masukan bilangan 1 : ");
                bil1 = new Scanner(System.in).nextInt();
                System.out.print("masukan bilangan 2 : ");
                bil2 = new Scanner(System.in).nextInt();
                hasil = bil1 % bil2;
                System.out.println("hasil dari " + bil1 + " mod " + bil2 + " = " + hasil);
                System.out.print("apakah anda ingin mengulang ?(y/t) : ");
                jawaban = new Scanner(System.in).nextLine();
                if (jawaban.equalsIgnoreCase("y")) {
                    loop = 0;
                } else {
                    loop = 1;
                }
            } else if (pilihan == 6) {
                System.out.print("Terima kasih telah menggunakan aplikasi kami!");
                System.exit(0);
            } else {
                System.out.println("Silahkan masukan inputan yang benar !");
                loop = 0;
            }
        }
    }
}
