package pertemuan8;

public class LatihanKombinasiLoop {
    public static void main(String[] args) {
        System.out.println("=== PENCARIAN KOORDINAT [2,3] ===");
        boolean found = false;

        for (int baris = 1; baris <= 3; baris++) {
            for (int kolom = 1; kolom <= 5; kolom++) {
                System.out.println("Cek: [" + baris + "," + kolom + "]");
                if (baris == 2 && kolom == 3) {
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }

        }
        System.out.println("-> Koordinat ditemukan!");
        System.out.println("Pencarian selesai.");
    }
}

/*Nama: Urai Salwa Kirania Nadia
Nim: D1041241074
Tanggal: Jumat, 27 Februari 2026
*/