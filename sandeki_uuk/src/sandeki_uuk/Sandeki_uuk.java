package sandeki_uuk;
import java.util.Scanner;

public class Sandeki_uuk {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        float hasil;
        
        System.out.print("Masukkan bilangin pertama: ");
        float a = s.nextFloat();
        
        System.out.print("Masukkan bilangan kedua: ");
        float b = s.nextFloat();
        
        System.out.println("Pilih operasi:");
        System.out.println("1. Penjumlahan ");
        System.out.println("2. Pengurangan ");
        System.out.println("3. Perkalian ");
        System.out.println("4. Pembagian  ");
        System.out.println("");
        
        System.out.println("Masukkan pilihan(1/2/3/4: ");
        int pilih = s.nextInt();
        
        switch(pilih){
            case 1:
                hasil = a + b;
                System.out.println(a+" + "+b+" = "+hasil);
                break;
                
             case 2:
                hasil = a - b;
                System.out.println(a+" - "+b+" = "+hasil);
                break;
                
             case 3:
                hasil = a * b;
                System.out.println(a+" * "+b+" = "+hasil);
                break;
                
             case 4:
//                hasil = a / b;
                if(b != 0){
                    hasil = a / b;
                    System.out.println(a+" / "+b+" = "+hasil);
                }else{
                    System.out.println("Tidak bisa dibagi 0!!");
                }     
                break;
                
             default:
                 System.out.println("Pilihan Tidak Benar!!");
                 break;
        }
    }
    
}
