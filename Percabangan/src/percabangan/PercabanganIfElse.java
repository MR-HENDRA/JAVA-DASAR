package percabangan;

import java.util.Scanner;

public class PercabanganIfElse {
    public static void main(String[] args) {
        
        String nama;
        int nilai;
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukkan Nama: ");
        nama = input.nextLine();
        System.out.print("Masukkan Nilai: ");
        nilai = input.nextInt();
        
        if (nilai >= 80) {
            System.out.println("Selamat " + nama + ", Anda Lulus ! ");
        } else {
            System.out.println("Maaf " + nama +", Anda Tidak Lulus !");
        }
        
    }
    
}
