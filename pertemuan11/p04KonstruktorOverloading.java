package pertemuan11;

class Buku {
    //Atribut
    String judul;
    String pengarang;
    int harga;

    // Constructor 1: Tanpa parameter
    public Buku () {
        judul = "Belum diisi";
        pengarang = "Belum diisi";
        harga = 0;
        System.out.println("Constructor tanpa parameter dipanggil");
    }

    // Constructor 2: Hanya judul
    public Buku (String judul) {
        this.judul = judul;
        pengarang = "Belum diisi";
        harga = 0;
        System.out.println("Constructor 1 parameter dipanggil");
    }

    // Constructor 3: Judul dan pengarang
    public Buku (String judul, String pengarang) {
        this.judul = judul;
        this.pengarang = pengarang;
        harga = 0;
        System.out.println("Constructor 2 parameter dipanggil");
    }

    // Constructor 4: Semua atribut
    public Buku (String judul, String pengarang, int harga) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.harga = harga;
        System.out.println("Constructor 3 parameter dipanggil");
    }

    // Method untuk menampilkan informasi buku
    public void tampilkanInfo() {
        System.out.println("=== INFORMASI BUKU ===");
        System.out.println("Judul : " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Harga : Rp " + harga);
        System.out.println();
    }
}

public class p04KonstruktorOverloading {
    public static void main(String[] args) {
        System.out.println("DEMONSTRASI CONSTRUCTOR OVERLOADING\n");
        
        Buku buku1 = new Buku();
        buku1.tampilkanInfo();

        Buku buku2 = new Buku("Pemrograman Java");
        buku2.tampilkanInfo();

        Buku buku3 = new Buku("Algoritma Dasar", "Rinaldi Munir");
        buku3.tampilkanInfo();

        Buku buku4 = new Buku("Struktur Data", "Budi Raharjo", 125000);
        buku4.tampilkanInfo();
    }
}

/*Nama: Urai Salwa Kirania Nadia
Nim: D1041241074
Tanggal: Kamis, 12 Maret 2026
*/