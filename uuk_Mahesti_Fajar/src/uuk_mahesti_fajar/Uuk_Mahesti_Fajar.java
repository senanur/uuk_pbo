/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uuk_mahesti_fajar;
import java.util.Scanner;
public class Uuk_Mahesti_Fajar {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int bilangan1, bilangan2, pilihan, hasil = 0;
        
        System.out.println("Masukkan Bilangan Pertama: ");
        bilangan1 = input.nextInt();
        
        System.out.println("Masukkan Bilangan Kedua: ");
        bilangan2 = input.nextInt();
        
        System.out.println("");
        
        System.out.println("Pilih Operasi: ");
        System.out.println("1. penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. pembagian");
        
        System.out.println("");
        
        System.out.println("Masukkan Pilihan(1/2/3/4) : ");
        pilihan = input.nextInt();
        
        switch (pilihan){
            case 1 : hasil = bilangan1 + bilangan2; break;
            case 2 : hasil = bilangan1 - bilangan2; break;
            case 3 : hasil = bilangan1 * bilangan2; break;
            case 4 : hasil = bilangan1 / bilangan2; break;
            default : System.out.println("Kamu Salah Memasukkan Pilihan");
        }
        
        System.out.println("");
        
        if ( pilihan == 1){
        System.out.println(bilangan1 + "+" + bilangan2 + "=" + hasil);
        }
        
        else if ( pilihan == 2) {
        System.out.println(bilangan1 + "-" + bilangan2 + "=" + hasil);
        }
        
        else if ( pilihan == 3) {
        System.out.println(bilangan1 + "x" + bilangan2 + "=" + hasil);
        }
        
        else if ( pilihan == 2) {
        System.out.println(bilangan1 + ":" + bilangan2 + "=" + hasil);
        }
        
        
    }
    
}
