package tutorial;

import java.util.Scanner;

public class Input02 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan Nama Lengkap: ");
        String namaLengkap = input.nextLine();
        System.out.print("Masukkan NIM: ");
        String nim =  input.nextLine();
        System.out.print("Masukkan Status Mahasiswa: ");
        boolean status = input.nextBoolean();
        System.out.print("Masukkan Angkatan: ");
        long angkatan = input.nextLong();
        System.out.print("Masukkan Tanggal Lahir -just date: ");
        short tanggalLahir = input.nextShort();
        System.out.print("Masukkan Bulan Lahir -just month: ");
        byte bulanLahir = input.nextByte();
        System.out.print("Masukkan Tahun Lahir -just year: ");
        int tahunLahir = input.nextInt();
        System.out.print("Masukkan Tinggi Badan: ");
        float tinggiBadan = input.nextFloat();
        System.out.print("Masukkan Berat Badan: ");
        double beratBadan = input.nextDouble();

        System.out.println("--------------------------------------------");
        System.out.println("BIODATA MAHASISWA UNSULBAR");
        System.out.println("Nama Lengkap: " + namaLengkap);
        System.out.println("NIM: " + nim);
        System.out.println("Mahasiswa Aktif: " + status);
        System.out.println("Angkatan: " + angkatan);
        System.out.println("Tanggal Lahir: " + ", " + tanggalLahir + "-" + bulanLahir + "-" + tahunLahir);
        System.out.println("Tinggi Badan: " + tinggiBadan + " cm");
        System.out.println("Berat Badan: " + beratBadan + " kg");
        System.out.println("--------------------------------------------");
    }
    
}
