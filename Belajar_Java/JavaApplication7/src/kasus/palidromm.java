package kasus;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class palidromm {
    private static boolean palidrom(String str) {
        int i = 0;
        int j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String input;
        System.out.print("masukan kalimat : ");
        input = new Scanner(System.in).nextLine();

        if (palidrom(input)) {
            System.out.print("ini palidrom");
        } else {
            System.out.print("NO");
        }

    }
}
