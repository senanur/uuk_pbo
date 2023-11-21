package muhammad_haris.uuk_pbo;
import java.util.Scanner;

public class Muhammad_HarisUUK_PBO {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan bilangan pertama : ");
        double num1 = scanner.nextDouble();
        System.out.print("Masukan bilangan kedua : ");
        double num2 = scanner.nextDouble();
        System.out.println("");
        System.out.println("Pilih operasi :");
        System.out.println("1. Penjumalahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. perkalian");
        System.out.println("4. Pembagian");
        System.out.println("");
        System.out.print("Masukan pilihan(1/2/3/4) : ");
        int pilihan = scanner.nextInt();
        System.out.println("");
        
        double hasil = 0.0;
        
        switch (pilihan) {
            case 1:
               hasil = num1 + num2;
                System.out.println(num1+" + "+num2+" = "+ hasil);
                break;
            case 2:
                hasil = num1 - num2;
                System.out.println(num1+" - "+num2+" = "+ hasil);
                break;
            case 3:
                hasil = num1 * num2;
                System.out.println(num1+" x "+num2+" = "+ hasil);
                break;
            case 4:
                if (num2 != 0) {
                    hasil = num1 / num2;
                    System.out.println(num1+" : "+num2+" = "+ hasil);
                } else {
                    System.out.println("Tidak bisa dibagi dengan 0");
                    System.exit(1); // Exit the program
                }
                break;
            default:
                System.out.println("Operator tidak valid");
        }
       }
    }