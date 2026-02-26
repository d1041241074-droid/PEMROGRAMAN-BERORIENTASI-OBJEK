package pertemuan7;
import java.util.Scanner;

public class LatihanValidasi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=== VALIDASI NILAI UJIAN ===");
        int nilai;

        do {
            System.out.print("Percobaan input: ");
            nilai = input.nextInt();
            if (nilai < 0 || nilai > 100){
                System.out.println("Error: Nilai harus antara 0-100!");
            }

        } while (nilai < 0 || nilai > 100); // karena bukan sistem menu, jadi saya tidak menggunakan pilihan !=0
            System.out.println("✓ Nilai valid: " + nilai);
    }

}

/*Nama: Urai Salwa Kirania Nadia
Nim: D1041241074
Tanggal: Jumat, 27 Februari 2026
*/
