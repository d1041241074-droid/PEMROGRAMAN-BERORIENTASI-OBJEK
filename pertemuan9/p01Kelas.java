package pertemuan9;

class Calc {
    int num1;
    int num2;
    int result;

    public void perform() {
        result = num1 + num2;
    }
}
public class p01Kelas {
    public static void main(String args[]) {
        Calc obj = new Calc();

        // Mengisi atribut
        obj.num1 = 3;
        obj.num2 = 5;

        // Tampilkan result sebelum perhitungan
        System.out.println("Sebelum perform(): " + obj.result);

        // Panggil method untuk melakukan perhitungan
        obj.perform();

        // Tampilkan result setelah perhitungan
        System.out.println("Setelah perform(): " + obj.result);
    }
}

/*Nama: Urai Salwa Kirania Nadia
Nim: D1041241074
Tanggal: Rabu, 11 Maret 2026
*/