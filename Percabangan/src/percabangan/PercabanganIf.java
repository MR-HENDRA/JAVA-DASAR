package percabangan;

import java.util.Scanner;

public class PercabanganIf {

    public static void main(String[] args) {
        
        // membuat variabel belanja dan scanner
        int belanja = 0;
        Scanner input = new Scanner (System.in);
        
        // mengambil input
        System.out.print("Total Belanjaan: Rp. ");
        belanja = input.nextInt();
        
        // pengecekan belanjaan
        if (belanja > 200000) {
            System.out.println("Selamat, anda mendapatkan hadiah! ...");
        }
        
        System.out.println("Terima kasih telah berkunjung di toko kami ...");
        
        
        

    }
    
}
