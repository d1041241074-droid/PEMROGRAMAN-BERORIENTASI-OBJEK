package pertemuan13;

public class ArrayOneDimension {
    public static void main(String[] args) {
        System.out.println("=== ARRAY 1 DIMENSI ===\n");

        int[] angka = {10, 20, 30, 40, 50};

        System.out.println("Panjang array: " + angka.length);
        System.out.println();

        System.out.println("Elemen pertama (indeks 0): " + angka[0]);
        System.out.println("Elemen pertama (indeks 2): " + angka[2]);
        System.out.println("Elemen pertama (indeks 4): " + angka[4]);
        System.out.println();

         System.out.println("Semua elemen array: ");
         for(int i = 0; i < angka.length; i++) {
            System.out.println("Indeks " + i + ": " + angka[i]);
        }
        System.out.println();

        String[] nama = {"Andi", "Budi", "Citra", "Deni"};

        System.out.println("Daftar Nama:");
        for (int i = 0; i < nama.length; i++) {
            System.out.println((i+1) + ". " + nama[i]);
        }
    }
}

/*Nama: Urai Salwa Kirania Nadia
Nim: D1041241074
Tanggal: Jumat, 13 Maret 2026
*/