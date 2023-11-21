package rendhi_sanjaya.uuk_pbo;
import java.util.Scanner;

public class Rendhi_sanjayaUUK_PBO {

   
    public static void main(String[] args) {
        
       while (true) {
             Scanner input = new Scanner(System.in);
             Scanner operator = new Scanner(System.in);
      
           System.out.println("Masukkan bilangan pertama : 10");
           System.out.println("Masukkan bilangan kedua : 5");
           System.out.println("");
           System.out.println("==Pilih Operasi==");
           System.out.println("1. Penjumlahan");
           System.out.println("2. Pengurangan");
           System.out.println("3. Perkalian");
           System.out.println("4. Pembagian");
           System.out.println("5. Keluar");
           System.out.println("");
           System.out.println("Masukkan Pilihan (1/2/3/4/5):");
           
           int opt = operator.nextInt();
           int a,b, hasil;
           
           switch (opt) {
               case 1:
                   System.out.println("Masukkan Angka ke 1 ");
                   a = input.nextInt();
                   System.out.println("Masukkan Angka ke 2");
                   b = input.nextInt();
                   hasil = a + b;
                   System.out.println("Hasil Penjumlahan = "+ hasil);
                   break;
                   
                case 2:
                   System.out.println("Masukkan Angka ke 1 ");
                   a = input.nextInt();
                   System.out.println("Masukkan Angka ke 2");
                   b = input.nextInt();
                   hasil = a - b;
                   System.out.println("Hasil Penjumlahan = "+ hasil);
                   break;
                   
                case 3:
                   System.out.println("Masukkan Angka ke 1 ");
                   a = input.nextInt();
                   System.out.println("Masukkan Angka ke 2");
                   b = input.nextInt();
                   hasil = a * b;
                   System.out.println("Hasil Penjumlahan = "+ hasil);
                   break;   
               
                case 4:
                   System.out.println("Masukkan Angka ke 1 ");
                   a = input.nextInt();
                   System.out.println("Masukkan Angka ke 2");
                   b = input.nextInt();
                   hasil = a / b;
                   System.out.println("Hasil Penjumlahan = "+ hasil);
                   break;
                   
                case 5:
                    System.exit(0);
                default:
                    System.out.println("pilih operator");
                    break;
                   
           }
           
          
           
           
       }
       
    }
    
}
