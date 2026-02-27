package pertemuan8;

public class LatihanMenuHarian {

    public static void main(String[] args) {
        System.out.println("=== MENU MAKAN 3 HARI ===");

        for (int hari = 1; hari <= 3; hari++) {
            System.out.println("Hari ke-" + hari + ":");

            for(int waktuMakan = 1; waktuMakan <= 2; waktuMakan++) {
                String waktu;
                String menu = "";

                if (waktuMakan == 1) {
                    waktu = "Pagi";
                } else {
                    waktu = "Siang";
                }

                switch (hari) {
                    case 1:
                        if (waktuMakan == 1) {
                            menu = "Nasi Goreng";

                        } else {
                            menu = "Soto Ayam";
                        }
                        System.out.println(waktu + ": " + menu);
                        break;

                    case 2:
                        if (waktuMakan == 1) {
                            menu = "Bubur Ayam";

                        } else {
                            menu = "Mie Goreng";
                        }
                        System.out.println(waktu + ": " + menu);
                        break;

                    case 3:
                        if (waktuMakan == 1) {
                            menu = "Roti Bakar";

                        } else {
                            menu = "Nasi Uduk";
                        }
                        System.out.println(waktu + ": " + menu);
                        break;
                }
            }
            System.out.println();

        }

    }
}

/*Nama: Urai Salwa Kirania Nadia
Nim: D1041241074
Tanggal: Jumat, 27 Februari 2026
*/