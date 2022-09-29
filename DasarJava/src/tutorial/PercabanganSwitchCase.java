package tutorial;

import java.util.Scanner;

public class PercabanganSwitchCase {
    
    public static void main(String[] args) {
        
        String lampu;
        Scanner input = new Scanner (System.in);
        
        System.out.print("Input nama warna: ");
        lampu = input.nextLine();
        
        switch(lampu){
            case "merah":
                System.out.println("Lampu Merah. Berhenti!");
                break;
                
            case "kuning":
                System.out.println("Lampu Kuning. Harap Hati-Hati!");
                break;
                
            case "hijau":
                System.out.println("Lampu Hijau. Silahkan Jalan");
                break;
                
            default:
                System.out.println("Lampu Salah!");
        }
        
    }
    
}
