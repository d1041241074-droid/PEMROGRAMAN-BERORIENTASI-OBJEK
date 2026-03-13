package pertemuan12;

class Sekolah {
    String namaSekolah;
    Sekolah(String nama) {
        namaSekolah = nama;
    }

    class Kelas {
        String namaKelas;

        Kelas(String kelas) {
            namaKelas = kelas;
        }

        void info() {
            System.out.println("Sekolah: " + namaSekolah);
            System.out.println("Kelas: " + namaKelas);
        }
    }
}

public class LatihanInnerClass {
    public static void main(String args[]) {
        Sekolah sekolah = new Sekolah("SMA Negeri 1");
        Sekolah.Kelas kelas = sekolah.new Kelas("X-A");
        kelas.info();
    }
}

/*Nama: Urai Salwa Kirania Nadia
Nim: D1041241074
Tanggal: Jumat, 13 Maret 2026
*/