package Latihan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class input_output_2 {
    public static void main(String[] args) throws IOException {
        String nama; 
        //membuat object input stream reader 
        InputStreamReader isr = new InputStreamReader(System.in); 
        //membuat object buffered reader 
        BufferedReader br = new BufferedReader(isr); 
        System.out.print("Nasukan Nama : ");
        nama =  br.readLine();
        //menampilkan output 
        System.out.println("Nama : " + nama);
    }
}
