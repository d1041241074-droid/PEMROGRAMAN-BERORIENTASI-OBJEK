package pertemuan11;

class Mahasiswa {
    String nama;
    String NIM;
    int nilai;

    // Constructor 1: Tanpa parameter
    public Mahasiswa() {
        nama = "Mahasiswa Baru";
        NIM = "00000000";
        nilai = 0;
    }

    // Constructor 2: Nama dan NIM saja
    public Mahasiswa(String nama, String NIM) {
        this.nama = nama;
        this.NIM = NIM;
        nilai = 0;
    }

    // Constructor 3: Semua atribut
    public Mahasiswa(String nama, String NIM, int nilai) {
        this.nama = nama;
        this.NIM = NIM;
        this.nilai = nilai;
    }

    public void tampilkanData() {
        System.out.println("=== DATA MAHASISWA ===");
        System.out.println("Nama  : " + nama);
        System.out.println("NIM   : " + NIM);
        System.out.println("Nilai : " + nilai);
        System.out.println();
    }
}

public class p05MahasiswaOverloading {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.tampilkanData();

        Mahasiswa mhs2 = new Mahasiswa("Andi Wijaya", "F1234567");
        mhs2.tampilkanData();

        Mahasiswa mhs3 = new Mahasiswa("Budi Santoso", "F1234568", 85);
        mhs3.tampilkanData();

        mhs2.nilai = 90;
        System.out.println("Setelah nilai diupdate:");
        mhs2.tampilkanData();
    }
}

/*Nama: Urai Salwa Kirania Nadia
Nim: D1041241074
Tanggal: Kamis, 12 Maret 2026
*/