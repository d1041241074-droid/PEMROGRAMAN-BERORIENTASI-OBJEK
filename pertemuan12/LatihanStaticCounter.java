package pertemuan12;

class Mahasiswa {
    static int jumlahMahasiswa = 0;
    String nama;

    Mahasiswa(String n) {
        nama = n;
        jumlahMahasiswa++;
        System.out.println("Mahasiswa dibuat: " + nama);
    }

    static int getJumlah() {
        return jumlahMahasiswa;
    }
}

public class LatihanStaticCounter {
    public static void main(String args[]) {
        Mahasiswa mhs1 = new Mahasiswa("Andi");
        Mahasiswa mhs2 = new Mahasiswa("Budi");
        Mahasiswa mhs3 = new Mahasiswa("Citra");

        System.out.println("Total Mahasiswa: " + Mahasiswa.getJumlah());
    }
}

/*Nama: Urai Salwa Kirania Nadia
Nim: D1041241074
Tanggal: Jumat, 13 Maret 2026
*/