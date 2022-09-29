package tutorial;

import java.util.Scanner;


public class NestedIf {
    
    public static void main(String[] args) {
        
        int belanjaan, diskon, bayar;
        String kartu;
        Scanner input = new Scanner (System.in);
        
        System.out.print("Apakah Memiliki Kartu Member: ");
        kartu = input.nextLine();
        System.out.print("Total Belanjaan: Rp. ");
        belanjaan = input.nextInt();
        
        if (kartu.equalsIgnoreCase("ya")) {
            if  (belanjaan >500000) {
                diskon = 50000;
            } else if (belanjaan > 100000) {
                diskon = 15000;
            } else {
                diskon = 0;
            }
        } else {
            if (belanjaan > 100000) {
                diskon = 5000;
            } else {
                diskon = 0;
            }
        }
        
        bayar = belanjaan-diskon;
        
        System.out.println("Total Bayar: Rp. "+bayar );
    }
    
}
