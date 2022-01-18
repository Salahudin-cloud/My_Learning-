package Latihan;

import java.util.Scanner;

public class membalikanKalimat {
    private static void membalikan(String str) {
        char input[] = str.toCharArray();
        char kalimat[] = new char[input.length];
        int i = input.length - 1;
        for (char c : input) {
            kalimat[i] = c;
            i--;
        }
        
        System.out.print(kalimat);
    }

    public static void main(String[] args) {
        String kata;
        System.out.print("masukan kata : ");
        kata = new Scanner(System.in).nextLine();
        membalikan(kata);
    }
}