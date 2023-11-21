package ramadhan;

import java.util.Scanner;
public class Main{


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner input = new Scanner (System.in);
        int pilihan;
        int hasil;


        System.out.println("-----------");
        System.out.print("Masukan bilangan pertama: ");
        int angka1 = input.nextInt();
        System.out.print("Masukan bilangan kedua  : ");
        int angka2 = input.nextInt();

        System.out.println("--------------------------");
        do {
            System.out.println("silahkan pilih");
            System.out.println();
            System.out.println("1. penjumlahan:");
            System.out.println("1. pengurangan");
            System.out.println("3. perkalian");
            System.out.println("4. pembagian");
            System.out.println("5. Keluar");
            System.out.println();
            System.out.print("Masukkan pilihan (1/2/3/4/5): ");
            pilihan = scanner.nextInt();


            switch (pilihan) {
                case 1:
                    hasil = angka1 + angka2;
                    System.out.println(angka1 +" + "+angka2 + " = "  + hasil);
                    break;

                case 2:
                    hasil = angka1 - angka2;
                    System.out.println(angka1 +" - "+angka2 + " = " + hasil);
                    break;

                case 3:
                    hasil = angka1 * angka2;
                    System.out.println(angka1 +" * "+angka2 + " = " + hasil);
                    break;

                case 4:
                    hasil = angka1 / angka2;
                    System.out.println(angka1 +" / "+angka2 + " = " + hasil);
                    break;

                case 5:
                    System.out.println("terima kasih");
                    break;
            }







//
        }while (pilihan != 5);
    }

}