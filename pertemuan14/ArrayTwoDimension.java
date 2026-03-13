package pertemuan14;

public class ArrayTwoDimension {
    public static void main(String[] args) {
        System.out.println("=== ARRAY 2 DIMENSI ===\n");

        // 1. Deklarasi dan inisialisasi array 2D
        int[][] nilai = {
            {85, 90, 78},
            {90, 85, 92},
            {78, 88, 85},
            {92, 87, 90}
        };

        // 2. Informasi array
        System.out.println("Jumlah Mahasiswa: " + nilai.length);
        System.out.println("Jumlah Mata Kuliah: " + nilai[0].length);
        System.out.println();

        // 3. Akses elemen spesifik
        System.out.println("Nilai Mahasiswa 1, Mata Kuliah 1: " + nilai[0][0]);
        System.out.println("Nilai Mahasiswa 2, Mata Kuliah 3: " + nilai[1][2]);
        System.out.println();

        // 4. Menampilkan dalam bentuk tabel
        String[] mataKuliah = {"MTK", "Fisika", "Kimia"};

        System.out.println("Tabel Nilai:");
        System.out.print("Mahasiswa\t");
        for (String mk : mataKuliah) {
            System.out.print(mk + "\t");
        }
        System.out.println();

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Mhs " + (i+1) + "\t\t");
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print(nilai[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

/*Nama: Urai Salwa Kirania Nadia
Nim: D1041241074
Tanggal: Sabtu, 14 Maret 2026
*/