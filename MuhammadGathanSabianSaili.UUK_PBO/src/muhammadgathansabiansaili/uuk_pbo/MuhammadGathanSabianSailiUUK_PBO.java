
package muhammadgathansabiansaili.uuk_pbo;


import java.util.Scanner;

public class MuhammadGathanSabianSailiUUK_PBO {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double angka1, angka2, angka3, hasil;
        char operator;
        
        System.out.print("Masukan Angka Pertama: ");
        angka1 = scanner.nextDouble();
        
        System.out.print("Masukan Angka Kedua: ");
        angka2 = scanner.nextDouble();
        
        System.out.println("Pilin Operasi: ");
        System.out.println("1.Penjumlahan ");
        System.out.println("2.Pengurangan ");
        System.out.println("3.Perkalian ");
        System.out.println("4.Pembagian ");
        System.out.println("");
        System.out.println("");
        System.out.println("Masukan Pilihan(1,2,3,4): ");
        operator = scanner.next() .charAt(0);
        
        switch (operator) {
            case'1':
                hasil = angka1 + angka2;
                System.out.println("Hasil: "+ hasil);
                break;
                case'2':
                    hasil = angka1 - angka2;
                    System.out.println("Hasil: "+ hasil);
                    break;
                    case'3':
                        hasil = angka1 * angka2;
                        System.out.println("Hasil: "+ hasil);
                        break;
                        case'4':
                            if (angka2 != 0) {
                    hasil = angka1 / angka2;
                    System.out.println("Hasil: " + hasil);
                } else {
                    System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
                }
                break;
                        default:
                            System.out.println("Operator Tidak valid");
        }
        
        
    }
    
}
