package pertemuan11;

class Mobil {
    //Atribut
    String merk;
    String warna;
    int tahun;

    // Constructor 1: Tanpa parameter
    public Mobil () {
        merk = "Unknown";
        warna = "Unknown";
        tahun = 0;
    }

    // Constructor 2: Hanya merk
    public Mobil (String merk) {
        this.merk = merk;
        warna = "Unknown";
        tahun = 0;
    }

    // Constructor 3: semua atribut
    public Mobil (String merk, String warna, int tahun) {
        this.merk = merk;
        this.warna = warna;
        this.tahun = tahun;
    }

    // Method untuk menampilkan informasi 
    public void tampilkanSpesifikasi() {
        System.out.println("=== SPESIFIKASI MOBIL ===");
        System.out.println("Merk : " + merk);
        System.out.println("Warna: " + warna);
        System.out.println("Tahun: " + tahun);
        System.out.println();
    }
}

public class LatihanMobilOverloading {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil();
        mobil1.tampilkanSpesifikasi();

        Mobil mobil2 = new Mobil("Toyota");
        mobil2.tampilkanSpesifikasi();

        Mobil mobil3 = new Mobil("Honda Civic", "Merah", 2023);
        mobil3.tampilkanSpesifikasi();
    }
}

/*Nama: Urai Salwa Kirania Nadia
Nim: D1041241074
Tanggal: Kamis, 12 Maret 2026
*/

