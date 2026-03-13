package pertemuan14;

public class JaggedArray {
    public static void main(String[] args) {
        System.out.println("=== JAGGED ARRAY ===\n");

        // 1. Deklarasi dan inisialisasi jagged array
        int[][] jagged = {
            {10, 20}, // Baris 0: 2 elemen
            {30, 40, 50, 60}, // Baris 1: 4 elemen
            {70}, // Baris 2: 1 elemen
            {80, 90, 100} // Baris 3: 3 elemen
        };

        // 2. Menampilkan informasi
        System.out.println("Jumlah Baris: " + jagged.length);
        System.out.println();

        // 3. Menampilkan panjang setiap baris
        for (int i = 0; i < jagged.length; i++) {
            System.out.println("Panjang Baris " + i + ": " + jagged[i].length);
        }
        System.out.println();

        // 4. Menampilkan isi jagged array
        System.out.println("Isi Jagged Array:");
        for (int i = 0; i < jagged.length; i++) {
            System.out.print("Baris " + i + ": ");
            for (int j = 0; j < jagged[i].length; j++) {
                System.out.print(jagged[i][j] + " ");
            }
            System.out.println();
        }
    }
}

/*Nama: Urai Salwa Kirania Nadia
Nim: D1041241074
Tanggal: Sabtu, 14 Maret 2026
*/