package Latihan;

import java.util.InputMismatchException;
import java.util.Scanner;

class konversiWaktu {
    private static void konversiMenit() {
        int jam, menit, hasil;
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan Jam : ");
        jam = scan.nextInt();

        System.out.print("masukan menit : ");
        menit = scan.nextInt();

        hasil = menit + (jam * 60);

        System.out.println("menit : " + hasil);

    }

    private static void app() {
        int menuApp = 0;
        int pilih = 0;
        while (menuApp == 0) {
            System.out.println("PROGRAM KONVERSI : ");
            System.out.println("1.Konversi ke menit");
            System.out.println("3.Detik ke hari ");
            System.out.println("exit");
            System.out.print("Masukan nomor menu : ");
            Scanner input = new Scanner(System.in);
            try {
                pilih = input.nextInt();
                menuApp = 1;
            } catch (InputMismatchException e) {
                System.out.println("Masukan ang benar !!");
                menuApp = 0;
            }
            pilihan(pilih);
            System.out.println("");
        }
    }

    private static void pilihan(int pilih) {
        switch (pilih) {
            case 1:
                konversiMenit();
                break;
            case 2:
                detikKeHari();
                break;
            case 3:
                exit();
                break;
        }
    }

    private static void exit() {
        String keluar = "y";
        System.out.println("apakah anda ingin keluar ?(y/t) : ");
        keluar = new Scanner(System.in).nextLine();
        if (keluar.equalsIgnoreCase("Y")) {
            System.exit(0);
        } else {
            app();
        }
    }

    private static void detikKeHari() {
        int detik , jam , hari , bil,menit  ; 
         Scanner scan = new Scanner(System.in) ; 
         System.out.print("Masukan detik : ") ; 
         bil = scan.nextInt(); 

         detik = bil % 60 ; 
         bil = bil / 60 ; 

         menit = bil % 60 ; 
         bil = bil / 60 ; 

         jam = bil % 24 ; 
         hari = bil / 24 ; 
        
        System.out.println("hasil nya : " + hari +" hari " + jam + " jam " + menit + " menit " + detik + " detik"); 
    }

    public static void main(String[] args) {
        app();
    }
}
