package pertemuan5;

import java.util.Scanner;

public class LatihanBilangan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=== PEMERIKSAAN BILANGAN ===");
        System.out.print("Bilangan: ");
        int number = input.nextInt();
        if (number > 0) {
            System.out.println("Jenis: Bilangan positif");
            String parity = (number % 2 == 0) ? "Genap" : "Ganjil";
            System.out.println("Tipe: " + parity);
        }else if (number < 0) {
            System.out.println("Jenis: Bilangan negatif");
            String parity = (number % 2 == 0) ? "Genap" : "Ganjil";
            System.out.println("Tipe: " + parity);
        }else {
            System.out.println("Jenis: Bilangan nol");
        }
    }
}

/*Nama: Urai Salwa Kirania Nadia
Nim: D1041241074
Tanggal: Kamis, 26 Februari 2026
*/