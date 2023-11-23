package muhammad_fahmi_hanif;

import java.util.Scanner;

public class UUK_PBO {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char op;
        double hasil;

        System.out.print("Masukkan bilangan pertama: ");
        double bil1 = input.nextInt();
        System.out.print("Masukkan bilangan kedua: ");
        double bil2 = input.nextInt();
        System.out.println();

        System.out.println("Pilih operasi:");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.println();

        System.out.print("Masukkan pilihan(1/2/3/4): ");
        char pilih = input.next().charAt(0);
        System.out.println();

        switch (pilih) {
            case '1':
                hasil = bil1 + bil2;
                op = '+';
                break;
            case '2':
                hasil = bil1 - bil2;
                op = '-';
                break;
            case '3':
                hasil = bil1 * bil2;
                op = '*';
                break;
            case '4':
                hasil = bil1 / bil2;
                op = '/';
                break;
            default:
                System.out.println("Pilihan tidak valid");
                input.close();
                return;
        }

        System.out.println(bil1 + " " + op + " " + bil2 + " = " + hasil);
        input.close();

    }

}
