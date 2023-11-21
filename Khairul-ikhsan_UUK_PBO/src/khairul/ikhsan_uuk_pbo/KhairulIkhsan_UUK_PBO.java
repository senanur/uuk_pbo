package khairul.ikhsan_uuk_pbo;
import  java.util.Scanner;



public class KhairulIkhsan_UUK_PBO {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        float angka1,angka2,hasil;
        int pilihan;
        
        input = new Scanner(System.in);
        System.out.print("Masukkan Bilangan Pertama : ");
        angka1 = input.nextFloat();
        
         System.out.print("Masukkan Bilangan Kedua : ");
        angka2 = input.nextFloat();
        
        System.out.println("\t");
        System.out.println("Pilih Operasi :");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.println("\t");
        System.out.print("Masukkan Pilihan(1/2/3/4): ");
        pilihan = input.nextInt();
        System.out.println("\t");
        
        switch(pilihan) {
           case 1:
           //penjumlahan
                hasil = angka1 + angka2;
                System.out.println(+angka1+ " + " +angka2+ "  = " +hasil);
                break; 
           case 2:
            //pengurangan
                hasil = angka1 - angka2;
                System.out.println(+angka1+ " - " +angka2+ " = " +hasil);
                break;
           case 3:
            //perkalian
                hasil = angka1 * angka2;
                System.out.println(+angka1+ " x " +angka2+ " = " +hasil);
                break; 
            case 4:
            //pembagian
                hasil = angka1 / angka2;
                System.out.println(+angka1+ " : " +angka2+ " = " +hasil);
                break;
           default:
               System.out.println("Pilihan " + pilihan +"  Tidak ditemukan");
               
        }
    }
    
}
