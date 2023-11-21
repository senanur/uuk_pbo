import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan pertama: ");
        double num1 = scanner.nextInt();
        System.out.print("Masukkan bilangan kedua: ");
        double num2 = scanner.nextInt();
        System.out.println("");
        System.out.println("Pilih operasi: ");
        System.out.println("1. Penjumlahan");
        System.out.println("2. pengurangan");
        System.out.println("3. perkalian");
        System.out.println("4. pembagian");
        System.out.println("");
        System.out.print("Masukkan pilihan(1/2/3/4): ");
        String operator = scanner.next();
        double result = 0;
        switch (operator) {
            case "1":
                result = num1 + num2;
                System.out.println("");
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;
            case "2":
                result = num1 - num2;
                System.out.println("");
                System.out.println(num1 + " - " + num2 + " = " + result);
                
                break;
            case "3":
                result = num1 * num2;
                System.out.println("");
                System.out.println(num1 + " * " + num2 + " = " + result);
                break;
            case "4":
                if (num2 == 0) {
                    System.out.println("Error! Tidak bisa dibagi 0!");
                }else {
                    result = num1 / num2;
                    System.out.println("");
                    System.out.println(num1 + " / " + num2 + " = " + result);
                }
                break;
            default:
                System.out.println("Operator tidak valid");
                break;
        }
        scanner.close();
    }
}
