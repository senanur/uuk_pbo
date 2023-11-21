package ferdinandpplg_uukjava;

import java.util.Scanner;

public class Ferdinandpplg_uukjava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Masukkan bilangan pertama: ");
                double angka1 = scanner.nextDouble();

                System.out.print("Masukkan bilangan kedua: ");
                double angka2 = scanner.nextDouble();
                
               
                
              System.out.print("Pilih operasi (+,-,*,/): ");
                char operasi = scanner.next().charAt(0);

                double hasil = 0;

                switch (operasi) {
                    case '+':
                        hasil = tambah(angka1, angka2);
                        break;
                    case '-':
                        hasil = kurang(angka1, angka2);
                        break;
                    case '*':
                        hasil = kali(angka1, angka2);
                        break;
                    case '/':
                        hasil = bagi(angka1, angka2);
                        break;
                    default:
                        System.out.println("Error: Operasi tidak valid.");
                        continue;
                }

                System.out.println("Hasil: " + hasil);

                System.out.print("Apakah Anda ingin mengulang (ya/tidak)? ");
                String ulangi = scanner.next().toLowerCase();
                if (!ulangi.equals("ya")) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Error: Masukan tidak valid.");
                scanner.nextLine();  // Membersihkan buffer input
            }
        }
        scanner.close();
    }

    private static double tambah(double a, double b) {
        return a + b;
    }
    
    private static double kurang(double a, double b) {
        return a - b;
    }

    private static double kali(double a, double b) {
        return a * b;
    }
    
    private static double bagi(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: Pembagian oleh nol");
            return 0;  // Nilai default jika pembagian oleh nol
        }
    }
}
