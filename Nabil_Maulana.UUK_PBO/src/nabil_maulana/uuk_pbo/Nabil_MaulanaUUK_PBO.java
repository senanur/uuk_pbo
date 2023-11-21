package nabil_maulana.uuk_pbo;
import java.util.*;

public class Nabil_MaulanaUUK_PBO {

    public static void main(String[] args) {
        
        Scanner inputUser;
        float a,b,hasil = 0;
        char operator;
        
        inputUser = new Scanner(System.in);
        
        System.out.println("========== Kalkulator Pintar ============ \n\n");
        
        System.out.print("Masukkan Nilai pertama : ");
        a = inputUser.nextFloat();
        
        System.out.print("Masukkan Nilai kedua : ");
        b = inputUser.nextFloat();
                
        System.out.println("\nPilih Operasi : \n\n+ = Penjumlahan \n- = Pengurangan \n* = Perkalian \n/ = Pembagian");
        
        System.out.print("\nMasukkan Pilihan (+.-./.*) : ");

        
        operator = inputUser.next().charAt(0);
        
        if (operator == '+'){
            // penjumlahan
            hasil = a + b;
            
        }else if (operator == '-'){
            //pengurangan
            hasil = a - b;
            
        }else if (operator == '*') {
            //perkalian
            hasil = a * b;
            
        }else if (operator == '/') {
            //pembagian
            if (b == 0) {
                System.out.println("Pembagian 0 / nol memiliki hasil yang tidak terbatas");
            } else {
                hasil = a / b;
            }
            
        }else {
            //operator tidak ditemukan
            System.out.println("Operator Tidak Ditemukan !");
        }
        
        
        System.out.println("\n\nHasil: " + a + " "  + operator + " " + b + " = " + hasil);
    }
    
}
