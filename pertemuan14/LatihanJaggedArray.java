package pertemuan14;

public class LatihanJaggedArray {
    public static void main(String[] args) {
        // Deklarasi dan inisialisasi jagged array
        int[][] jagged = {
            {10, 20}, 
            {30, 40, 50, 60}, 
            {70, 80, 90}
        };

        // Menampilkan isi jagged array
        System.out.println("=== JAGGED ARRAY ===");
        for (int i = 0; i < jagged.length; i++) {
            System.out.print("Baris " + i + " (" + jagged[i].length + " elemen): ");
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