/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package valen.uuk;
import java.util.Scanner;
public class ValenUuk {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       
       //Input dua bilangan dari pengguna 
       System.out.print("Masukkan bilangan pertama: ");
       double bilangan1 = scanner.nextDouble();
       
       System.out.print("Masukkan bilangan kedua: ");
       double bilangan2 = scanner.nextDouble();
       
       // Memilih operasi
       System.out.println("Pilih operasi:");
       System.out.println("1. Penjumlahan (+)");
       System.out.println("2. Pengurangan(-)");
       System.out.println("3 Perkalian(*)");
       System.out.println("4 Pembagian(/)"); 
       
       System.out.print("Masukkan nomor operasi");
       int pilihan = scanner.nextInt();
       
       double hasil = 0;
       
       // Melakukan operasi berdasarkan pilihan pengguna 
       switch (pilihan) {
           case 1:
               hasil = bilangan1 + bilangan2;
               System.out.println(bilangan1+ " + "+bilangan2+" = "+hasil);
               break;
           case 2:
               hasil = bilangan1 - bilangan2;
               System.out.println(bilangan1+ " - "+bilangan2+" = "+hasil);
               break;
           case 3:
               hasil = bilangan1 * bilangan2;
               System.out.println(bilangan1+ " * "+bilangan2+" = "+hasil);
           case 4:
               //Mmeastikan bilangan kedua tidak nol untuk pembagian
               if (bilangan2 !=0) {
                   hasil = bilangan1 / bilangan2;
                   System.out.println(bilangan1+ " / "+bilangan2+" = "+hasil);
               } else {
                   System.out.println("Error: Pembagian nol tidak diperbolehkan");
               
               }
       }
    }
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
 