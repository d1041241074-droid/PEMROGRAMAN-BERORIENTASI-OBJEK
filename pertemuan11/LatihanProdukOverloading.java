package pertemuan11;

class Produk {
    //Atribut
    String namaProduk;
    int harga;
    int stok;

    // Constructor 1: nama dan harga saja
    public Produk (String namaProduk, int harga) {
        this.namaProduk = namaProduk;
        this.harga = harga;
        stok = 0;
    }

    // Constructor 2: semua atribut
    public Produk (String namaProduk, int harga, int stok) {
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.stok = stok;
    }

    // Method untuk menampilkan informasi 
    public void tampilkanInfo() {
        System.out.println("=== INFORMASI PRODUK ===");
        System.out.println("Nama Produk : " + namaProduk);
        System.out.println("Harga       : Rp " + harga);
        System.out.println("Stok        : " + stok);
        System.out.println();
    }
}

public class LatihanProdukOverloading {
    public static void main(String[] args) {

        Produk produk1 = new Produk("Laptop ASUS", 8500000);
        produk1.tampilkanInfo();

        Produk produk2 = new Produk("Mouse Logitech", 250000, 50);
        produk2.tampilkanInfo();
    }
}

/*Nama: Urai Salwa Kirania Nadia
Nim: D1041241074
Tanggal: Kamis, 12 Maret 2026
*/

