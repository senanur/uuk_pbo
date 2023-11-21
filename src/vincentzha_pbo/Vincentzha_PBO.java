package vincentzha_pbo;
import java.util.Scanner;
public class Vincentzha_PBO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan bilangan pertama: ");
        double bilanganPertama = scanner.nextDouble();

        System.out.print("Masukkan bilangan kedua: ");
        double bilanganKedua = scanner.nextDouble();

        System.out.println("Pilih operasi:");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");

        System.out.print("Masukkan Pilihan (1/2/3/4): ");
        int pilihan = scanner.nextInt();

        double hasil = 0.0;
        switch (pilihan) {
            case 1:
                hasil = bilanganPertama + bilanganKedua;
                System.out.println(bilanganPertama + " + " + bilanganKedua + " = " + hasil);
                break;
            case 2:
                hasil = bilanganPertama - bilanganKedua;
                System.out.println(bilanganPertama + " - " + bilanganKedua + " = " + hasil);
                break;
            case 3:
                hasil = bilanganPertama * bilanganKedua;
                System.out.println(bilanganPertama + " * " + bilanganKedua + " = " + hasil);
                break;
            case 4:
                if (bilanganKedua != 0) {
                    hasil = bilanganPertama / bilanganKedua;
                    System.out.println(bilanganPertama + " / " + bilanganKedua + " = " + hasil);
                } else {
                    System.out.println("Tidak bisa melakukan pembagian dengan nol.");
                }
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }

        scanner.close();
    }
}
