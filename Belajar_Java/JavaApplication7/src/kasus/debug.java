package kasus;

import java.util.Scanner;

public class debug {
    public static void main(String[] args) {
        String input;
        System.out.printf("masukan angka(tanpa spasi) : ");
        input = new Scanner(System.in).nextLine();
        char kata;
        int i = input.length() - 1;
        for (int j = i; j >= 0; j--) {
            kata = input.charAt(j);
            System.out.print(kata);
        }
    }
}
