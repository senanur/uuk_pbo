package calkulator;

import java.util.Scanner;

public class Calkulator {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      
        System.out.print("Masukkan Bilangan Pertama : ");
        int bilanganpertama = scanner.nextInt();
        
        System.out.print("Masukkan Bilangan Kedua : ");
        int bilangankedua = scanner.nextInt();
        
        System.out.println("         Pilih Operasi :       ");
        System.out.println("===============================");
        System.out.println("        1. penjumlahan         ");
        System.out.println("        2. pengurangan         ");
        System.out.println("        3. perkalian           ");
        System.out.println("        4. pembagian           ");
        System.out.println("===============================");
        System.out.print("Masukkan Pilihan (1/2/3/4) : ");
        String operator = scanner.next();
        int result = 0;
        switch (operator) {
            case "1":
                result = bilanganpertama + bilangankedua;
                System.out.println(bilanganpertama +"+" +bilangankedua+"="+result);
                break;
            case "2":
                result = bilanganpertama - bilangankedua;
                System.out.println(bilanganpertama +"-" +bilangankedua+"="+result);
                break;
            case "3":
                result = bilanganpertama * bilangankedua;
                System.out.println(bilanganpertama +"*" +bilangankedua+"="+result);
                break;
            case "4":
                result = bilanganpertama / bilangankedua;
                System.out.println(bilanganpertama +"/" +bilangankedua+"="+result);
                break;
                
        }
    }
    
}
