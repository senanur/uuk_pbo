import java.util.Scanner;

public class kalkulator{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan pertama: ");
        float v1 = input.nextFloat();
        System.out.print("Masukkan bilangan kedua: ");
        float v2 = input.nextFloat();

        System.out.println();

        System.out.println("Pilih operasi:");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
    
        System.out.println();

        System.out.print("Masukkan pilihan(1/2/3/4): ");
        int pilihan = input.nextInt();

        System.out.println();

        float hasil;

        switch (pilihan) {
            case 1:
                hasil = v1 + v2;
                System.out.println(v1+" + "+v2+" = "+hasil);
                break;
            case 2:
                hasil = v1 - v2;
                System.out.println(v1+" - "+v2+" = "+hasil);
                break;
            case 3:
                hasil = v1 * v2;
                System.out.println(v1+" * "+v2+" = "+hasil);
                break;
            case 4:
                if (v2 != 0) {
                    hasil = v1 / v2;
                    System.out.println(v1+" / "+v2+" = "+hasil);
                    break;
                } else {
                    System.out.println("Tidak dapat dibagi dengan nol");
                }
                break;
            default:
            System.out.println("Pilihan salah");
                break;
        }
    }
}

