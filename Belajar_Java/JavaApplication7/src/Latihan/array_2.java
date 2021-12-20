package Latihan;

import java.util.Scanner;
public class array_2 {
    public static void main(String[] args) {
        String nama [] = new String[2]; 

        Scanner scan = new Scanner(System.in); 
        System.out.println("Masukan Nama Mahasiswa :");
        for(int i = 0 ; i < nama.length ; i++) {
            System.out.println("index ke " + i + " :" );
            nama[i] = scan.nextLine(); 
        }
        System.out.println("Daftar Nama Yang diinputkan : ");
        for (String nama_mahasiswa : nama) {
            System.out.println(nama_mahasiswa);
        }
    }
}
