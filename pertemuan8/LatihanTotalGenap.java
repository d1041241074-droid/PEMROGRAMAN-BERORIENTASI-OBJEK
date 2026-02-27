package pertemuan8;

public class LatihanTotalGenap {
    public static void main(String[] args) {
        System.out.println("=== TOTAL BILANGAN GENAP 1-20  ===");
        int total = 0;

        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0) {
                //System.out.println("Skip: " + i + " Ganjil");
                continue;
            }

            total += i;
            System.out.println("Tambah: " + i + " -> Total: " + total);
        }
        System.out.println("Total akhir: " + total);
    }

}

/*Nama: Urai Salwa Kirania Nadia
Nim: D1041241074
Tanggal: Jumat, 27 Februari 2026
*/