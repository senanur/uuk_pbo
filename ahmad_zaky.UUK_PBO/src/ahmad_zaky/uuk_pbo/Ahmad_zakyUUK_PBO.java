
package ahmad_zaky.uuk_pbo;

import java.util.Scanner;
public class Ahmad_zakyUUK_PBO {

   
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       Scanner input = new Scanner (System.in);
       int pilihan;
       int hasil;
       
       
       
        System.out.print("Masukan bilangan pertama: ");
        int angka1 = input.nextInt();
        System.out.print("Masukan bilangan kedua  : ");
        int angka2 = input.nextInt();
        
           do {
               System.out.println("==========silahkan pilih==========");
            System.out.println("1. perjumlahan:");
            System.out.println("1. pengurangan");
            System.out.println("3. perkalian");
            System.out.println("4. pembagian");
            System.out.println("5. Keluar");
            System.out.print("Masukkan pilihan (1-5): ");
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
                         System.out.println("terimakasih telah memakai kalkulator sederahana");
                    break;
            }
              
            
        
        
           
       
       
//       
           }while (pilihan != 5);
            }
    
}
