package pertemuan4;

public class LatihanProduk {
    public static final double PI = 0.11;

    public static void main(String[] args) {
        //Variabel dengan camelCase
        String namaProduk = "Laptop Asus";
        int hargaSatuan = 7000000;
        int jumlahStok = 15;

        boolean isActive = true;

        System.out.println("===INFORMASI PRODUK====");

        System.out.println("Nama Produk: "              + namaProduk);
        System.out.println("Harga Satuan: Rp "          + hargaSatuan);
        System.out.println("Jumlah Stok: "              + jumlahStok);
        System.out.println("Status Tersedia: "          + isActive);

        System.out.println("Total Nilai Stok : Rp "                   + (hargaSatuan * jumlahStok));
        System.out.println("Pajak (11%): Rp "          + (int) ((hargaSatuan*jumlahStok)*PI));
    }
}

/*Nama: Urai Salwa Kirania Nadia
Nim: D1041241074
Tanggal: Jumat, 13 Februari 2026
*/