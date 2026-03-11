package pertemuan10;

class Mahasiswa {
    String nama;
    String NIM;
    int nilai;

    public Mahasiswa() {
        nama = "Belum diisi";
        NIM = "00000000";
        nilai = 0;
        System.out.println("Object mahasiswa dibuat (default)");
    }

    public Mahasiswa(String nama, String NIM, int nilai) {
        this.nama = nama;
        this.NIM = NIM;
        this.nilai = nilai;
        System.out.println("Object mahasiswa dibuat: " + this.nama);
    }

    public void tampilkanData() {
        System.out.println("=== DATA MAHASISWA ===");
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + NIM);
        System.out.println("Nilai: " + nilai);
        System.out.println();
    }
}

public class p04MahasiswaConstructor {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.tampilkanData();

        Mahasiswa mhs2 = new Mahasiswa("Andi Wijaya", "F1234567", 85);
        mhs2.tampilkanData();

        Mahasiswa mhs3 = new Mahasiswa("Budi Santoso", "F1234568", 90);
        mhs3.tampilkanData();
    }
}

/*Nama: Urai Salwa Kirania Nadia
Nim: D1041241074
Tanggal: Rabu, 11 Maret 2026
*/