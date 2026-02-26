package pertemuan6;

import java.util.Scanner;

public class LatihanBulan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=== KONVERSI BULAN ===");
        System.out.print("Angka Bulan: ");
        int month = input.nextInt();

        switch (month) {
            case 1:
                System.out.println("Nama Bulan : Januari");
                break;
            case 2:
                System.out.println("Nama Bulan : Februari");
                break;
            case 3:
                System.out.println("Nama Bulan : Maret");
                break;
            case 4:
                System.out.println("Nama Bulan : April");
                break;
            case 5:
                System.out.println("Nama Bulan : Mei");
                break;
            case 6:
                System.out.println("Nama Bulan : Juni");
                break;
            case 7:
                System.out.println("Nama Bulan : Juli");
                break;
            case 8:
                System.out.println("Nama Bulan : Agustus");
                break;
            case 9:
                System.out.println("Nama Bulan : September");
                break;
            case 10:
                System.out.println("Nama Bulan : Oktober");
                break;
            case 11:
                System.out.println("Nama Bulan : November");
                break;
            case 12:
                System.out.println("Nama Bulan : Desember");
                break;
            default:
                System.out.println("Error: Angka bulan tidak valid (1-12)");
                break;
        }
    }
}

/*Nama: Urai Salwa Kirania Nadia
Nim: D1041241074
Tanggal: Kamis, 26 Februari 2026
*/