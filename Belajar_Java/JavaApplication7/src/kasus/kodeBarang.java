package kasus;

import java.util.Scanner;
import java.util.ArrayList;

public class kodeBarang {
    private static void inputBarang() {
        ArrayList kodeBarang = new ArrayList();
        String namaBarang;
        String inputUser;
        String jawaban;
        int jumlahBarang;
        int hargaBarang = 0;
        int x = 7;
        int loop = 0;
        for (int i = 1; i <= x; i++) {
            kodeBarang.add("KRS00" + i);
        }
        Scanner scan = new Scanner(System.in);
        while (loop == 0) {
            System.out.print("masukan kode barang : ");
            inputUser = new Scanner(System.in).nextLine();
            if (kodeBarang.contains(inputUser)) {
                if (inputUser.equalsIgnoreCase("KRS001")) {
                    System.out.print("masukan jumlah barang : ");
                    jumlahBarang = scan.nextInt();
                    namaBarang = "Kursi Plastik NAPOLY";
                    hargaBarang = jumlahBarang * 75000;

                    System.out.print("apakah anda ingin mengulang ?(y/t)  : ");
                    jawaban = new Scanner(System.in).nextLine();
                    if (jawaban.equalsIgnoreCase("y")) {
                        loop = 0;
                    } else {
                        proses(hargaBarang, namaBarang);
                        loop = 1;
                    }

                } else if (inputUser.equalsIgnoreCase("KRS002")) {
                    System.out.print("masukan jumlah barang : ");
                    jumlahBarang = scan.nextInt();
                    namaBarang = "kursi CHITOSE tanpa meja ";
                    hargaBarang = jumlahBarang * 350000;
                } else if (inputUser.equalsIgnoreCase("KRS003")) {
                    System.out.print("masukan jumlah barang : ");
                    jumlahBarang = scan.nextInt();
                    namaBarang = "Kursi CHITOSE dengan meja";
                    hargaBarang = jumlahBarang * 600000;
                } else if (inputUser.equalsIgnoreCase("KRS004")) {
                    System.out.print("masukan jumlah barang : ");
                    jumlahBarang = scan.nextInt();
                    namaBarang = "Meja Komputer seri A";
                    hargaBarang = jumlahBarang * 500000;
                } else if (inputUser.equalsIgnoreCase("KRS005")) {
                    System.out.print("masukan jumlah barang : ");
                    jumlahBarang = scan.nextInt();
                    namaBarang = "Meja Komputer seri B";
                    hargaBarang = jumlahBarang * 750000;
                } else if (inputUser.equalsIgnoreCase("KRS006")) {
                    System.out.print("masukan jumlah barang : ");
                    jumlahBarang = scan.nextInt();
                    namaBarang = "Meja belajar standar ";
                    hargaBarang = jumlahBarang * 450000;
                } else if (inputUser.equalsIgnoreCase("KRS007")) {
                    System.out.print("masukan jumlah barang : ");
                    jumlahBarang = scan.nextInt();
                    namaBarang = "Meja belajar variasi ";
                    hargaBarang = jumlahBarang * 750000;
                } else {
                    loop = 0;
                }
            } else {
                loop = 0;
            }
        }
    }

    private static void kasir() {
        int x = 1;
        ArrayList kodeKasir = new ArrayList();
        String namaKasir;
        String kode;
        Scanner scan = new Scanner(System.in);
        for (int i = 1; i <= 4; i++) {
            kodeKasir.add("K0" + i);
        }
        System.out.print("masukan kode kasir : ");
        kode = scan.nextLine();
        if (kodeKasir.contains(kode)) {
            if (kode.equalsIgnoreCase("K01")) {
                namaKasir = "Dina";
            } else if (kode.equalsIgnoreCase("K02")) {
                namaKasir = "Bayu";
            } else if (kode.equalsIgnoreCase("K03")) {
                namaKasir = "Silvia";
            } else if (kode.equalsIgnoreCase("K04")) {
                namaKasir = "David";
            } else {
                System.exit(0);
            }
        } else {
            System.out.println("Kode tidak terdaftar !");
            System.exit(0);
        }

    }

    private static void proses(int hargaBarang, String namaBarang) {

    }

    public static void main(String[] args) {
        inputBarang();
    }

}
