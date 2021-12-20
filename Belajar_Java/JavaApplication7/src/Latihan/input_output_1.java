package Latihan;

import java.util.Scanner; 
public class input_output_1 {
    public static void main(String[] args) {
        String nama; 
        int alamat , umur , gaji ; 

        Scanner scan = new Scanner(System.in); 

        System.out.println("Biodata Pegawai : ");
        System.out.print("Masukan Nama : ");
        nama = scan.nextLine(); 
        System.out.print("Masukan Umur : ");
        umur = scan.nextInt(); 
        System.out.print("Masukan Gaji : ");
        gaji = scan.nextInt(); 

        System.out.println("========================");
        System.out.println("     Biodata Pegawai    ");
        System.out.println("========================");
        System.out.println("Nama : " + nama);
        System.out.println("Umur : " + umur);
        System.out.println("Gaji : Rp." + gaji);

    }
}
