package pertemuan5;

import java.util.Scanner;

public class LatihanLogin {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Username: ");
        String  inputUsername = input.nextLine();
        System.out.print("Password: ");
        String  inputPassword = input.nextLine();

        System.out.println("=== VALIDASI LOGIN ===");
        System.out.println("---");

        if (inputUsername.equals("admin")){
            if(inputPassword.equals("admin123")){
                System.out.println("Username valid");
                System.out.println("Password benar");
                System.out.println("LOGIN BERHASIL!");
                System.out.println("Selamat datang, admin");
            }else{
                System.out.println("Username valid");
                System.out.println("Password salah");
                System.out.println("LOGIN GAGAL!");
            }
        }else{
            System.out.println("Username tidak valid");
            System.out.println("LOGIN GAGAL!");
        }
    }
} 

/*Nama: Urai Salwa Kirania Nadia
Nim: D1041241074
Tanggal: Kamis, 26 Februari 2026
*/