package pertemuan12;

class Emp {
    int ID;
    int gaji;

    static String CEO;

    public void show() {
        System.out.println(ID + " : " + gaji + " : " + CEO);
    }
}

public class p05Static {
    public static void main(String args[]) {
        Emp rudy = new Emp();
        rudy.ID = 10;
        rudy.gaji = 5000;

        Emp budi = new Emp();
        budi.ID = 12;
        budi.gaji = 4500;

        budi.CEO = "Andi";
        System.out.println("=== Sebelum Ubah CEO ===");
        rudy.show();
        budi.show(); 

        Emp.CEO = "Budi";
        System.out.println("\n=== Setelah Ubah CEO ===");
        rudy.show();
        budi.show();
    }
}

/*Nama: Urai Salwa Kirania Nadia
Nim: D1041241074
Tanggal: Jumat, 13 Maret 2026
*/