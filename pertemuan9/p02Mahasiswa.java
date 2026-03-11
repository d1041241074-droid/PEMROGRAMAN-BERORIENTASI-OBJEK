package pertemuan9;

class Mahasiswa {
    String nama;
    String NIM;
    int nilai;

    public void tampilkanData() {
        System.out.println("=== DATA MAHASISWA ===");
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + NIM);
        System.out.println("Nilai : " + nilai);
        System.out.println();
    }

    public void cekKelulusan() {
        if (nilai >= 60) {
            System.out.println(nama + " LULUS");
        } else {
            System.out.println(nama + " TIDAK LULUS");
        }
    }
}

public class p02Mahasiswa {
        public static void main(String[] args) {
            Mahasiswa mhs1 = new Mahasiswa();
            mhs1.nama = "Andi Wijaya";
            mhs1.NIM = "F1234567";
            mhs1.nilai = 85;

            Mahasiswa mhs2 = new Mahasiswa();
            mhs2.nama = "Budi Santoso";
            mhs2.NIM = "F1234568";
            mhs2.nilai = 55;

            mhs1.tampilkanData();
            mhs1.cekKelulusan();

            System.out.println();

            mhs2.tampilkanData();
            mhs2.cekKelulusan();


        }
}

/*Nama: Urai Salwa Kirania Nadia
Nim: D1041241074
Tanggal: Rabu, 11 Maret 2026
*/

