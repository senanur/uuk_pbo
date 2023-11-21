
package joanianra_uuk_pbo;

import java.util.Scanner;

public class Joanianra_uuk_pbo {


    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
       
         System.out.println("=====kalkulator joan=======");
        System.out.print("masukan bilangan pertama:");
        int n1 = s.nextInt();
        System.out.print("masukan bilangan kedua:");
        int n2 = s.nextInt();
        
        System.out.println("=============");
        System.out.println("PILIH OPERASI:");
        System.out.println("1.penjumlahan");
        System.out.println("2.pengurangan");
        System.out.println("3.perkalian");
        System.out.println("4.Pembagian");
        System.out.println("==============");
        
        System.out.print("masukan pilihan1/2/3/4:");
int penjumlahan = s.nextInt();

//switch
switch(penjumlahan){
    case 1: 
        String q = "+";
        int penjumlahn = n1 + n2;
        System.out.println(+n1+""+q+""+n2+""+"="+penjumlahn);
                break;
    case 2: 
        String r = "-";
        int pengurangan = n1 - n2;
        System.out.println(+n1+""+r+""+n2+""+"="+pengurangan);
                break;
    case 3: 
        String u = "x";
        int perkalian = n1 * n2;
        System.out.println(+n1+""+u+""+n2+""+"="+perkalian);
                break;
    case 4: 
        String i = "/";
        int pembagian = n1 / n2;
        System.out.println(+n1+""+i+""+n2+""+"="+pembagian);
                break;
                }
        
        System.out.println("terimakasih");
    }
    
}
