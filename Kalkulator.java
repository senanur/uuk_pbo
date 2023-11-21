import java.util.Scanner;

public class Kalkulator {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
          System.out.print("Masukkan Bilangan Pertama: ");
       double nilai1 = scanner.nextDouble();
       
          System.out.print("Masukkan Bilangan Kedua: ");
       double nilai2 = scanner.nextDouble();
       
        System.out.println("");
        System.out.println(" _______________");
        System.out.println("|Pilih operasi: |");
        System.out.println("|1. Penjumlahan |");
        System.out.println("|2. Pengurangan |");
        System.out.println("|3. Perkalian   |");
        System.out.println("|4. Pembagian   |");
        System.out.println("|_______________|");
        System.out.println("");
        System.out.print("Masukkan Pilihan(1/2/3/4): ");
        
        int pilihan = scanner.nextInt();
        
   
       

        
           double hasil = 0;
       
       switch (pilihan) {
           case 1:
               hasil = nilai1 + nilai2;
           break;
           
           case 2:
               hasil = nilai1 - nilai2;
           break;
           case 3:
               hasil = nilai1 * nilai2;
           break;
           case 4:
               hasil = nilai1 / nilai2;
           break;
           
           default:
               System.out.println("Pilihan Salah");
           
       }
       
        System.out.println("");
        System.out.println("Hasil: "+nilai1+" + "+nilai2+" = "+hasil);
    }
    
}
