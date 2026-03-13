package pertemuan15;

public class LatihanVarArgs {
    static double hitungRataRata(int... nilai) {

        if (nilai.length == 0) {
            return 0;
        }

        int total = 0;
        for (int n : nilai) {
            total += n;
        }
        return (double) total / nilai.length;
    }

    public static void main(String[] args) {
        double rerata1 = hitungRataRata(70, 80, 90);
        System.out.println("Rata-rata (3 nilai): " + rerata1);

        double rerata2 = hitungRataRata(80, 80, 90, 90, 90);
        System.out.println("Rata-rata (5 nilai): " + rerata2);
    }
}

/*Nama: Urai Salwa Kirania Nadia
Nim: D1041241074
Tanggal: Sabtu, 14 Maret 2026
*/

