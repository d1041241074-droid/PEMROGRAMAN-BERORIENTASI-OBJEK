package pertemuan9;

class Persegi {
    int sisi;
    int luas;
    int keliling;

    public void hitungLuas() {
            luas = sisi * sisi;
    }

    public void hitungKeliling() {
            keliling = 4 * sisi;
    }

    public void tampilkanHasil() {
        System.out.println("=== PERSEGI ===");
        System.out.println();
        System.out.println("Sisi : " + sisi + " cm" );
        System.out.println();
        System.out.println("Luas : " + luas + " cm²");
        System.out.println();
        System.out.println("Keliling : " + keliling + " cm");
        System.out.println();
    }
}

public class HitungPersegi {
        public static void main(String[] args) {
            Persegi info = new Persegi();
            info.sisi = 5;

            info.hitungLuas();
            info.hitungKeliling();
            info.tampilkanHasil();
        }
}

/*Nama: Urai Salwa Kirania Nadia
Nim: D1041241074
Tanggal: Rabu, 11 Maret 2026
*/