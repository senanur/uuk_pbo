package muhammad_firly_al_faridzi_uuk_pbo;
import java.util.Scanner;

public class Muhammad_firly_al_faridzi_UUK_PBO {

    public static void main(String[] args) {
        
        Scanner inputUser;
        float bilanganPertama, bilanganKedua, hasil, pilihan;
        char operator = 0;
        
        inputUser = new Scanner(System.in);
        
        System.out.println("<=====================================PERKALIAN=====================================>");
        System.out.println("");
        System.out.print("masukkan bilangan pertama = ");
        bilanganPertama = inputUser.nextFloat();
        System.out.print("masukkan bilangan keuda = ");
        bilanganKedua = inputUser.nextFloat();
        System.out.println("");
        System.out.println("pilih operasi :");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.println("");
        System.out.print("Masukkan pilihan(1/2/3/4): ");
        pilihan = inputUser.nextFloat();
        
        if (pilihan == 1){
            System.out.println(pilihan);
            System.out.println();
            hasil = bilanganPertama + bilanganKedua;
            System.out.println("");
            System.out.println("HASIL");
            System.out.println("");
            System.out.println(bilanganPertama + " + " + bilanganKedua + " = " + hasil);
        } else if (pilihan == 2){
            System.out.println(pilihan);
            System.out.println();
            hasil = bilanganPertama - bilanganKedua;
            System.out.println("");
            System.out.println("HASIL");
            System.out.println("");
            System.out.println(bilanganPertama + " - " + bilanganKedua + " = " + hasil);
        } else if (pilihan == 3){
            System.out.println(pilihan);
            System.out.println();
            hasil = bilanganPertama * bilanganKedua;
            System.out.println("");
            System.out.println("HASIL");
            System.out.println("");
            System.out.println(bilanganPertama + " * " + bilanganKedua + " = " + hasil);
        } else if (pilihan == 4){
            System.out.println(pilihan);
            System.out.println();
            hasil = bilanganPertama / bilanganKedua;
            System.out.println("");
            System.out.println("HASIL");
            System.out.println("");
            System.out.println(bilanganPertama + " / " + bilanganKedua + " = " + hasil);
        } else {
            System.out.println("pilihan tidak tersedia");
        }
        
        
        
        
    }
    
}
