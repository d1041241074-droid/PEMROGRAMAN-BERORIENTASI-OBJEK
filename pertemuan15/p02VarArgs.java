package pertemuan15;

class Kalkulator {
    public int tambah(int i, int j) {
        return i + j;
    }

    public int tambah2(int... n) {
        int sum = 0;
        for (int i : n) {
            sum = sum + i;
        }
        return sum;
    }
}

public class p02VarArgs {
    public static void main(String args[]) {
        Kalkulator k = new Kalkulator();

        System.out.println("Tambah (2 angka): " + k.tambah(1, 2));
        System.out.println("Tambah2 (5 angka): " + k.tambah2(1, 2, 3, 4, 5));
    }
}

/*Nama: Urai Salwa Kirania Nadia
Nim: D1041241074
Tanggal: Sabtu, 14 Maret 2026
*/

