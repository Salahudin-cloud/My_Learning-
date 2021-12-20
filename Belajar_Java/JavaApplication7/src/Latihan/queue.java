package Latihan;

import java.util.Scanner;
import java.util.InputMismatchException;

public class queue {
    //membuat variabel 
    private static int queue[] = new int[5]; 
    private static int counters = 0 ; 

    //mengecek isi antrian / queue 
    private static boolean queueStorage() {
        if(counters < queue.length ) {
            return true ;
        }else {
            return false; 
        }
    }

    //membuat antrian / queue 
    private static void createQueue() {
        int loopX = 0; 
        int alpha = 0; 
        while(loopX == 0 ) {
            System.out.print("Masukan sebuah data(angka) : ");
            Scanner alphaX = new Scanner(System.in); 
            try{
                alpha = alphaX.nextInt();
                loopX = 1; 
            }catch(InputMismatchException e) {
                System.out.print("masukan harus berupa angka !!");
                loopX = 0 ; 
            }
        }
        queue[counters] = alpha ; 
        counters++; 
    }

    //menghapus satu queue / antrian 
    private static void removeQueue() {
        counters -- ;
        for(int i = 0; i < counters ; i++) {
            queue[i] = queue[i + 1 ]; 
        }
        System.out.print("Satu data berhasil dihapus !!");
    }

    //menampilkan data antrian / queue 
    private static void displayQueue() {
        System.out.print("Data dalam queue : ");
        for (int i = 0; i < counters; i++) {
            System.out.print("[" + i + " => " + queue[i] + "]"); 
        }
        System.out.print(" "); 
    }

    //menghapus semua antrian 
    private static void deleteAllQueue() {
        counters = 0 ; 
    }

    //menu program 
    private static void menuProgram() {
        int menuOption = 0 ; 
        int chooseMenu = 0 ; 
        while(menuOption == 0 ) {
            System.out.println("Menu program Queue : "); 
            System.out.println("1.tambah antrian"); 
            System.out.println("2.menghapus 1 antrian"); 
            System.out.println("3.status data antrian"); 
            System.out.println("4.menampikan data  antrian"); 
            System.out.println("5.menghapus seluruh antrian"); 
            System.out.println("6.keluar antrian"); 
            System.out.print("Masukan data pilihan anda(1-5) :"); 
            Scanner choose = new Scanner(System.in);
            try{
                chooseMenu = choose.nextInt(); 
                menuOption = 1; 
            }catch(InputMismatchException e) {
                System.out.print("masukan harus angka!!"); 
                menuOption = 0; 
            }
        }
        System.out.print(""); 
        chooserMenu(chooseMenu); 
    }
    private static void chooserMenu(int chooseMenu) {
        switch (chooseMenu) {
            case 1:
                boolean cek = queueStorage(); 
                if(cek) {
                    createQueue();
                }else{
                    System.out.print("Data penuh silahkan hapus salah satu / semua!!");
                }
                break;
            case 2:
                removeQueue();
                break;
            case 3:
                System.out.println("Status Data Antrian : ");
                System.out.println("Antrian : " + queue.length);
                System.out.println("terisi : " + counters);
                break;
            case 4:
                displayQueue();
                break;
            case 5:
                deleteAllQueue();
                break;
            case 6:
                quitApp();
                break;
        }
        menuProgram();
    }
    private static void quitApp() { 
        String quit = "y"; 
        System.out.print("apakah anda ingin keluar ?(Y/T) : ");
        quit = new Scanner(System.in).nextLine(); 
        if(quit.equalsIgnoreCase("y")) {
            System.exit(0);
        }else{
            menuProgram();
        }
    }

    public static void main(String[] args) {
        menuProgram();
    }
}
