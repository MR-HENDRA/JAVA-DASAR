package tutorial;

import java.util.Scanner;

public class Input {
    
    public static void main(String[] args) {
        Scanner input  = new Scanner (System.in);
        System.out.print("Masukkan Nama Anda: ");
        String nama = input.nextLine();
        System.out.println("Selamat Datang "+ nama);
        System.out.print("Masukkan Umur Anda: ");
        int umur = input.nextInt();
        System.out.println("Wah, Selamat Anda Sudah berusia "+umur+" tahun");
    }
    
}
