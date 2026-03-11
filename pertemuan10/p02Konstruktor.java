package pertemuan10;

class Konstruk {
    int i;
    float f;

    public Konstruk() {
        i = 5;
        f = 5.5f;
        System.out.println("Hi");
    }

    public Konstruk(int k) {
        i = k;
        System.out.println("Hello");
    }

    public Konstruk(int k, float fl) {
        i = k;
        f = fl;
        System.out.println("Constructor dengan 2 parameter");
    }
}

public class p02Konstruktor {
    public static void main(String args[]) {

        Konstruk k1 = new Konstruk();

        Konstruk k2 = new Konstruk(5);

        Konstruk k3 = new Konstruk(10, 2.5f);

    }
}

/*Nama: Urai Salwa Kirania Nadia
Nim: D1041241074
Tanggal: Rabu, 11 Maret 2026
*/