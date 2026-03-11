package pertemuan9;

class Mobil {
        String merk;
        String warna;
        int tahun;
        int kecepatan;

        public void tampilkanInfo() {
            System.out.println("=== SPESIFIKASI MOBIL ===");
            System.out.println("Merk: " + merk);
            System.out.println("Warna: " + warna);
            System.out.println("Tahun: " + tahun);
        }

        public void percepat() {
            kecepatan = kecepatan + 20;
            System.out.println("Mobil dipercepat...");
        }

        public void tampilkanKecepatan() {
            System.out.println("Kecepatan saat ini: " + kecepatan + " km/jam");
        }


}

public class SpesifikasiMobil{
    public static void main(String args[]){
        Mobil info = new Mobil();

        //mengisi atribut
        info.merk = "Toyota Avanza";
        info.warna = "Silver";
        info.tahun = 2020;

        //menampilkan nilai sebelum method dipanggil
        info.tampilkanInfo();

        System.out.println();
        
        info.percepat();
        info.percepat();
        info.tampilkanKecepatan();
    }
}

/*Nama: Urai Salwa Kirania Nadia
Nim: D1041241074
Tanggal: Rabu, 11 Maret 2026
*/