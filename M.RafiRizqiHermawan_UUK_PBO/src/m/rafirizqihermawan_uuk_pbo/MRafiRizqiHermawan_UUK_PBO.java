package m.rafirizqihermawan_uuk_pbo;

import java.util.Scanner;

public class MRafiRizqiHermawan_UUK_PBO {

    
    public static void main(String[] args) {
        Scanner inputUser;
        float a,b,hasil;
        String operator;

        inputUser = new Scanner(System.in);
        
        System.out.println("|=======================|");
        System.out.println("|                       |");
        System.out.println("|  Kalkulator Sederhana |");
        System.out.println("|                       |");
        System.out.println("|=======================|");
        System.out.println("");
        System.out.print("Masukkan bilangan pertama : ");
        a = inputUser.nextFloat();
        System.out.print("Masukkan bilangan kedua   : ");
        b = inputUser.nextFloat();
        System.out.println("");
        System.out.println("");
        System.out.println("Pilih operasi");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. pembagian");
        System.out.println("");
        System.out.println("");
        System.out.print("Masukkan pilihan(1/2/3/4) : ");
        operator = inputUser.next();

        switch(operator){
            case "1":
                //penjumlahan
                hasil = a + b;
                System.out.println(+ a + " + " + b + " = " + hasil );
                break;
            case "2":
                //pengurangan
                hasil = a - b;
                System.out.println(+ a + " - " + b + " = " + hasil);
                break;
            case "3":
                //perkalian
                hasil = a * b;
                System.out.println(+ a + " * " + b + " = " + hasil);
                break;
            case "4":
                //pembagian
                hasil = a / b;
                System.out.println(+ a + " : " + b + " = " + hasil);
                break;
            default:
                System.out.println("operator" + operator + "tidak ditemukan");
    }
    
}
    
}
