
package akram_fatih_uuk_pbo;
import java.util.Scanner;

public class Akram_fatih_uuk_pbo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int a,b,pil,hasil = 0;
        
        
        System.out.println("Masukan bilangan pertama");
        a = input.nextInt();
        System.out.println("Masukan bilangan kedua");
        b = input.nextInt();
        
        System.out.println("Pilih Operasi:");
        System.out.println("1.Penjumlahan");
        System.out.println("2.Pengurangan");
        System.out.println("3.Perkalian");
        System.out.println("4.Pembagian");
        
        
        System.out.println("Masukan Pilihan 1/2/3/4");
         pil = input.nextInt();
         
         
        switch (pil){
            case 1 : hasil=a+b;break;
            case 2 : hasil=a-b;break;
            case 3 : hasil=a*b;break;
            case 4 : hasil=a/b;break;
            
            
            
            
                
             
            
            
        }
        System.out.println("Hasil = "+hasil);
        
        
        
        
        
        
       
    }
    
}
