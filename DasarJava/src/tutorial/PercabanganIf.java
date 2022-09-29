package tutorial;

import java.util.Scanner;

public class PercabanganIf {
    public static void main(String[] args) {
        
        // Membuat Variabel dan Scanner 
        int belanja =0;
        Scanner input = new Scanner (System.in);
        
        // Mengambil input 
        System.out.print("Total Belanjaan: Rp. ");
        belanja = input.nextInt();
        
        // Pengecekan Belanjaan
        if (belanja > 200000) {
            System.out.println("Selamat. Anda Mendapatkan Hadiah! ...");
        }
        
        System.out.println("Terima kasih telah berbelanja di toko kami");
    }
    
}
