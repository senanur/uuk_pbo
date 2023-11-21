/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uuk_destalita_satya_darmanusa;
import java.util.Scanner;

public class Uuk_Destalita_Satya_Darmanusa {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
     int a, b, pilihan, hasil = 0;
     
     
     
        System.out.print("Masukan nilai pertama        :");
        a = input.nextInt();
        
        System.out.print("Masukan nilai Kedua          :");
        b = input.nextInt();
        
        
        System.out.println("Pilih operasi");
        System.out.println("1. penjumlahan");
        System.out.println("2. pengurangan");
        System.out.println("3. perkalian");
        System.out.println("4. pembagian");
        
        System.out.print("masukan pilihan 1/2/3/4   : ");
        pilihan = input.nextInt();
        
        switch (pilihan){
            case 1 : 
                hasil = a + b;
            break;
            
            case 2 : 
                hasil = a- b;
            break;
            
            case 3 : 
                hasil = a * b;
            break;
            
            case 4 : 
                hasil = a / b;
            break;
        
        }
        System.out.println("hasil      : "+ hasil); 
        
        
    }
    
}
