package nicholasmusasuryasusanto.uuk_pbo;
import java.util.Scanner;

public class NicholasMusaSuryaSusantoUUK_PBO {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);  
        
         
         double hasil = 0;
         String pilih;
         
        
        System.out.println("|======================================|");
        System.out.println("|                                      |");
        System.out.println("|         Kalkulator Sederhana         |");
        System.out.println("|                                      |");
        System.out.println("|======================================|");
        
        System.out.print("| Masukkan Bilangan Pertama :  ");
          double  a = input.nextInt();
        System.out.print("| Masukkan Bilangan Kedua   :  ");
           double  b = input.nextInt();
        System.out.println("|======================================|");
         
        
             System.out.println("| Pilih Operasi :                      |");
             System.out.println("| 1. Penjumlahan                       |");
             System.out.println("| 2. Pengurangan                       |");
             System.out.println("| 3. Perkalian                         |");
             System.out.println("| 4. Pembagian                         |");
        
        System.out.print("| Masukkan Pilihan(1 / 2 / 3 / 4): ");
            pilih = input.next();
        System.out.println("|                                      |");
        System.out.println("|======================================|");
             
          switch (pilih){
              
             case "1" : hasil = a + b;
                 System.out.print("| "+a+ " + "+ b + " = "+ hasil+"                      |");
             break;
             case "2" : hasil = a - b;
                 System.out.println("| "+a+" - "+ b + " = "+ hasil+"                    |");
        System.out.println("|======================================|");
             break;
             case "3" : hasil = a * b;
                System.out.println("| "+a+ " * "+ b + " = "+ hasil+"                      |");
        System.out.println("|======================================|");
             break;
             case "4" : hasil = a / b;
                System.out.println("| "+a+ " / "+ b + " = "+ hasil+"                      |");
        System.out.println("|======================================|");
             break;
             default : System.out.println("| Pilihan Operator " +pilih+" tidak ada         |");
        System.out.println("|======================================|");
         }
        System.out.println("|                                      |");
        System.out.println("|======================================|");
    }
    
}
