package pertemuan6;

import java.util.Scanner;

public class LatihanRestoran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=== MENU RESTORAN ===");
        System.out.print("Kode Menu: ");
        int menuCode = input.nextInt();
        System.out.print("Jumlah: ");
        int quantity = input.nextInt();
        String namaMenu;
        int totalBayar;
        int harga;

        System.out.println("Pesanan Anda: ");
        switch (menuCode) {
            case 1:
                namaMenu = "Nasi Goreng";
                harga = 15000;
                totalBayar = harga * quantity;
                System.out.println("Nama Menu: " + namaMenu);
                System.out.println("Harga Satuan: Rp " + harga);
                System.out.println("Jumlah: " + quantity);
                System.out.println("---");
                System.out.println("Total Bayar: " + totalBayar);
                break;
            case 2:
                namaMenu = "Mie Ayam";
                harga = 12000;
                totalBayar = harga * quantity;
                System.out.println("Nama Menu: " + namaMenu);
                System.out.println("Harga Satuan: Rp " + harga);
                System.out.println("Jumlah: " + quantity);
                System.out.println("---");
                System.out.println("Total Bayar: " + totalBayar);
                break;
            case 3:
                namaMenu = "Bakso";
                harga = 10000;
                totalBayar = harga * quantity;
                System.out.println("Nama Menu: " + namaMenu);
                System.out.println("Harga Satuan: Rp " + harga);
                System.out.println("Jumlah: " + quantity);
                System.out.println("---");
                System.out.println("Total Bayar: " + totalBayar);
                break;
            case 4:
                namaMenu = "Soto Ayam";
                harga = 13000;
                totalBayar = harga * quantity;
                System.out.println("Nama Menu: " + namaMenu);
                System.out.println("Harga Satuan: Rp " + harga);
                System.out.println("Jumlah: " + quantity);
                System.out.println("---");
                System.out.println("Total Bayar: " + totalBayar);
                break;
            case 5:
                namaMenu = "Es Teh";
                harga = 3000;
                totalBayar = harga * quantity;
                System.out.println("Nama Menu: " + namaMenu);
                System.out.println("Harga Satuan: Rp " + harga);
                System.out.println("Jumlah: " + quantity);
                System.out.println("---");
                System.out.println("Total Bayar: " + totalBayar);
                break;
            default:
                System.out.println("Error: Pilihan menu tidak valid!");
                System.out.println("Silakan pilih menu 1-5");
                break;
        }
    }
}

/*Nama: Urai Salwa Kirania Nadia
Nim: D1041241074
Tanggal: Kamis, 26 Februari 2026
*/