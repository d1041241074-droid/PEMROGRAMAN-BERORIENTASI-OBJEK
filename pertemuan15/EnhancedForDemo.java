package pertemuan15;

public class EnhancedForDemo {
    public static void main(String[] args) {
        System.out.println("=== DEMONSTRASI ENHANCED FOR ===\n");

        int[] nilai = {85, 90, 78, 92, 88};

        System.out.println("Cara 1: For Klasik");
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Nilai: " + nilai[i]);
        }
        System.out.println();

        System.out.println("Cara 2: Enhanced For");
        for (int n : nilai) {
            System.out.println("Nilai: " + n);
        }
        System.out.println("\n=== MENGHITUNG RATA-RATA ===\n");

        int total = 0;
        for (int n : nilai) {
            total += n;
        }

        double rataRata = (double) total / nilai.length;
        System.out.println("Total: " + total);
        System.out.println("Rata-rata: " + rataRata);

        System.out.println("\n=== ARRAY STRING ===\n");

        String[] mataKuliah = {"Matematika", "Fisika", "Kimia", "Biologi"};

        System.out.println("Daftar Mata Kuliah:");
        for (String mk : mataKuliah) {
            System.out.println("- " + mk);
        }
    }
}

/*Nama: Urai Salwa Kirania Nadia
Nim: D1041241074
Tanggal: Sabtu, 14 Maret 2026
*/