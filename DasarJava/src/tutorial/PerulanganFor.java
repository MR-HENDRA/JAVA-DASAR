package tutorial;

import java.util.Scanner;

public class PerulanganFor {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan Batas: ");
        short batas = input.nextShort();
       
       short nilaiAwal;
       
       for (nilaiAwal=1; nilaiAwal<= batas; nilaiAwal ++) {
           System.out.println(nilaiAwal);
        }        
     }
 }
    
