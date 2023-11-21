package ahmad_rizki_uuk_pbo;
import java.util.Scanner;

public class Ahmad_Rizki_UUK_PBO {
    
    static boolean play = true;

    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        while (play){
            
            System.out.println("-----KALKULATOR SEDERHANA-----");
        
            System.out.print("Masukkan bilangan pertama: ");
            int n1 = s.nextInt();
            System.out.print("Masukkan bilangan kedua: ");
            int n2 = s.nextInt();
            System.out.println("");
        
            System.out.println("Pilih operasi: ");
            System.out.println("1. Penjumlahan ");
            System.out.println("2. Pengurangan ");
            System.out.println("3. Perkalian ");
            System.out.println("4. Pembagian ");
            System.out.println("5. Matikan operasi ");
            System.out.println("");
            System.out.print("Masukkan pilihan(1/2/3/4/5): ");
            int pilih = s.nextInt();
        
            switch (pilih) {
                case 1:
                    String op1 = "+";
                    int tambah = n1 + n2;
                    System.out.println("Hasil dari " + n1+ " " + op1 + " " +n2 + " = " + pilih);
                    break;
                case 2:
                    String op2 = "-";
                    int kurang = n1 - n2;
                    System.out.println("Hasil dari " + n1 + " " + op2 + " " + n2 + " = " + pilih);
                    break;
                case 3:
                    String op3 = "*";
                    int kali = n1 * n2;
                    System.out.println("Hasil dari " + n1 + " " + op3 + " " + n2 + " = " + pilih);
                    break;
                case 4:
                    String op4 = "/";
                    int bagi = n1 / n2;
                    System.out.println("Hasil dari " + n1 + " " + op4 + " " + n2 + " = " + pilih);
                    break;
                case 5:
                    System.out.println("Terima kasih!");
                    play = false;
                    break;
                default:
                    System.out.println("Pilihan ini tidak ada! tolong pilih yang benar");
                    break;
            }

        }
        
    }
}
