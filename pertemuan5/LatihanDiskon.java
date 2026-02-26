package pertemuan5;

public class LatihanDiskon {

    public static void main(String[] args) {
        double totalBelanja = 750000;
        double diskon = 0.0;

        System.out.println("=== KALKULATOR DISKON ===");
        System.out.println("Total Belanja: Rp " + totalBelanja);

        if (totalBelanja < 100000) {
            diskon = 0;
        }else if (totalBelanja >= 100000 && totalBelanja <= 499999) {
            diskon = 0.05;
        }else if (totalBelanja >= 500000 && totalBelanja <= 999999) {
            diskon = 0.10;
        }else {
            diskon = 0.15;
        }

        double totalDiskon = totalBelanja * diskon;
        double hargaAkhir = totalBelanja - totalDiskon;
        double hemat = totalBelanja - hargaAkhir;

        System.out.println("Diskon (" + (int) (diskon * 100) + "%): Rp " + totalDiskon);
        System.out.println("Harga Akhir: Rp " + hargaAkhir);
        System.out.println("Anda hemat: Rp " + hemat);


    }
}

/*Nama: Urai Salwa Kirania Nadia
Nim: D1041241074
Tanggal: Kamis, 26 Februari 2026
*/