package pertemuan9;

class Mobil {
        String merk;
        String warna;
        int tahun;
        int kecepatan;
        int kecepatanAkhir; //digunakan untuk menghitung percepatan
        int waktu;
        int percepatan;

        public void percepat(){
            kecepatanAkhir = kecepatan + 10 * waktu;
            percepatan = kecepatanAkhir - kecepatan;
        }

        public void tampilkanInfo(){
            System.out.println("merk: " + merk);
            System.out.println("warna: " + warna);
            System.out.println("tahun: " + tahun);
            System.out.println("kecepatan: " + kecepatan);
        }

}

public class InfoMobil{
    public static void main(String args[]){
        Mobil info = new Mobil();

        //mengisi atribut
        info.merk = "BMW";
        info.warna = "Putih";
        info.tahun = 1998;
        info.kecepatan = 40;
        info.waktu = 5; // inputan waktu untuk menghitung percepatan

        //menampilkan nilai sebelum method dipanggil
        info.percepat();
        System.out.println("percepatan: " + info.percepatan);
        info.tampilkanInfo();
    }
}

/*Nama: Urai Salwa Kirania Nadia
Nim: D1041241074
Tanggal: Jumat, 20 Februari 2026
*/