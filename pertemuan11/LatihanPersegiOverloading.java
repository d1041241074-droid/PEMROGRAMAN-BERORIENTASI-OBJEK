package pertemuan11;

class PersegiPanjang {
    //Atribut
    int panjang;
    int lebar;
    int luas;
    int keliling;

    public PersegiPanjang (int sisi) {
        this.panjang = sisi;
        this.lebar = sisi;
        this.luas = panjang * lebar;
        this.keliling = 2 * (panjang + lebar);
    }

    public PersegiPanjang (int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.luas = panjang * lebar;
        this.keliling = 2 * (panjang + lebar);
    }

    public void tampilkanInfo() {
        System.out.println("=== PERSEGI PANJANG ===");
        System.out.println("Panjang : " + panjang + " cm");
        System.out.println("Lebar   : " + lebar +  " cm");
        System.out.println("Luas    : " + luas +  " cm²");
        System.out.println("Keliling: " + keliling +  " cm");
        System.out.println();
    }
}

public class LatihanPersegiOverloading {
    public static void main(String[] args) {
        PersegiPanjang persegi1 = new PersegiPanjang(5);
        persegi1.tampilkanInfo();

        PersegiPanjang persegi2 = new PersegiPanjang(8, 4);
        persegi2.tampilkanInfo();
    }
}

/*Nama: Urai Salwa Kirania Nadia
Nim: D1041241074
Tanggal: Kamis, 12 Maret 2026
*/