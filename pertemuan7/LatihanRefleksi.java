package pertemuan7;

public class LatihanRefleksi {

    public static void main(String[] args) {
        // Menampilkan angka 1 sampai 5 dengan menggunakan while
        int counter = 1; // Inisialisasi
        System.out.println("=== MENGGUNAKAN WHILE ===");
        while (counter <= 5) { 
            System.out.print(counter + " ");
            counter++; // Update
        }

        System.out.println();

        // Menampilkan angka 1 sampai 5 dengan menggunakan do-while
        System.out.println("=== MENGGUNAKAN DO-WHILE ===");
        counter = 1; 
        do {
            System.out.print(counter + " ");
            counter++; // Update
        } while (counter <= 5); // Kondisi

        System.out.println();

        // Menampilkan angka 1 sampai 5 dengan menggunakan for
        System.out.println("=== MENGGUNAKAN FOR ===");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        
    }
}
/*Dari ketiga looping diatas yang paling mudah dipahami adalah loop for, karena strukturnya lebih jelas dan lebih ringkas.
Dalam satu baris sudah terlihat mulai dari nilai awal, batas perulangan, dan proses penambahannya, sehingga alur logikanya lebih mudah dipahami.
for digunakan ketika jumlah perulangan sudah diketahui, misalnya untuk menampilkan angka 1 sampai 5 yang sudah dikerjakan sebelumnya. Dibandingkan dengan while atau do-while yang penulisan terpisah, for lebih mudah dipahami karena lebih sederhana.

Nama: Urai Salwa Kirania Nadia
Nim: D1041241074
Tanggal: Jumat, 27 Februari 2026
*/