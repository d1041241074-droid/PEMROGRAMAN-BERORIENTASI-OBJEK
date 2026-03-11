package pertemuan10;

class This {
    int i;
    float f;
    int z;

    public This(int i, float f) {
        this.i = i;
        this.f = f;
        z = 5;
        System.out.println("2 parameter");
    }

    public This(int i) {
        this.i = i;
        System.out.println("1 parameter");
    }
}

public class p03This {
    public static void main(String args[]) {
        This t = new This(1, 2.5f);
    }
}

/*Nama: Urai Salwa Kirania Nadia
Nim: D1041241074
Tanggal: Rabu, 11 Maret 2026
*/